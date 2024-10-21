const add = require("../operaciones");

test("probando que la suma de 2 + 2 = 4", () => {
  // con toBe le decimos al test que esperamos que la salida de la función sea 4
  expect(add(2,2)).toBe(4);
})


test("probando que la suma de 3 + 2 = 5", () => {
  // con toBe le decimos al test que esperamos que la salida de la función sea 4
  expect(add(3,2)).toBe(5);
})

test("probando que en caso de que no sea number retorna undefined: con string", () => {
  // con toBe le decimos al test que esperamos que la salida de la función sea 4
  expect(add("3",2)).toBeUndefined();
})
test("probando que en caso de que no sea number retorna undefined: boolean", () => {
  // con toBe le decimos al test que esperamos que la salida de la función sea 4
  expect(add(3,true)).toBeUndefined();
})