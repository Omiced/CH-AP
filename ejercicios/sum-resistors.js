/*
Sum of Resistors in Series
 

Calculate the sum of all resistors connected in series.
Examples:
- `sumResitance([-1,5,6,3])` should return `"15 ohms"`. (|−1| + 5 + 6 + 3 = 15)
- `sumResitance([14,3.5,6])` should return `'23.5 ohms'`. (14 + 3.5 + 6 = 23.5)
- `sumResitance([8,15,100])` should return `'123 ohms'`. (8 + 15 + 100 = 123)

Note: This approach uses the absolute value of each resistance to ensure all values are positive.

1.Entrada un array de números (resistencias)
2. This approach uses the absolute value of each resistance to ensure all values are positive.
3. Guardar la suma de las resistencias en una variable llamada ohms🐲
4. Crear un loop para recorrer el array y sumar sus valores🐲
5. Si el valor es negativo convertirlo a positivo (multiplicar x -1 o usar Math.abs())🐲
6. Sumar los valores eh ir guardando la suma en la variable ohms🐲
7. Salida retornar la variable ohms 🐲
*/
// solución entre todos
const sumResistance = function(resistors){
  let ohms = 0;
  resistors.forEach(resistor => {
    if(resistor < 0){
      ohms = ohms + (resistor * -1);
    }else{
      ohms = ohms + resistor;
    }
  });
  return ohms;
}

console.log(sumResistance([-1,5,6,3]) + " ohms");
console.log(sumResistance([14,3.5,6]) + " ohms");
console.log(sumResistance([8,15,100]) + " ohms");

//Solución propuesta por josue
const sumResistance2 = function(resistors){
 return resistors.reduce((ohms,resistor)=> {
  if(resistor < 0){
    return ohms + (resistor * -1);
  }else{
    return ohms + resistor;
  }
 }, 0)
}

console.log(sumResistance2([-1,5,6,3]) + " ohms");
console.log(sumResistance2([14,3.5,6]) + " ohms");
console.log(sumResistance2([8,15,100]) + " ohms");
// Solución de Karla
function sumResistance3(resistances) {
 const totalResistance = resistances.reduce(
     (sum, resistance) => sum + Math.abs(resistance),
     0);
 return `${totalResistance} ohms`;
}