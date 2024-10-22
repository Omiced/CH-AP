const {add,substract,multiply,divide, residuo} = require("../operaciones");

describe("probando la función add", () => {
  test("probando que la suma de 2 + 2 = 4", () => {
    // con toBe le decimos al test que esperamos que la salida de la función sea 4
    expect(add(2,2)).toBe(4);
  })
  
  
  test("probando que la suma de 3 + 2 = 5", () => {
    // con toBe le decimos al test que esperamos que la salida de la función sea 5
    expect(add(3,2)).toBe(5);
  })
  
  test("probando que en caso de que no sea number retorna undefined: con string", () => {
    // con toBeUndefined le decimos al test que esperamos que la salida de la función sea undefined
    expect(add("3",2)).toBeUndefined();
  })
  test("probando que en caso de que no sea number retorna undefined: boolean", () => {
    // con toBeUndefined le decimos al test que esperamos que la salida de la función sea undefined
    expect(add(3,true)).toBeUndefined();
  })
});

describe("probando función substract", () => {
  test("probando que la resta de 2 - 2 = 0", () => {
    // con toBe le decimos al test que esperamos que la salida de la función sea 4
    expect(substract(2,2)).toBe(0);
  })
  
  
  test("probando que la resta de 3-2 = 1", () => {
    // con toBe le decimos al test que esperamos que la salida de la función sea 5
    expect(substract(3,2)).toBe(1);
  })
  
  test("probando que en caso de que no sea number retorna undefined: con string", () => {
    // con toBeUndefined le decimos al test que esperamos que la salida de la función sea undefined
    expect(substract("3",2)).toBeUndefined();
  })
  test("probando que en caso de que no sea number retorna undefined: boolean", () => {
    // con toBeUndefined le decimos al test que esperamos que la salida de la función sea undefined
    expect(substract(3,true)).toBeUndefined();
  })
})

describe("test de la función de división", () => {
  test("probando que la división de 0 retorne undefined", () => {
    expect(divide(2,0)).toBeUndefined();
  })
  test("probando que si se ingresa 0 en a y 0 en b retorne = No puedes poner 0 en los dos argumentos", () => {
    expect(divide(0,0)).toBe("No puedes poner 0 en los dos argumentos");
  })
})

test("probando 2 * 128 = 256", () => {
  expect(multiply(2,128)).toBe(256)
})


describe("Probando función de resiudo", () => {
  test("probando que un número par % 2 sea == 0", () => {
    expect(residuo(4,2)).toBe(0);
  });
  test("probando que un número impar % 2 sea !== 0", () => {
    expect(residuo(17,2)).toBeGreaterThan(0);
  });
  test("probando que un número impar % 2 sea !== 0", () => {
    expect(residuo(33,2)).toBeGreaterThan(0);
  });
  test("probando si un número termina en 0, n % 10 === 0", () => {
    expect(residuo(32480,10)).toBe(0);
  });
  test("probando si con un argumento tipo string nos da false", () => {
    expect(residuo("hola", 3)).toBeFalsy();
  });
  test("probando que si el divisor es 0 retorne undefined", () => {
    expect(residuo(2,0)).toBeUndefined();
  })
})
