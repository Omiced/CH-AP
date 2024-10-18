"useStrict";
class Animales{
  //variables de instancia
  patas = 4;
  tamanio = 2;
  especie;
  edad;
  nombre;
  cola;
  sonidos;
  //método constructor
  constructor(patas,tamanio,especie, edad, nombre, cola, sonidos){
    this.patas = patas;
    this.tamanio = tamanio;
    this.especie = especie;
    this.edad = edad;
    this.nombre = nombre;
    this.cola = cola;
    this.sonidos = sonidos;
  }
  //setters y getters estos se aplican solo a las propiedades(variables de instancia) de la clase 
  set setNombre(nuevoNombre){
    this.nombre = nuevoNombre;
  }

  get getNombre(){
    return this.nombre;
  }
  set setPatas(nuevoPatas){
    this.patas = nuevoPatas;
  }

  get getPatas(){
    return this.patas;
  } 
  set setTamanio(nuevoTamanio){
    this.tamanio = nuevoTamanio;
  }

  get getTamanio(){
    return this.tamanio;
  }
   set setEspecie(nuevoEspecie){
    this.especie = nuevoEspecie;
  }

  get getEspecie(){
    return this.especie;
  } 
  set setEdad(nuevoEdad){
    this.edad = nuevoEdad;
  }

  get getEdad(){
    return this.edad;
  } 
  set setCola(nuevoCola){
    this.cola = nuevoCola;
  }

  get getCola(){
    return this.cola;
  } 
  set setSonidos(nuevoSonidos){
    this.sonidos = nuevoSonidos;
  }

  get getSonidos(){
    return this.sonidos;
  }

  //métodos de la clase no getters ni setters
  // getAllProperties(){
  //   return [this.getCola,this.getEdad,this.getEspecie,this.getSonidos
  //     ,this.getTamanio, this.getNombre,this.getPatas];
  // }
  getAllProperties() {
    return {
     cola: this.cola,
     especie: this.getEspecie,
     sonidos: this.getSonidos,
     tamanio: this.getTamanio,
     edad: this.getEdad,
     nombre: this.getNombre,
     patas: this.getPatas
    };
    }


  //métodos estáticos
  static getAnimal(){
    return "tortuga 🐢";
  }
}

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


const capibara = new Animales(4,1.3,"roedor",3,"Pachito",true,"bufido");
capibara.setCola = false;
console.log(capibara)
console.log(capibara.getCola)
console.log(capibara.getNombre)
console.log(capibara.getAllProperties());
console.log();
//llamando método estático
console.log(Animales.getAnimal());

const nala = new Perro(4, 70, "perro", 4, "nala", true, "ladridos",
  "Martha", "French", false, "pechera", "blanco", false, "chino"
 );
console.log(nala.getAllProperties());