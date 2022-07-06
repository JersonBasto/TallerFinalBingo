const jwt = require("jsonwebtoken");

module.exports = {
  /**
   * Obtiene los datos del usuario
   * 
   * @param {*} req Recibe el body por parte del FrontEnd
   * @param {*} res Respuesta enviada al FrontEnd
   * @author Jerson Daniel Basto Gil <jdbastog@correo.udistrital.edu.co>
   */
  getUser: async (req, res) => {
    let firstName;
    let username;
    let token = req.body.token;
    try {
      const verificar = jwt.verify(token, process.env.TOKEN_SECRET);
      firstName = verificar.firstName;
      username = verificar.username;
      id = verificar.id;
      email = verificar.email;
      res.send({
        username,
        firstName,
        id,
        email,
        mensaje: "Bienvenido al taller de Sofka BINGO",
        validate: true,
      });
    } catch (error) {
      console.log(error);
      res.send({ mensaje: "Ha expirado el Token", validate: false });
    }
  },
};
