import React, { useState } from "react";
import Swal from "sweetalert2";
import validator from "validator";
import { register } from "../fetch/register";
import "../css/register.css";

/**
 *
 * @returns Se retorna la funcion Creacion de contacto
 * @author Jerson Daniel Basto Gil <jdbastog@correo.udistrital.edu.co>
 */
function Register() {
  const [firstName, setFirstName] = useState("");
  const [lastName, setLastName] = useState("");
  const [username, setUsername] = useState("");
  const [password, setPassword] = useState("");
  const [Email, setEmail] = useState("");
  /**
   * Verifica la informacion enviada en el formulario
   *
   * @author Jerson Daniel Basto Gil <jdbastog@correo.udistrital.edu.co>
   */
  const sendInfo = () => {
    if (firstName === "" || firstName === null) {
      Swal.fire({
        icon: "error",
        title: "Oops...",
        text: "Los nombres del usuario no puede ir vacio",
      });
    } else if (lastName === "" || lastName === null) {
      Swal.fire({
        icon: "error",
        title: "Oops...",
        text: "Los apellidos del usuario no puede ir vacio",
      });
    } else if (Email === "" || Email === null || !validator.isEmail(Email)) {
      Swal.fire({
        icon: "error",
        title: "Oops...",
        text: "Por favor digite un email valido",
      });
    } else if (username === "" || username === null) {
      Swal.fire({
        icon: "error",
        title: "Oops...",
        text: "El username del usuario no puede ir vacio",
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
            firstName: firstName,
            lastName: lastName,
            username: username,
            password: password,
            email: Email,
          };
          register(data);
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
      <div id="form-create">
        <div id="input">
          <input
            onChange={(e) => setFirstName(e.target.value)}
            type="text"
            required="required"
          ></input>
          <span>Nombres</span>
        </div>
        <div id="input">
          <input
            onChange={(e) => setLastName(e.target.value)}
            type="text"
            required="required"
          ></input>
          <span>Apellidos</span>
        </div>
        <div id="input">
          <input
            onChange={(e) => setUsername(e.target.value)}
            type="text"
            required="required"
          ></input>
          <span>Username</span>
        </div>
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
export default Register;
