console.log("voy antes de la función wait")
const waitNSeconds = (miliseconds) => {
  console.log("Esperando " + miliseconds + " milisegundos");
  return new Promise((resolve,reject) => {
    //inicializamos el timeout
    setTimeout(() =>{
      const success = false;
      if(success){
        resolve("La petición fue exitosa");
      }else{
        reject("La petición fallo ");
      }
    },miliseconds)
  })
}

waitNSeconds(6000).then(function(res){
  console.log(res);
}).catch((error) => {
  console.log(error);
});

console.log("Voy despues de la función wait");
console.log("Voy despues de la función wait 2");
console.log("Voy despues de la función wait 3");
console.log("Voy despues de la función wait 4");