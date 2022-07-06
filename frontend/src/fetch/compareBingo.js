/**
 * Compara tarjetones de Bingo para determinar ganador.
 * 
 * @param {*} varJson Envia el bingo creado en el FrontEnd para comparar
 * @param {*} id Envia el id del bingo a identificar
 * @returns Respuesta Booelana
 */
export const compareBingo = async (varJson, id) => {
  var resJson;
  await fetch("http://localhost:9090/newBingo/" + id, {
    method: "POST",
    headers: { "Content-Type": "application/json" },
    body: JSON.stringify(varJson),
  }).then(async (response) => {
    if (response.ok) {
      console.log(response);
      resJson = await response.json();
    }
  });
  return resJson;
};
