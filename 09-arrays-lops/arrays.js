// console.log(nombres[0]);
// console.log(nombres[1]);
// console.log(nombres[2]);
// console.log(nombres[3]);
// console.log(nombres[4]);
// console.log(nombres);
// //accediendo a arrays anidados
// console.log(nombres[4][0]);
// console.log(nombres[4][1]);
// //conocer el tamaño de un array
// console.log(nombres.length);
// console.log(nums.length);
// //modificar valores
// nombres[0] = "Neri";
// console.log(nombres[0]);
// nombres[2] = 25;
// console.log(nombres[2]);
// nombres[4][0] = "Muriel";
// console.log(nombres[4][0]);
// console.log(nombres[4][1]);
// console.log(nombres);
// console.log(nombres[4], nombres[2]);

// console.log(nombres[4]);
// console.log(nombres[4][0]);
// console.log(nombres[4][1]);
//Agregar valores
//agrega valores al final del array
// nombres.push("Karla");
// nombres.push("Tania");
// console.log(nombres);
// console.log(nombres.slice(2,6));
// const arrayNoms = nombres.slice(4);
// console.log(arrayNoms);
// nombres[4].push("Cesar");
// console.log(nombres[4]);
//agregar valores al incio del array
// console.log(nombres.unshift("Jesús", "Oscar"));
// console.log(nombres);

//eliminar valores
//eliminar todos los elementos
// nombres.length = 0;
// console.log(nombres);
// console.log(nombres.length)
//eliminar ultimo elemento y retornarlo
// console.log(nombres.pop());
// console.log(nombres);
// console.log(nombres.pop());
// console.log(nombres);
// console.log(nombres.pop());
// console.log(nombres);
//eliminar primer elemento
// console.log(nombres.shift());
// console.log(nombres);
// console.log(nombres.shift());
// console.log(nombres);
//probando pass by reference o pass by value
// const nombres = ["Jorge", "Cesar", 23, true,
//   ["Lee", "Irving", [12,3,4,  ["Marth" ]]]
//  ];

//  let nombre = "jorge";
//  let copiaNombre = nombre;
//  console.log(nombre)
//  console.log(copiaNombre);
//  copiaNombre = "Irving";
//  console.log(copiaNombre);
//  console.log(nombre);

//  const copiaNombres = nombres; 
//  console.log(nombres)
//  console.log(copiaNombres);
//  copiaNombres[0] = "Josue";
//  console.log(copiaNombres);
// console.log(nombres);
// //rest operator
// function suma(...numeros){
//   return numeros.reduce((acc,num) => acc + num,0);
// }

// console.log(suma(1,2,3,4,5,6,7,8));
//spread operator
// const nombresCopia = [...nombres];
// nombresCopia[0] = "Carlos";
// console.log(nombresCopia);
// console.log(nombres);

//map
// const numeros = [2,3,7,10,23,24,28,18,26,25];
// const nombres = ["Jorge", "Cesar", "Neri", "Roberto"];
// const nombresMayus = nombres.map(nombre => nombre.toUpperCase());
// const numerosPorDos =  numeros.map((numero, index) => {
//   // console.log(index);
//   let numeroMultiplicado = numero * 2;
//   let numeroSumado = numeroMultiplicado  +1;
//   return numeroSumado;
// } );
// console.log(numeros);
// console.log(numerosPorDos);
// console.log(nombresMayus);
// //filter
// const pares = numeros.filter(numero => numero % 2 === 0)
// .filter(par => par > 24).map(n => n * 2);
// console.log(pares);
// const nombre = nombres.filter(nombre => nombre === "Neri" );
// console.log(nombre);
// const nombresFiltrados = 
//   nombres.filter(nombre => nombre.includes("o") );
// console.log(nombresFiltrados);
// const nombresFiltradosLength = 
//   nombres.filter(nombre => {
//     return nombre.length > 4 && nombre !== "Roberto"; 
//   });
// console.log(nombresFiltradosLength);
// //karla
// const filtered = numeros.filter(num => {
//   if (num % 2 === 0 && num > 10) {
//     return true;
//   }
//   return false;
// });
// //carlos
// const result2 = numeros.filter((numero) => (numero %2 === 0 && numero <10) ? true : false);
// //Brandon
// const filtered2 = numeros.filter(num => num % 2 === 0 && num > 10);

// const evenOrOdd = numeros.filter(numero => numero % 2 !== 0);
// console.log(evenOrOdd);
// console.log(filtered)
// console.log(result2)

const numeros = [2,3,7,10,23,24,28,18,26,25];
const nombres = ["Jorge", "Cesar", "Neri", "Roberto"];
/*revertir arreglos
const numeroR = numeros.reverse();
console.log("numerosR", numeroR);
console.log("numeros", numeros);
const nombresR = nombres.reverse();
console.log("nombresR", nombresR);
console.log("nombres", nombres);

const numerosToR = numeros.toReversed();
console.log("numerosToR",numerosToR);
console.log("numeros", numeros);
const nombresToR = nombres.toReversed();
console.log("nombresToR", nombresToR);
console.log("nombres", nombres);
*/


/* obtener elementos del array con .at() *

console.log(numeros.at(-1));
console.log(numeros.at(-2));
console.log(numeros.at(-3));
console.log(numeros.at(-4));
console.log(nombres.at(2));
console.log(nombres.at(2));
console.log(nombres.at(1));
console.log(nombres.at(0));

*/

const arrayUnido = nombres.join();
console.log(arrayUnido);
console.log(typeof arrayUnido);
//concat se usa para unir 2 arrays
const nomNums = numeros.concat(nombres);
console.log(nomNums)
console.log(nomNums.join())