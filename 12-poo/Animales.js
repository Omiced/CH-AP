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




const capibara = new Animales(4,1.3,"roedor",3,"Pachito",true,"bufido");
capibara.setCola = false;
console.log(capibara)
console.log(capibara.getCola)
console.log(capibara.getNombre)
console.log(capibara.getAllProperties());
console.log();
//llamando método estático
console.log(Animales.getAnimal());

function suma(a,b){
  return a + b;
}
// su uso más común es cuando solo queremor exportar una cosa de todo el archivo
export default function multiplicar(a,b){
  return a * b;
}


export {Animales, suma};