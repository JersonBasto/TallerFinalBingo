import React from "react";
import { Card } from "react-bootstrap";
/**
 * Se imprime la pagina home de inicio
 *
 * @returns Retorna la funcion Home
 * @author Jerson Daniel Basto Gil <jdbastog@correo.udistrital.edu.co>
 */
function Home() {
  return (
    <div className="text-center">
      <h1>Bienvenido</h1>
      <div>
        <h3>Taller BINGO</h3>
        <h4>
          Debera crear un usuario e iniciar sesion para acceder al juego.
        </h4>
      </div>
    </div>
  );
}

export default Home;
