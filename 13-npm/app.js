const axios = require('axios').default;
// // Hacer una petición para un usuario con ID especifico
// axios.get('https://fakestoreapi.com/products')
//   .then(function (response) {
//     // manejar respuesta exitosa
//     console.log(response);
//   })
//   .catch(function (error) {
//     // manejar error
//     console.log(error);
//   })
//   .finally(function () {
//     // siempre sera executado
//   });

async function getAllProducts(){
  try {
    //axios automáticamente transforma la respuesta de texto plano a objeto js
    const response = await axios("https://fakestoreapi.com/products");
    console.log(response);
  } catch (error) {
    console.log(error);
  }
}

getAllProducts();