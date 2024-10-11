//function declaration
console.log(greeting("Josue"));
console.log(greeting("Martha"));
function greeting(nombre){
  
  return `Hola ${nombre } mucho gusto`;
}

console.log(greeting("Muriel"));
console.log(greeting("Irving"));
console.log(greeting("Hyan"));


//function expresion
const esMayorDeEdad = function(age){
  if(age >= 18){
    console.log("esto esta en el if")
    return "Ya eres mayor de edad";
  }else if(age > 0 && age < 18){
    return "Aún no eres mayor de edad";
  }
  return "No haz nacido";
}//llave de cierre
console.log(esMayorDeEdad(18));




console.log("---------------------------");
console.log(esMayorDeEdad(2));
console.log("---------------------------");
console.log(esMayorDeEdad(0));

//Arrow function
const hola = () => "hola";

console.log(hola());

const isEven = (number) => number % 2 === 0 ?"es par" : "no es par";

console.log(isEven(2));
console.log(isEven(5));
console.log(isEven(4));
console.log(isEven(3));

/*
1. Function celciusToFaren
2. Parametros solo uno celcius
3. retornar el valor de grados en farenhait

Formula
Grados Fahrenheit = (grados centígrados × 9/5) +32.

*/

/*
  1. function descuento
  2. parametro tipo number dineroPagado
  3. Gasto menos o igual a $200 no se aplica descuento
  4. 201 a 500 descuento del 10%
  5. 501 1000 descuento del 20%
  6. 1001  > infinito descuento 30%
  5. valor de retorno cuanto va a pagar el usuario con el descuento aplicado
 */