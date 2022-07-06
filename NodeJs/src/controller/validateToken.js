module.exports = {
  /**
   * Verifica que exista un Token en el parametro de envio
   * 
   * @param {*} req body enviado por FrontEnd
   * @param {*} res respuesta enviada al FrontEnd
   * @param {*} next Si existe un Token pasa a la siguiente funcion
   * @author Jerson Daniel Basto Gil <jdbastog@correo.udistrital.edu.co>
   */
  validateToken: (req, res, next) => {
    let token = req.body.token;
    if (!token || token == "") {
      res.send({ mensaje: "No tiene acceso a la pagina", validate: false });
    } else {
      next();
    }
  },
};
