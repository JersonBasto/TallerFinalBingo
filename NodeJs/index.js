const express = require("express");
const cors = require("cors");
const http = require("http");
const { Server } = require("socket.io");
const bodyparser = require("body-parser");
const app = express();

const server = http.createServer(app);

const io = new Server(server, {
  cors: {
    origin: "*",
    credentials: true,
    optionsSuccessStatus: 200,
  },
});

var corsOptions = {
  credentials: true,
  origin: "*", // Reemplazar con dominio
  optionsSuccessStatus: 200, // some legacy browsers (IE11, various SmartTVs) choke on 204
};

app.use(function (req, res, next) {
  res.header("Access-Control-Allow-Origin", "*");
  res.header(
    "Access-Control-Allow-Methods",
    "GET,HEAD,OPTIONS,POST,PUT,DELETE"
  );
  res.header(
    "Access-Control-Allow-Headers",
    "Origin, X-Requested-With, Content-Type, Accept, Authorization"
  );
  next();
});

require("dotenv").config();
const port = process.env.port || 4000;

app.use(bodyparser.urlencoded({ extended: false }));
app.use(bodyparser.json());

const routes = require("./src/routes/routes");
const { number } = require("joi");
app.use("/user", routes);
app.use(cors(corsOptions));

app.get("/", (req, res) => {
  res.send("Bienvenidos");
});

var players = [];
var room = 1;
var start = false;
var myInterval;

io.on("connection", (socket) => {
  console.log("Usuario conectado: " + socket.id);
  socket.on("send_user", (data) => {
    if (players.length == 0) {
      players.push(data.username);
      socket.join(room);
    } else if (players.length == 1) {
      players.push(data.username);
      socket.join(room);
      io.sockets.in(room).emit("join", room, true);
      room += 1;
      players = [];
      start = true;
    } else {
      socket.emit("full", room, true);
    }
    console.log(socket.rooms);
    socket.emit("socketID", socket.id);
  });
  socket.on("disconnect", function () {
    console.log("Got disconnect!", socket.id);
    clearInterval(myInterval);
  });
  socket.on("start", (data) => {
    console.log("El juego va iniciar", data);
  });
  socket.on("initgame", (clientRoom) => {
    var numbersBalota = [];
    myInterval = setInterval(randonBalota, 10000);
    function randonBalota() {
      let num = Math.floor(Math.random() * (76 - 1)) + 1;
      if (!numbersBalota.includes(num)) {
        numbersBalota.push(num);
        let orden = numbersBalota.sort(function (a, b) {
          return a - b;
        });
        io.to(clientRoom).emit("juegoInicia", num);
      } else {
        if (numbersBalota.length < 75) {
          randonBalota();
        } else {
          io.to(clientRoom).emit(
            "juegoInicia",
            "Ya se enviaron Todas las balotas"
          );
          clearInterval(myInterval);
        }
      }
    }
  });
  socket.on("endGame", (clientRoom) => {
    io.to(clientRoom).emit("winner");
    socket.broadcast.emit("loser");
    clearInterval(myInterval);
  });
});

server.listen(port, () => {
  console.log("Servidor escuchado en el puerto " + port);
});
