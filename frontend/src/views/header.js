import React, { useEffect, useState } from "react";
import "../css/header.css";
import { validateToken } from "../fetch/validarToken";
/**
 * Es el Header que se muestra en la pagina.
 *
 * @returns Retorna la funcion Header
 * @author Jerson Daniel Basto Gil <jdbastog@correo.udistrital.edu.co>
 */
function Header() {
  const [loginUser, setLogin] = useState(false);
  const register = () => {
    window.location.href = "/register";
  };
  const home = () => {
    window.location.href = "/";
  };
  const login = () => {
    window.location.href = "/login";
  };
  const validar = async () => {
    var user = await validateToken({
      token: localStorage.getItem("token_user"),
    });
    setLogin(user.validate);
    console.log(loginUser);
  };
  useEffect(() => {
    validar();
  });
  const logout = () => {
    localStorage.setItem("token_user", "");
    window.location.href = "/";
  };
  return (
    <nav id="header" bg="light" expand="lg">
      <p onClick={home} id="tittle">
        Taller Sofka
      </p>
      <div id="container-Header">
        {!loginUser && (
          <button id="botonHeader" onClick={login}>
            Iniciar Sesion
          </button>
        )}
        {!loginUser && (
          <button id="botonHeader" onClick={register}>
            Registrarse
          </button>
        )}
        {loginUser && <button id="logout" onClick={logout}>
          Logout
        </button>}
      </div>
    </nav>
  );
}
export default Header;
