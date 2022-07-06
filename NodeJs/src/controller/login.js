const dbMongo = require("./connectDB");
const bcrypt = require("bcrypt");
const jwt = require("jsonwebtoken");

module.exports = {
  /**
   * Verifica los datos para iniciar sesion
   *
   * @param {*} req Recibe los datos enviados por el FrontEnd
   * @param {*} res Respuesta enviada al FrontEnd
   * @author Jerson Daniel Basto Gil <jdbastog@correo.udistrital.edu.co>
   */
  login: async (req, res) => {
    let db;
    let user;
    let searchemail;
    let searchpassword;
    let email;
    let password;
    let token;
    try {
      user = req.body;
      email = req.body.email;
      password = req.body.password;
      db = await dbMongo();

      searchemail = await db.collection("users").findOne({ email: email });

      if (searchemail == null) {
        res.json({ mensaje: "El usuario no existe!", login: false });
      } else {
        searchpassword = await bcrypt.compare(
          req.body.password,
          searchemail.password
        );
        if (!searchpassword) {
          res.json({ mensaje: "Contraseña no valida!", login: false });
        } else {
          token = jwt.sign(
            {
              firstName: searchemail.firstName,
              username: searchemail.username,
              id: searchemail._id,
              email: searchemail.email,
            },
            process.env.TOKEN_SECRET,
            { expiresIn: "60m" }
          );
          res.json({
            mensaje: "Bienvenido " + searchemail.firstName,
            token: token,
            login: true,
          });
        }
      }
    } catch (error) {
      console.log(error);
    }
  },
};
