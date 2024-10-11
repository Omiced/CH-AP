/*
operadores de comparación
== compara si algo es igual a algo
=== compara si algo es igual a algo pero también compara el tipo de dato comparación estricta
>< mayor y menor que
>= <= mayor igual que
!= diferente de
*/



// codigo para ver una porción de codigo inalcanzable
// if(true){
//   console.log("Hola martha");
// }else{
//   console.log("Adios martha");
// }

/*
1. Pedirle con prompt al usuario que ingrese su calificación
2.- pedirle 3 calificaciones diferentes, sacar el promedio
3. evaluar y decirle si reprobo o aprobo
*/
const number = 2;

let numDay = prompt("Ingrese el número de un día");
const array = ["Jorge", "Martha"];
array[2] = "Josue";
console.log(array);

switch(Number(numDay)){
  case 1:
    console.log("Lunes");
    break
  case 2: 
    console.log("Martes");
    break;
  case 3: 
    console.log("Miercoles");
    break;
  case 4: 
    console.log("Jueves");
    break;
  case 5: 
    console.log("Viernes");
    break;
  case 6: 
    console.log("Sabado");
    break;
  case 7: 
    console.log("Domingo");
    break;
  default: 
    console.log("no existe ese día");
}

// let weekDay = prompt("Ingrese el día de la semana");
// weekDay = weekDay.toLowerCase();

//  switch(weekDay){
//    case "lunes":
//      console.log(1);
//      break;
//    case "martes": 
//      console.log(2);
//     break;
//    case "miercoles":
//      console.log(3);
//      break;
//    case "jueves": 
//     console.log(4);
//      break;
//    case "viernes": 
//      console.log(5);
//      break;
//    case "sabado": 
//      console.log(6);
//      break;
//    case "domingo": 
//      console.log(7);
//      break;
//    default: 
//      console.log("no existe ese día");
// }

/* 
1. convertir el if que tenemos abajo a switch
2. solo vamos a considerar del caso 5 al 10
3. default tu calificacion no puede ser evaluada
*/
const calificacion = 10;

if(calificacion <= 5){
  console.log("Reprobaste F");
}
else if(calificacion > 5 && calificacion <= 8 ){
  console.log("Aprobaste felicidades");
}
else if(calificacion > 8 && calificacion <= 10){
  console.log("aprobaste con la calificación mas mejor");
}
else{
  console.log("esa calificacion no existe");
}