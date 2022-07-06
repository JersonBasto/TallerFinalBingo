import React from "react";
import "../css/header.css";
/**
 * Es el Header que se muestra en la pagina.
 * 
 * @returns Retorna la funcion Header
 * @author Jerson Daniel Basto Gil <jdbastog@correo.udistrital.edu.co>
 */
function Header() {
  const register = () => {
    window.location.href = "/register";
  };
  const home = () => {
    window.location.href = "/";
  };
  const login = () => {
    window.location.href = "/login";
  };
  return (
    <nav id="header" bg="light" expand="lg">
      <p onClick={home} id="tittle">
        Taller Sofka
      </p>
      <div id="container-Header">
        <button id="botonHeader" onClick={login}>
          Iniciar Sesion
        </button>
        <button id="botonHeader" onClick={register}>
          Registrarse
        </button>
      </div>
    </nav>
  );
}
export default Header;
