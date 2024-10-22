// import de un export normal
import {Animales,suma} from "./Animales.js"
//import de un export default
import multiplicar from "./Animales.js";

//cuando extiende es una subclase
class Perro extends Animales{
  duenio;
  raza;
  dientesFiloso;
  correa;
  color;
  espolones;
  pelo;
  constructor(patas,tamanio,especie, edad, nombre, cola, sonidos,duenio,raza,dientesFiloso,correa,color,espolones,pelo){
    //super apunta a las propiedades de la super clase
    super(patas,tamanio,especie, edad, nombre, cola, sonidos);
    this.duenio = duenio;
    this.raza = raza;
    this.dientesFiloso = dientesFiloso;
    this.correa = correa;
    this.color = color;
    this.espolones = espolones;
    this.pelo = pelo;
  }
  //getters y setters
  // Getter and Setter for duenio
  get duenio() {
    return this.duenio;
  }

  set duenio(value) {
    this.duenio = value;
  }

  // Getter and Setter for raza
  get raza() {
    return this.raza;
  }

  set raza(value) {
    this.raza = value;
  }

  // Getter and Setter for dientesFiloso
  get dientesFiloso() {
    return this.dientesFiloso;
  }

  set dientesFiloso(value) {
    this.dientesFiloso = value;
  }

  // Getter and Setter for correa
  get correa() {
    return this.correa;
  }

  set correa(value) {
    this.correa = value;
  }

  // Getter and Setter for color
  get color() {
    return this.color;
  }

  set color(value) {
    this.color = value;
  }

  // Getter and Setter for espolones
  get espolones() {
    return this.espolones;
  }

  set espolones(value) {
    this.espolones = value;
  }

  // Getter and Setter for pelo
  get pelo() {
    return this.pelo;
  }

  set pelo(value) {
    this.pelo = value;
  }

  //sobreescribir un método
  getAllProperties(){
    return `Hola soy ${this.duenio} y mi perro se llama ${this.getNombre}, tiene el pelo ${this.pelo} y de color ${this.color}, es de la raza ${this.raza} 100% fake no real, ${this.espolones? "si": "no"} tiene espolones, ${this.dientesFiloso? "si": "no"} tiene dientes filosos 
    `
  }
  
}

//constructor(patas,tamanio,especie, edad, nombre, cola, sonidos,duenio,raza,dientesFiloso,correa,color,espolones,pelo)
const nala = new Perro(4, 70, "perro", 10, "nala", true, "ladridos",
  "Martha", "French", false, "pechera", "blanco", false, "chino"
 );

 const salsita = new Perro(4, 70, "perro", 10, "salsita", false, "ladridos",
  "Jorge", "criolla", false, true, "negro", true, "corto"
 );
 const chofris = new Perro(4, 35, "perro", 3, "chofris", true, "ladridos",
  "Romina", "salchicha", true, true, "cafecito", true, "corto"
 );
 const tomas = new Perro(4, 115, "perro", 2, "tomas", true, "ladridos",
  "Muriel", "black lab", true, "pechera", "negro", true, "corto"
 );
 const pulgas = new Perro(4, 110, "perro", 7, "pulgas", true, "ladridos",
  "Lee", "pastor belga", true, "pechera", "beige", true, "mediano"
 );
console.log(nala.getAllProperties());
console.log(salsita.getAllProperties());
console.log(chofris.getAllProperties());
console.log(tomas.getAllProperties());
console.log(pulgas.getAllProperties());
console.log(suma(2,2));
console.log(multiplicar(3,7))