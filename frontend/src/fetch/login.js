import Swal from "sweetalert2";
/**
 * Valida si el usuario puede hacer login
 * 
 * @param {*} varJson Json con los datos para determinar sy el usuario puede hacer login
 */
export const login = async (varJson) => {
  await fetch("http://localhost:4000/user/loginUser", {
    method: "POST",
    headers: { "Content-Type": "application/json" },
    body: JSON.stringify(varJson),
  }).then(async (response) => {
    console.log(response);
    if (response.ok) {
      var resJson = await response.json();
      if (resJson.login) {
        localStorage.setItem("token_user",resJson.token)
        Swal.fire({
          icon: "success",
          text: resJson.mensaje,
        }).then((result) => {
          if (result.isConfirmed) {
            window.location.href = "./bingo";
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
