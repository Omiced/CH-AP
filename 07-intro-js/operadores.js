// console.log("suma");
// console.log(1 + 1);
// console.log("resta");
// console.log((3 - 1) * (2 + 4));
// console.log("multiplicación");
// console.log(3 * 3);
// console.log("división");
// console.log(-4 / 0);
// console.log("modulo o resto");
// console.log(44 % 3);
// console.log("exponentes");
// console.log(2 ** 7 );

//operadores lógicos

/*
  and (&&)regresa true solo si los dos 
  lados de la comparación son true si 
  no refresa false

  or (||) regresa true si almenos uno de los dos lados 
  es verdadero, si los dos lados son false regresa false

  not ! niega lo que tengamos
  not true = false
  not false = true

  falsy values quiere decir que al ser evaluados en una condición
  booleana son considerados false
  0
  undefined
  null
  ""

  truthy values son valores evaluados como true en una condición 
  booleana
  strings que no sean una cadena vacia
  numeros que no sean 0
  [] incluso vacios
  {} incluso vacios
*/ 

console.log("Pruebas and");
console.log(false  && true );
console.log(true && true );
console.log(false && false );
console.log(true && false);

console.log(true && 1 );
console.log(undefined &&  "Neri");

console.log("Pruebas Or");

console.log(false || true);
console.log(true || false);
console.log(false || false);

console.log(4 || 2 );
console.log("" || "Jorge");
console.log("Martha" || "Carlos");
console.log(null || "Muriel");
console.log(undefined || "Brandon")
console.log("Flor" || undefined);
console.log("José Manuel Lara" || null);
console.log(undefined || null);

console.log("pruebas not");

console.log(!"Teresa");
console.log(!false);
console.log(!true);
console.log(!!true);

console.log("nullish");
console.log( undefined ?? 42);