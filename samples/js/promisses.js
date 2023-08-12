const aceitar = false;

const promessa = new Promise((resolve, reject) => {
  if(aceitar) {
    return resolve("pedido aceito")
  }

  return reject("corrida rejeitada")
})

promessa
  .then((result) => console.log(result))
  .catch((error) => console.log(error))
  .finally(() => console.log("Aplicativo utilizado"))