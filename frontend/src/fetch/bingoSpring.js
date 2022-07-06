/**
 * Solictud para crear el Bingo en el BackEnd
 * 
 * @param {*} varJson Llega la variable Json a enviar en el fetch
 * @returns Returna la respuesta
 */
export const bingoSpring = async (varJson) => {
  var resJson;
  await fetch("http://localhost:9090/createBingo", {
    method: "POST",
    headers: { "Content-Type": "application/json" },
    body: JSON.stringify(varJson),
  }).then(async (response) => {
    if (response.ok) {
      resJson = await response.json();
    }
  });
  return resJson;
};
