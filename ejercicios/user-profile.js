/*
User profile
Write a program that prompts a user for 
their data: username, age, and a list of their favorite movies. 
Store the information and then showcase it in the console. 
Take note that the output for the films should add a small message like: 
'The film {film} is one of my favorites'.
1. Entrada del programa es username,age, list of the favorite movies.
2. Prompt username, age, movies
3. Hacer consts username, age, movies
4. Perdile al usuario que ingrese las peliculas separadas por comas
5. Peliculas ingresan como string
6. con for y push sería con varios prompts
  6b. split()

7.Mostrar en consola Salida The film {film} is one of my favorites' 
, Mostrar username y age en la consola.
*/


const userName = prompt("Ingresa tu nombre");
const age = prompt("Ingresa tu edad");
const movies = prompt("Ingresa una lista de tus películas favoritas, cada peli separada por una coma");
// const arrayMoviesReplace = movies.replaceAll(" ","").split(",");
/*una opción para convertir a array limpiar espacios en cada peli o puede ser un foreach, es lo mismo que el de abajo pero en uun paso
const arrayMovies = movies.split(",").map((movie,index, arr) => {
  // console.log(index);
  // console.log(arr)
  return movie.trim();
}); */

const arrayMovies = movies.split(",");
const arrayMoviesNoSpaces = arrayMovies.map((movie,index, arr) => {
  // console.log(index);
  // console.log(arr)
  return movie.trim();
});
// console.log(arrayMoviesReplace);
/* Hi my name is username, I age, The film {film} is one of my favorites*/
// salida primera opción concatenación
console.log("Hi my name is " + userName + " I'am " + age + " years old, The film " + arrayMoviesNoSpaces[1] + " is one of my favorites");
// string interpolation
console.log(`Hi my names is ${userName} I'am ${age} years old, The film ${arrayMoviesNoSpaces[1]} is one of my favorites`);