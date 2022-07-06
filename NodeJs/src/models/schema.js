const Joi = require("@hapi/joi");
module.exports = {
  /**
   * Esquema para usar en la creacion del usuario
   * @author Jerson Daniel Basto Gil <jdbastog@correo.udistrital.edu.co>
   */
  schemaUser: Joi.object({
    firstName: Joi.string().required().min(2).max(255),
    lastName: Joi.string().required().min(2).max(255),
    username:Joi.string().required().min(6).max(255),
    email: Joi.string().email().min(6).max(255).required(),
    password: Joi.string().required().min(6).max(255),
  }),
  /**
   * Esquema a usar en la actualizacion del usuario
   * @author Jerson Daniel Basto Gil <jdbastog@correo.udistrital.edu.co>
   */
  schemaUpdatUser: Joi.object({
    firstName: Joi.string().required().min(6).max(255),
    lastName: Joi.string().required().min(6).max(255),
  }),
  /**
   * Esquema usado para realizar el login del usuario.
   * @author Jerson Daniel Basto Gil <jdbastog@correo.udistrital.edu.co>
   */
  schemaLogin: Joi.object({
    email: Joi.string().email().min(6).max(255).required(),
    password: Joi.string().required().min(6).max(255),
  }),
};
