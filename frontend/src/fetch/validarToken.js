import Swal from "sweetalert2";
/**
 * Valida si el Token se puede usar.
 * 
 * @param {*} token Recibe el Token del usuario
 * @param {*} res 
 * @returns Respuesta del BackEnd
 */
export const validateToken = async (token) => {
  var resJson;
  if (token === null || token === "") {
    Swal.fire({
      icon: "error",
      text: "No ha iniciado Session",
    });
    window.location.href = "./login";
  } else {
    await fetch("http://localhost:4000/user/getUser", {
      method: "POST",
      headers: { "Content-Type": "application/json" },
      body: JSON.stringify(token),
    }).then(async (response) => {
      if (response.ok) {
        resJson = await response.json();
      }
    });
  }
  return resJson;
};
