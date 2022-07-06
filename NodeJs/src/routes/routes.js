const router = require("express").Router();
const {
  schemaUser,
  schemaUpdatUser,
  schemaLogin,
} = require("../models/schema");
const validateSchema = require("../models/validate");
const { createUser } = require("../controller/createUser");
const { login } = require("../controller/login");
const { getUser } = require("../controller/getUser");
const {validateToken} = require("../controller/validateToken");
/**
 * Recibe todas las rutas que se van a manejar desde el BackEnd
 */
router.put("/createUser", validateSchema(schemaUser), createUser);
router.post("/loginUser", validateSchema(schemaLogin), login);
router.post("/getUser", validateToken, getUser);

module.exports = router;
