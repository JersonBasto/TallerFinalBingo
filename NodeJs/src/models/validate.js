const Joi = require("@hapi/joi");
/**
 * Valida la informacion dada en el esquema
 * 
 * @param {*} schema Recibe un esquema
 * @returns En caso de haber un error retorna el error en un json
 * @author Jerson Daniel Basto Gil <jdbastog@correo.udistrital.edu.co>
 */
module.exports = (schema) => {
  return (req, res, next) => {
    const { error } = schema.validate(req.body);
    if (error) {
      res.send({ error: error.details[0].message });
    } else {
      next();
    }
  };
};
