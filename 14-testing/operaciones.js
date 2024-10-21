const add = (a,b) => {
  // if(typeof a !== "Number" && typeof b !== "Number")return;
  if(typeof a === "number" && typeof b === "number"){
    return a + b;
  }
  return;
};
const substract = (a,b) => a - b;
const multiply = (a,b) => a * b;
const divide = (a,b) => a / b;

module.exports = add;