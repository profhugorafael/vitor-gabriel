const https = require('https')

const aceitar = false;

const promessa = new Promise((resolve, reject) => {
  if(aceitar) {
    return resolve("pedido aceito")
  }

  return reject("corrida rejeitada")
})

promessa
  .then((result) => console.log(`Result ${result}`))
  .catch((error) => console.log(error))
  .finally(() => console.log("Aplicativo utilizado"))

https
  .get('https://api.github.com/users/hgrafa', response => console.log(response.statusCode))
  // .catch(error => console.log(error))
