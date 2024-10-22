const add = (a,b) => {
  // if(typeof a !== "Number" && typeof b !== "Number")return;
  if(typeof a === "number" && typeof b === "number"){
    return a + b;
  }
  return;
};
const substract = (a,b) =>{
  if(typeof a === "number" && typeof b === "number"){
    return a - b;
  }
  return;
};
const multiply = (a,b) => a * b;
const divide = (a,b) => {
  if(b !== 0)return a/b;
  if(a === 0 && b === 0)return "No puedes poner 0 en los dos argumentos";
  return;
};

function residuo(a,b){ 
 if(b === 0) return; 
 return  a %b
};


module.exports = {
  add,
  substract,
  multiply,
  divide,
  residuo
};