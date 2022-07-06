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
    <Card className="text-center">
      <Card.Header>Bienvenido</Card.Header>
      <Card.Body>
        <Card.Title>Taller BINGO</Card.Title>
        <Card.Text>
          Debera crear un usuario e iniciar sesion para acceder al juego.
        </Card.Text>
      </Card.Body>
    </Card>
  );
}

export default Home;
