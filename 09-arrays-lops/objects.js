const info = {
  "nombre p": "Josue",
  apellido: "Cano",
  edad: 30,
  isAlive: true,
  favoriteAnimals: ["tortuga", "capibara", "cheeta"],
  suma: (a,b) => a + b,  //método
  direccion: {
    calle: "alegria siempre viva ",
    numero: "123",
    cp: 55764
  }
}
const cosas = {};

/*notación de punto para obtener los valores de nuestro objeto
console.log(info.apellido);
console.log(info.edad);
console.log(info.favoriteAnimals[1]);
info.apellido = "Villalobos";
console.log(info);
info.favoriteSong = "navigate";
console.log(info);
//eliminar llave de un objeto
delete info.edad;
console.log(info);
//usar un método de un objeto
console.log(info.suma(2,4));
//eliminar un método de un objeto
delete info.suma;
console.log(info);
console.log(info.direccion.numero);
console.log(info["nombre p"]);
//The Object.entries() static method returns an array of a 
//given object's own enumerable string-keyed property key-value pairs.
console.log(Object.entries(info));
//obtener solo un array de puras llaves
console.log(Object.keys(info));
//obtener un array con los valores del objeto 
console.log(Object.values(info));
*/
//destructuring en objetos, es necesario usar el mismo nombre que tiene la llave, no importa el orden
const {isAlive, edad, apellido} = info;
console.log(apellido);
console.log(isAlive);
console.log(edad);
//destructuring en arrays, se crean variables nuevas con nombres nuevos, y si siguen un orden de asignación
const nombres = ["Jorge", "Cesar", "Neri", "Roberto"];
const [nombre2, nombre1,...nombresNuevo] = nombres;
const [,,nombre3,nombre4] = nombres;
console.log(nombre1);
console.log(nombre2);
console.log(nombresNuevo);
console.log(nombre3);
console.log(nombre4);

// const {direccion} = info;
const {calle, cp} = info.direccion;
// console.log(direccion);
console.log(calle);
console.log(cp);
