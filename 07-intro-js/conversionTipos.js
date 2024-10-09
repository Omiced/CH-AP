let textToNumber = "123";
let textToInteger = "15asdasd15asd";
let textToFloat ="13.1416ahasdjkhasd";
let textToBoolean = "Hola CH";
let booleanToString = false;

console.log("String to Number");
console.log(typeof textToNumber);
console.log(typeof Number(textToNumber));

console.log("------------ String to int -------------");
console.log(textToInteger);
console.log(typeof textToInteger);
console.log(parseInt(textToInteger));
console.log(typeof parseInt(textToInteger));


console.log("------------ String to float -------------");
console.log(textToFloat);
console.log(typeof textToFloat);
console.log(parseFloat(textToFloat));
textToFloat = parseFloat(textToFloat);
console.log(textToFloat);
console.log(typeof textToFloat);
console.log(parseInt(parseFloat(textToFloat)));

console.log("------------ String to boolean -------------");
console.log(textToBoolean);
console.log(typeof textToBoolean);
console.log(Boolean(textToBoolean));
console.log(typeof Boolean(textToBoolean));
/* 
  Para strings mientras no sea una cadena vacia regresa true
  Prara numbers si no es 0 regresa true
  undefined y null regresan false
*/
console.log(Boolean(NaN));

console.log(Number(undefined));



