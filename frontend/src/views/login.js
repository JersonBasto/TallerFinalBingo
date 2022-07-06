import React, { useState } from "react";
import Swal from "sweetalert2";
import validator from "validator";
import "../css/login.css";
import { login } from "../fetch/login";

/**
 *
 * @returns Se retorna la funcion Creacion de contacto
 * @author Jerson Daniel Basto Gil <jdbastog@correo.udistrital.edu.co>
 */
function Login() {
  const [password, setPassword] = useState("");
  const [Email, setEmail] = useState("");
  /**
   * Verifica la informacion enviada en el formulario
   *
   * @author Jerson Daniel Basto Gil <jdbastog@correo.udistrital.edu.co>
   */
  const sendInfo = () => {
    if (Email === "" || Email === null || !validator.isEmail(Email)) {
      Swal.fire({
        icon: "error",
        title: "Oops...",
        text: "Por favor digite un email valido",
      });
    } else if (password === "" || password === null) {
      Swal.fire({
        icon: "error",
        title: "Oops...",
        text: "El password del usuario no puede ir vacio",
      });
    } else {
      Swal.fire({
        title: "¿Esta seguro?",
        text: "¿ Quiere enviar los datos?",
        icon: "warning",
        showCancelButton: true,
        confirmButtonColor: "#3085d6",
        cancelButtonColor: "#d33",
        confirmButtonText: "Si, enviar!",
      }).then((result) => {
        if (result.isConfirmed) {
          Swal.fire("Enviado!", "Los datos han sido enviado.", "success");
          const data = {
            password: password,
            email: Email,
          };
          login(data);
        }
      });
    }
  };
  /**
   * Retorna el codigo HTML
   * @author Jerson Daniel Basto Gil <jdbastog@correo.udistrital.edu.co>
   */
  return (
    <div id="containerG">
      <div id="form-createLogin">
        <div id="input">
          <input
            onChange={(e) => setEmail(e.target.value)}
            type="text"
            required="required"
          ></input>
          <span>Email</span>
        </div>
        <div id="input">
          <input
            onChange={(e) => setPassword(e.target.value)}
            type="password"
            required="required"
          ></input>
          <span>Password</span>
        </div>
        <button id="Send" onClick={sendInfo}>
          Enviar
        </button>
      </div>
    </div>
  );
}
export default Login;
