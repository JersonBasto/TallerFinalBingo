/**
 * Busca el bingo por id
 * 
 * @param {*} id envia el id del bingo que se quiere obtener
 * @returns Retorna respuesta al obtener bingo
 */
export const getBingo = async (id) => {
  var resJson;
  await fetch("http://localhost:9090/getbingo/" + id, {
    method: "GET",
    headers: { "Content-Type": "application/json" }
  }).then(async (response) => {
    if (response.ok) {
      resJson = await response.json();
    }
  });
  return resJson;
};
