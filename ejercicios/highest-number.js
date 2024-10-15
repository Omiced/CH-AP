/*
  Highest number
Write a program that asks for 10 numbers in array. 
Using logical operators and any other javascript functions/structures you've seen before, 
determine and output the highest of those numbers.
1. 10 números 🐲
  1.a asegurarnos que sean números🐲
 2. compararlos
 2.1 usar un if
 2.2 hacer un bucle
 2.3 almacenar el mayor en una variable 
3. determinar el más grande
4. Mostrar el número mas grande
*/

/*
  function nombreFuncipn(){} declaration
  const nombreFuncion = function(){} expression
  const nombreFunction = () => {} arrow
  */
/* Solución uno
  function findHighestNumber(){
      let numbers = [];
      for(let i = 0; i < 10; i++){
        let numberInput = Number(prompt("Ingresa el valor a comparar #" + (i +1)));
        if(!isNaN(numberInput)){
          numbers.push(numberInput);
        }else{
          console.log("Ingrese un número válido");
          i--;
        }
      }
      console.log(numbers)
      console.log(Math.max(...numbers));
  }

  */
  function findHighestNumber(){
    let highest = -Infinity;
    for(let i = 0; i < 10; i++){
      let numberInput = Number(prompt("Ingresa el valor a comparar #" + (i +1)));
      console.log(numberInput);
      if(!isNaN(numberInput)){
          if(numberInput > highest){
            highest = numberInput;
          }else{
            highest = highest;
          }
      }else{
        console.log("Ingrese un número válido");
        i--;
      }
    }
    console.log(highest);
}

  findHighestNumber();