import io from "socket.io-client";
import React, { useState, useEffect } from "react";
import { validateToken } from "../fetch/validarToken";
import "../css/bingo.css";
import { bingoSpring } from "../fetch/bingoSpring";
import { getBingo } from "../fetch/getBingo";
import cardBingo from "../clasess/cardBingo";
import Swal from "sweetalert2";
import { compareBingo } from "../fetch/compareBingo";

const socket = io.connect("http://localhost:4000/");
/**
 *
 * Se crea la pagina bingo donde el usuario puede observar y jugar bingo con otra persona.
 *
 * @returns Retorna la funcion Bingo que se va mostrar en el HTML
 * @author Jerson Daniel Basto Gil <jdbastog@correo.udistrital.edu.co>
 */
function Bingo() {
  var resJson;
  var varJson;
  var start;
  var idBingo;
  var balota;
  var res;
  let clientRoom;
  let cardB = new cardBingo();
  console.log(cardB.jsonCargBingo());
  /**
   * Mediante el socket.io emite una solictud al BackEnd para obtener los usuarios.
   *
   * @param {*} res Recibe una variable a enviar
   * @author Jerson Daniel Basto Gil <jdbastog@correo.udistrital.edu.co>
   */
  const getUsers = (res) => {
    socket.emit("send_user", { username: res.username });
  };
  /**
   * Valida el token dentro del navegador.
   * @author Jerson Daniel Basto Gil <jdbastog@correo.udistrital.edu.co>
   */
  const validar = async () => {
    res = await validateToken({ token: localStorage.getItem("token_user") });
    getUsers(res);
    const welcome = document.getElementById("welcome");
    welcome.innerText = "Bienvenido " + res.username;
  };
  /**
   * Crea el bingo
   *
   * @param {*} data Recibe el SocketID, que se envia al BackEnd para crear el bingo
   * @author Jerson Daniel Basto Gil <jdbastog@correo.udistrital.edu.co>
   */
  const crearBingo = async (data) => {
    resJson = await bingoSpring({ idSocket: data });
    idBingo = resJson.id;
    varJson = await getBingo(resJson.id);
    //FILA B
    const b0 = document.getElementById("b0");
    const b1 = document.getElementById("b1");
    const b2 = document.getElementById("b2");
    const b3 = document.getElementById("b3");
    const b4 = document.getElementById("b4");
    b0.innerHTML = varJson.filaB[0].b0;
    b1.innerHTML = varJson.filaB[0].b1;
    b2.innerHTML = varJson.filaB[0].b2;
    b3.innerHTML = varJson.filaB[0].b3;
    b4.innerHTML = varJson.filaB[0].b4;
    b0.addEventListener("click", () => {
      if (parseInt(b0.innerText) === balota) {
        b0.style.background = "green";
        cardB.setB0(parseInt(b0.innerText));
      } else {
        Swal.fire({
          icon: "error",
          text: "Los numeros no son iguales",
        });
      }
    });
    b1.addEventListener("click", () => {
      if (parseInt(b1.innerText) === balota) {
        b1.style.background = "green";
        cardB.setB1(parseInt(b1.innerText));
      } else {
        Swal.fire({
          icon: "error",
          text: "Los numeros no son iguales",
        });
      }
    });
    b2.addEventListener("click", () => {
      if (parseInt(b2.innerText) === balota) {
        b2.style.background = "green";
        cardB.setB2(parseInt(b2.innerText));
      } else {
        Swal.fire({
          icon: "error",
          text: "Los numeros no son iguales",
        });
      }
    });
    b3.addEventListener("click", () => {
      if (parseInt(b3.innerText) === balota) {
        b3.style.background = "green";
        cardB.setB3(parseInt(b3.innerText));
      } else {
        Swal.fire({
          icon: "error",
          text: "Los numeros no son iguales",
        });
      }
    });
    b4.addEventListener("click", () => {
      if (parseInt(b4.innerText) === balota) {
        b4.style.background = "green";
        cardB.setB4(parseInt(b4.innerText));
      } else {
        Swal.fire({
          icon: "error",
          text: "Los numeros no son iguales",
        });
      }
    });
    //FILA I
    const i0 = document.getElementById("i0");
    const i1 = document.getElementById("i1");
    const i2 = document.getElementById("i2");
    const i3 = document.getElementById("i3");
    const i4 = document.getElementById("i4");
    i0.innerHTML = varJson.filaI[0].i0;
    i1.innerHTML = varJson.filaI[0].i1;
    i2.innerHTML = varJson.filaI[0].i2;
    i3.innerHTML = varJson.filaI[0].i3;
    i4.innerHTML = varJson.filaI[0].i4;
    i0.addEventListener("click", () => {
      if (parseInt(i0.innerText) === balota) {
        i0.style.background = "green";
        cardB.setI0(parseInt(i0.innerText));
      } else {
        Swal.fire({
          icon: "error",
          text: "Los numeros no son iguales",
        });
      }
    });
    i1.addEventListener("click", () => {
      if (parseInt(i1.innerText) === balota) {
        i1.style.background = "green";
        cardB.setI1(parseInt(i1.innerText));
      } else {
        Swal.fire({
          icon: "error",
          text: "Los numeros no son iguales",
        });
      }
    });
    i2.addEventListener("click", () => {
      if (parseInt(i2.innerText) === balota) {
        i2.style.background = "green";
        cardB.setI2(parseInt(i2.innerText));
      } else {
        Swal.fire({
          icon: "error",
          text: "Los numeros no son iguales",
        });
      }
    });
    i3.addEventListener("click", () => {
      if (parseInt(i3.innerText) === balota) {
        i3.style.background = "green";
        cardB.setI3(parseInt(i3.innerText));
      } else {
        Swal.fire({
          icon: "error",
          text: "Los numeros no son iguales",
        });
      }
    });
    i4.addEventListener("click", () => {
      if (parseInt(i4.innerText) === balota) {
        i4.style.background = "green";
        cardB.setI4(parseInt(i4.innerText));
      } else {
        Swal.fire({
          icon: "error",
          text: "Los numeros no son iguales",
        });
      }
    });
    //FILA N
    const n0 = document.getElementById("n0");
    const n1 = document.getElementById("n1");
    const n2 = document.getElementById("n2");
    const n3 = document.getElementById("n3");
    const n4 = document.getElementById("n4");
    n0.innerHTML = varJson.filaN[0].n0;
    n1.innerHTML = varJson.filaN[0].n1;
    n2.innerHTML = "X";
    n3.innerHTML = varJson.filaN[0].n3;
    n4.innerHTML = varJson.filaN[0].n4;
    n0.addEventListener("click", () => {
      if (parseInt(n0.innerText) === balota) {
        n0.style.background = "green";
        cardB.setN0(parseInt(n0.innerText));
      } else {
        Swal.fire({
          icon: "error",
          text: "Los numeros no son iguales",
        });
      }
    });
    n1.addEventListener("click", () => {
      if (parseInt(n1.innerText) === balota) {
        n1.style.background = "green";
        cardB.setN1(parseInt(n1.innerText));
      } else {
        Swal.fire({
          icon: "error",
          text: "Los numeros no son iguales",
        });
      }
    });
    n2.addEventListener("click", () => {
      if (parseInt(n2.innerText) === balota) {
        n2.style.background = "green";
        cardB.setN2(parseInt(n2.innerText));
      } else {
        Swal.fire({
          icon: "error",
          text: "Los numeros no son iguales",
        });
      }
    });
    n3.addEventListener("click", () => {
      if (parseInt(n3.innerText) === balota) {
        n3.style.background = "green";
        cardB.setN3(parseInt(n3.innerText));
      } else {
        Swal.fire({
          icon: "error",
          text: "Los numeros no son iguales",
        });
      }
    });
    n4.addEventListener("click", () => {
      if (parseInt(n4.innerText) === balota) {
        n4.style.background = "green";
        cardB.setN4(parseInt(n4.innerText));
      } else {
        Swal.fire({
          icon: "error",
          text: "Los numeros no son iguales",
        });
      }
    });
    //FILA G
    const g0 = document.getElementById("g0");
    const g1 = document.getElementById("g1");
    const g2 = document.getElementById("g2");
    const g3 = document.getElementById("g3");
    const g4 = document.getElementById("g4");
    g0.innerHTML = varJson.filaG[0].g0;
    g1.innerHTML = varJson.filaG[0].g1;
    g2.innerHTML = varJson.filaG[0].g2;
    g3.innerHTML = varJson.filaG[0].g3;
    g4.innerHTML = varJson.filaG[0].g4;
    g0.addEventListener("click", () => {
      if (parseInt(g0.innerText) === balota) {
        g0.style.background = "green";
        cardB.setG0(parseInt(g0.innerText));
      } else {
        Swal.fire({
          icon: "error",
          text: "Los numeros no son iguales",
        });
      }
    });
    g1.addEventListener("click", () => {
      if (parseInt(g1.innerText) === balota) {
        g1.style.background = "green";
        cardB.setG1(parseInt(g1.innerText));
      } else {
        Swal.fire({
          icon: "error",
          text: "Los numeros no son iguales",
        });
      }
    });
    g2.addEventListener("click", () => {
      if (parseInt(g2.innerText) === balota) {
        g2.style.background = "green";
        cardB.setG2(parseInt(g2.innerText));
      } else {
        Swal.fire({
          icon: "error",
          text: "Los numeros no son iguales",
        });
      }
    });
    g3.addEventListener("click", () => {
      if (parseInt(g3.innerText) === balota) {
        g3.style.background = "green";
        cardB.setG3(parseInt(g3.innerText));
      } else {
        Swal.fire({
          icon: "error",
          text: "Los numeros no son iguales",
        });
      }
    });
    g4.addEventListener("click", () => {
      if (parseInt(g4.innerText) === balota) {
        g4.style.background = "green";
        cardB.setG4(parseInt(g4.innerText));
      } else {
        Swal.fire({
          icon: "error",
          text: "Los numeros no son iguales",
        });
      }
    });
    //FILA O
    const o0 = document.getElementById("o0");
    const o1 = document.getElementById("o1");
    const o2 = document.getElementById("o2");
    const o3 = document.getElementById("o3");
    const o4 = document.getElementById("o4");
    o0.innerHTML = varJson.filaO[0].o0;
    o1.innerHTML = varJson.filaO[0].o1;
    o2.innerHTML = varJson.filaO[0].o2;
    o3.innerHTML = varJson.filaO[0].o3;
    o4.innerHTML = varJson.filaO[0].o4;
    o0.addEventListener("click", () => {
      if (parseInt(o0.innerText) === balota) {
        o0.style.background = "green";
        cardB.setO0(parseInt(o0.innerText));
      } else {
        Swal.fire({
          icon: "error",
          text: "Los numeros no son iguales",
        });
      }
    });
    o1.addEventListener("click", () => {
      if (parseInt(o1.innerText) === balota) {
        o1.style.background = "green";
        cardB.setO1(parseInt(o1.innerText));
      } else {
        Swal.fire({
          icon: "error",
          text: "Los numeros no son iguales",
        });
      }
    });
    o2.addEventListener("click", () => {
      if (parseInt(o2.innerText) === balota) {
        o2.style.background = "green";
        cardB.setO2(parseInt(o2.innerText));
      } else {
        Swal.fire({
          icon: "error",
          text: "Los numeros no son iguales",
        });
      }
    });
    o3.addEventListener("click", () => {
      if (parseInt(o3.innerText) === balota) {
        o3.style.background = "green";
        cardB.setO3(parseInt(o3.innerText));
      } else {
        Swal.fire({
          icon: "error",
          text: "Los numeros no son iguales",
        });
      }
    });
    o4.addEventListener("click", () => {
      if (parseInt(o4.innerText) === balota) {
        o4.style.background = "green";
        cardB.setO4(parseInt(o4.innerText));
      } else {
        Swal.fire({
          icon: "error",
          text: "Los numeros no son iguales",
        });
      }
    });
  };
  /**
   * Ejecuta la funcion Validar al cargar la pagina.
   * @author Jerson Daniel Basto Gil <jdbastog@correo.udistrital.edu.co>
   */
  useEffect(() => {
    validar();
  }, []);
  /**
   * Ejecuta todas las funciones creadas a partir del socket.io cada vez que se hace una solictud por Socket
   * @author Jerson Daniel Basto Gil <jdbastog@correo.udistrital.edu.co>
   */
  useEffect(() => {
    socket.on("socketID", (data) => {
      crearBingo(data);
    });
    socket.on("join", (room, state) => {
      clientRoom = room;
      if (state) {
        start = state;
        const roomStay = document.getElementById("roomStay");
        roomStay.innerHTML = "Se encuentra en la sala " + room;
        socket.emit("start", state);
        const startGame = document.getElementById("startGame");
        startGame.style.visibility = "visible";
        startGame.innerText = "Iniciar Bingo";
      }
    });
    socket.on("juegoInicia", (data) => {
      balota = data;
      const startGame = document.getElementById("startGame");
      startGame.style.visibility = "hidden";
      const numberBalota = document.getElementById("numberBalota");
      numberBalota.innerText = data;
      const numberBalotas = document.getElementById(data);
      numberBalotas.style.backgroundColor = "green";
      numberBalotas.style.background =
        "radial-gradient(at top left, #0F0 20%, #040)";
    });
    socket.on("winner", () => {
      Swal.fire({
        icon: "success",
        text: "Y hay un ganador",
      });
    });
    socket.on("loser", () => {
      Swal.fire({
        icon: "warning",
        text: "Usted no ha ganado",
      });
    });
  }, [socket]);
  /**
   * Envia la variable Room para emitir un mensaje a todos los integrantes del room en el bakcend
   * indicando que el juego inicia
   * 
   * @author Jerson Daniel Basto Gil <jdbastog@correo.udistrital.edu.co>
   */
  const enviarRoom = () => {
    console.log("Se hizo click");
    const startGame = document.getElementById("startGame");
    startGame.style.visibility = "hidden";
    socket.emit("initgame", clientRoom);
  };
  /**
   * Envia una solictud al BackEnd por medio de socket que determine si es el ganador.
   * 
   * @author Jerson Daniel Basto Gil <jdbastog@correo.udistrital.edu.co>
   */
  const winner = async () => {
    var resCompare = await compareBingo(cardB.jsonCargBingo(), idBingo);
    console.log(resCompare);
    if (resCompare) {
      socket.emit("endGame", clientRoom, socket.id);
    } else {
      Swal.fire({
        icon: "error",
        text: "No cumple las condiciones para ganar",
      });
    }
  };
  /**
   * HTML a mostrar
   * @author Jerson Daniel Basto Gil <jdbastog@correo.udistrital.edu.co>
   */
  return (
    <div>
      <div id="userInfo">
        <p id="welcome"></p>
        <p id="roomStay"></p>
      </div>
      <div id="containerBingo">
        <table id="balotas">
          <tr>
            <td id="bingo">B</td>
            <td id="1" style={{ background: "rgb(227, 142, 51)" }}>
              1
            </td>
            <td id="2" style={{ background: "rgb(227, 142, 51)" }}>
              2
            </td>
            <td id="3" style={{ background: "rgb(227, 142, 51)" }}>
              3
            </td>
            <td id="4" style={{ background: "rgb(227, 142, 51)" }}>
              4
            </td>
            <td id="5" style={{ background: "rgb(227, 142, 51)" }}>
              5
            </td>
            <td id="6" style={{ background: "rgb(227, 142, 51)" }}>
              6
            </td>
            <td id="7" style={{ background: "rgb(227, 142, 51)" }}>
              7
            </td>
            <td id="8" style={{ background: "rgb(227, 142, 51)" }}>
              8
            </td>
            <td id="9" style={{ background: "rgb(227, 142, 51)" }}>
              9
            </td>
            <td id="10" style={{ background: "rgb(227, 142, 51)" }}>
              10
            </td>
            <td id="11" style={{ background: "rgb(227, 142, 51)" }}>
              11
            </td>
            <td id="12" style={{ background: "rgb(227, 142, 51)" }}>
              12
            </td>
            <td id="13" style={{ background: "rgb(227, 142, 51)" }}>
              13
            </td>
            <td id="14" style={{ background: "rgb(227, 142, 51)" }}>
              14
            </td>
            <td id="15" style={{ background: "rgb(227, 142, 51)" }}>
              15
            </td>
          </tr>
          <tr>
            <td id="bingo">I</td>
            <td id="16" style={{ background: "rgb(227, 142, 51)" }}>
              16
            </td>
            <td id="17" style={{ background: "rgb(227, 142, 51)" }}>
              17
            </td>
            <td id="18" style={{ background: "rgb(227, 142, 51)" }}>
              18
            </td>
            <td id="19" style={{ background: "rgb(227, 142, 51)" }}>
              19
            </td>
            <td id="20" style={{ background: "rgb(227, 142, 51)" }}>
              20
            </td>
            <td id="21" style={{ background: "rgb(227, 142, 51)" }}>
              21
            </td>
            <td id="22" style={{ background: "rgb(227, 142, 51)" }}>
              22
            </td>
            <td id="23" style={{ background: "rgb(227, 142, 51)" }}>
              23
            </td>
            <td id="24" style={{ background: "rgb(227, 142, 51)" }}>
              24
            </td>
            <td id="25" style={{ background: "rgb(227, 142, 51)" }}>
              25
            </td>
            <td id="26" style={{ background: "rgb(227, 142, 51)" }}>
              26
            </td>
            <td id="27" style={{ background: "rgb(227, 142, 51)" }}>
              27
            </td>
            <td id="28" style={{ background: "rgb(227, 142, 51)" }}>
              28
            </td>
            <td id="29" style={{ background: "rgb(227, 142, 51)" }}>
              29
            </td>
            <td id="30" style={{ background: "rgb(227, 142, 51)" }}>
              30
            </td>
          </tr>
          <tr>
            <td id="bingo">N</td>
            <td id="31" style={{ background: "rgb(227, 142, 51)" }}>
              31
            </td>
            <td id="32" style={{ background: "rgb(227, 142, 51)" }}>
              32
            </td>
            <td id="33" style={{ background: "rgb(227, 142, 51)" }}>
              33
            </td>
            <td id="34" style={{ background: "rgb(227, 142, 51)" }}>
              34
            </td>
            <td id="35" style={{ background: "rgb(227, 142, 51)" }}>
              35
            </td>
            <td id="36" style={{ background: "rgb(227, 142, 51)" }}>
              36
            </td>
            <td id="37" style={{ background: "rgb(227, 142, 51)" }}>
              37
            </td>
            <td id="38" style={{ background: "rgb(227, 142, 51)" }}>
              38
            </td>
            <td id="39" style={{ background: "rgb(227, 142, 51)" }}>
              39
            </td>
            <td id="40" style={{ background: "rgb(227, 142, 51)" }}>
              40
            </td>
            <td id="41" style={{ background: "rgb(227, 142, 51)" }}>
              41
            </td>
            <td id="42" style={{ background: "rgb(227, 142, 51)" }}>
              42
            </td>
            <td id="43" style={{ background: "rgb(227, 142, 51)" }}>
              43
            </td>
            <td id="44" style={{ background: "rgb(227, 142, 51)" }}>
              44
            </td>
            <td id="45" style={{ background: "rgb(227, 142, 51)" }}>
              45
            </td>
          </tr>
          <tr>
            <td id="bingo">G</td>
            <td id="46" style={{ background: "rgb(227, 142, 51)" }}>
              46
            </td>
            <td id="47" style={{ background: "rgb(227, 142, 51)" }}>
              47
            </td>
            <td id="48" style={{ background: "rgb(227, 142, 51)" }}>
              48
            </td>
            <td id="49" style={{ background: "rgb(227, 142, 51)" }}>
              49
            </td>
            <td id="50" style={{ background: "rgb(227, 142, 51)" }}>
              50
            </td>
            <td id="51" style={{ background: "rgb(227, 142, 51)" }}>
              51
            </td>
            <td id="52" style={{ background: "rgb(227, 142, 51)" }}>
              52
            </td>
            <td id="53" style={{ background: "rgb(227, 142, 51)" }}>
              53
            </td>
            <td id="54" style={{ background: "rgb(227, 142, 51)" }}>
              54
            </td>
            <td id="55" style={{ background: "rgb(227, 142, 51)" }}>
              55
            </td>
            <td id="56" style={{ background: "rgb(227, 142, 51)" }}>
              56
            </td>
            <td id="57" style={{ background: "rgb(227, 142, 51)" }}>
              57
            </td>
            <td id="58" style={{ background: "rgb(227, 142, 51)" }}>
              58
            </td>
            <td id="59" style={{ background: "rgb(227, 142, 51)" }}>
              59
            </td>
            <td id="60" style={{ background: "rgb(227, 142, 51)" }}>
              60
            </td>
          </tr>
          <tr>
            <td id="bingo">O</td>
            <td id="61" style={{ background: "rgb(227, 142, 51)" }}>
              61
            </td>
            <td id="62" style={{ background: "rgb(227, 142, 51)" }}>
              62
            </td>
            <td id="63" style={{ background: "rgb(227, 142, 51)" }}>
              63
            </td>
            <td id="64" style={{ background: "rgb(227, 142, 51)" }}>
              64
            </td>
            <td id="65" style={{ background: "rgb(227, 142, 51)" }}>
              65
            </td>
            <td id="66" style={{ background: "rgb(227, 142, 51)" }}>
              66
            </td>
            <td id="67" style={{ background: "rgb(227, 142, 51)" }}>
              67
            </td>
            <td id="68" style={{ background: "rgb(227, 142, 51)" }}>
              68
            </td>
            <td id="69" style={{ background: "rgb(227, 142, 51)" }}>
              69
            </td>
            <td id="70" style={{ background: "rgb(227, 142, 51)" }}>
              70
            </td>
            <td id="71" style={{ background: "rgb(227, 142, 51)" }}>
              71
            </td>
            <td id="72" style={{ background: "rgb(227, 142, 51)" }}>
              72
            </td>
            <td id="73" style={{ background: "rgb(227, 142, 51)" }}>
              73
            </td>
            <td id="74" style={{ background: "rgb(227, 142, 51)" }}>
              74
            </td>
            <td id="75" style={{ background: "rgb(227, 142, 51)" }}>
              75
            </td>
          </tr>
        </table>
        <table id="carton">
          <tr>
            <td id="bingo">B</td>
            <td id="bingo">I</td>
            <td id="bingo">N</td>
            <td id="bingo">G</td>
            <td id="bingo">O</td>
          </tr>

          <tr>
            <td id="b0"></td>
            <td id="i0"></td>
            <td id="n0"></td>
            <td id="g0"></td>
            <td id="o0"></td>
          </tr>
          <tr>
            <td id="b1"></td>
            <td id="i1"></td>
            <td id="n1"></td>
            <td id="g1"></td>
            <td id="o1"></td>
          </tr>
          <tr>
            <td id="b2"></td>
            <td id="i2"></td>
            <td id="n2"></td>
            <td id="g2"></td>
            <td id="o2"></td>
          </tr>
          <tr>
            <td id="b3"></td>
            <td id="i3"></td>
            <td id="n3"></td>
            <td id="g3"></td>
            <td id="o3"></td>
          </tr>
          <tr>
            <td id="b4"></td>
            <td id="i4"></td>
            <td id="n4"></td>
            <td id="g4"></td>
            <td id="o4"></td>
          </tr>
        </table>
        <div>
          <p id="numberBalota"></p>
          <button id="winner" onClick={winner}>
            {" "}
            Gane con Bingo
          </button>
        </div>
      </div>
      <button id="startGame" onClick={enviarRoom}></button>
    </div>
  );
}
export default Bingo;
