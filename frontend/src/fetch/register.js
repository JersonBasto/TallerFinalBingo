import Swal from "sweetalert2";
/**
 * Registra el usuario
 * 
 * @param {*} varJson Datos para registrar al usuario
 */
export const register = async (varJson) => {
  await fetch("http://localhost:4000/user/createUser", {
    method: "PUT",
    headers: { "Content-Type": "application/json" },
    body: JSON.stringify(varJson),
  }).then(async (response) => {
    console.log(response);
    if (response.ok) {
      var resJson = await response.json();
      if (resJson.create) {
        Swal.fire({
          icon: "success",
          text: "Usuario creado, por favor inicie sesion!",
        }).then((result) => {
          if (result.isConfirmed) {
            window.location.href = "./login";
          }
        });
      } else {
        Swal.fire({
          icon: "error",
          text: resJson.mensaje,
        });
      }
    }
  });
};
