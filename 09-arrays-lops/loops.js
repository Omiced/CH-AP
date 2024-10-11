const nombres = ["Jorge", "Cesar", "Neri", "Roberto"];
const numeros = [2,3,7,10,23,24,28,18,26,25];

let count = -1;
/*while
while(count < nombres.length){
  // count = count + 1;
  console.log(nombres[count]);
  count++; //suma 1 al valor de la variable
  // break;
  //count+=1; suma uno al valor de la variable  y lo reasigna a la misma variable
}

while(true){
  
  if(nombres[count].length >= 7){
    break; //rompe la ejecución del bucle
  }else if(nombres[count].length <5){
    count++;
    continue;//detiene la ejecución del código abajo del continue y se regresa al inicio del bucle
  }else{
    console.log(nombres[count]);
  }
  count++;
}
console.log("Josue".length);*/


/*do while
do{
  console.log(nombres[count]);
  count++;
  console.log(count);
}while(count < nombres.length)


do{
  count++;
  if(nombres[count].length >= 7){
        break; //rompe la ejecución del bucle
      }else if(nombres[count].length <5){
        // count++;
        continue;//detiene la ejecución del código abajo del continue y se regresa al inicio del bucle
      }else{
        console.log(nombres[count]);
      }
}while(true)

  console.log("no esoty en bucle")*/


/*for*

for(let i = 0; i < nombres.length; i++){
  console.log("valor del contador i: " + i);
  for(let j = 0; j < nombres.length - 1 ; j++){
    console.log("valor del contador j:  " + j );
  }
  console.log(nombres[i]);
}


for(let i = 0; i < nombres.length; i++){
  console.log(nombres[i])
  console.log("valor actual del contador: " + i);
}
*/

/* for each*/
nombres.forEach((nombre, index, array) =>{
  console.log(nombres[index+3]);
  console.log({nombre});
  console.log(array);
});

numeros.forEach((num,i) => {
  console.log(num + numeros[i+1]);
})

/* 
  1. funcion que se llame evenOrOdd 
  2. como parametro un array de n numeros
  3. Recorrer el array 
  4. Mostrar en consola si el numero del indice actual es par o impar

*/

console.log("Hola como estan\nBuen viernes");