// const objectText = {
//   name: "Josue",
//   edad: 30,
//   cumple: "21 de noviembre",
//   mascotas:true,
// };
// const plainTextObject = JSON.stringify(objectText);
// ///
// // setTimeout(() =>{
// //   console.log("setTimeaout")
// // },2000)
// // waitNSeconds(10000).then(function(res){
// //   console.log(res);
// // }).catch((error) => {
// //   console.log(error);
// // });
// // // console.log(plainTextObject);
// // // console.log(JSON.parse(plainTextObject));
// // console.log("Yo voy primero");
// function waitNSeconds(miliseconds) {
//   return new Promise((resolve,reject) => {
//     //inicializamos el timeout
//     setTimeout(() =>{
//       const success = true;
//       if(success){
//         resolve("La petición fue exitosa");
//       }else{
//         reject("La petición fallo ");
//       }
//     },miliseconds)
//   })
// }
// // console.log("yo voy cuarto");
// // waitNSeconds(1).then(function(res){
// //   console.log("yo soy la segunda function async")
// //   console.log(res);
// // }).catch((error) => {
// //   console.log(error);
// // });

// const managePromise = async function(promise) {
//   try{
//     const response = await promise;
//     console.log(response)
//   }catch(error){
//     console.log("Error", error)
//   }

// }
// managePromise(waitNSeconds());
const nombre = "123.2318za97321Jorge2317321";
//no convierte ni cachos de numeros en cadenas , solo cadenas que tengan puros valores númericos
console.log(Number(nombre));
//convierte cachos de numeros pero solo al inicio y hasta encontrar caracteres no númericos 
console.log(parseInt(nombre)); 
//convierte incluso cadenas con texto, y empieza donde cuentra numero sigue si encuentra un punto y termina hasta encontrar otro caracter no númerico
console.log(parseFloat(nombre))
//
console.log(Boolean(nombre));
console.log(Boolean(NaN));
console.log(Boolean(0));
console.log(Boolean(1));
console.log(Boolean(undefined))
console.log(Boolean("undefined"))
console.log(Boolean(Infinity))
console.log(Boolean(-Infinity))
console.log(Boolean(null))
console.log(Boolean([]))
console.log(Boolean({}))