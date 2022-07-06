const dbMongo = require("./connectDB");
const bcrypt = require("bcrypt");

module.exports = {
  /**
   * Este modulo se encarga de crear el usuario y guardarlo en la base de datos
   * @param {*} req Es el body que recibe desde el FrontEnd
   * @param {*} res Es la respuesta enviada al FrontEnd
   * @author Jerson Daniel Basto Gil <jdbastog@correo.udistrital.edu.co>
   *
   */
  createUser: async (req, res) => {
    console.log(req.body);
    let db;
    let user;
    let password;
    try {
      db = await dbMongo();
      user = req.body;
      password = req.body.password;
      const saltos = await bcrypt.genSalt(10);
      const passwordcrypt = await bcrypt.hash(password, saltos);
      searchusername = await db
        .collection("users")
        .findOne({ username: req.body.username });
      searchEmail = await db
        .collection("users")
        .findOne({ email: req.body.email });
      if (searchusername == null && searchEmail == null) {
        user.password = passwordcrypt;
        usuario = await db.collection("users").insertOne(user);
        res.json({ mensaje: "Usuario Creado", create: true });
      } else {
        if (searchusername != null) {
          res.json({ mensaje: "Username ya esta registrado ", create: false });
        } else if (searchEmail != null) {
          res.json({ mensaje: "El email ya esta registrado ", create: false });
        }
      }
    } catch (error) {
      console.log(error);
    }
  },
};
