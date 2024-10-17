const URL_BASE = "https://fakestoreapi.com/products"; 
const mainContainer = document.querySelector(".container-j");

//evento de carga de la página
window.addEventListener("load", ()=>{
  //obteniendo la data desde el localstorage
  const productsArray = JSON.parse(localStorage.getItem("products"));
  showAllProducts(productsArray);
});


const showAllProducts = async function(productsArray){
    console.log(productsArray)
  // if(productsArray.length < 0) return;
  const products = await productsArray;
  console.log(products)
  if(!products) return; // guard clause early return su objetivo es evaluar el caso de erro donde ya no vamos a hacer
  
  for(let i = 0; i < products.length; i++){
    const cardProduct = `
    <div class="card" style="width: 18rem;">
    <img src="${products[i].image}" class="card-img-top" alt="...">
    <div class="card-body">
      <h5 class="card-title">${products[i].title}</h5>
      <p class="card-text">${products[i].description}</p>
    </div>
    <ul class="list-group list-group-flush">
      <li class="list-group-item">Price: ${products[i].price}</li>
      <li class="list-group-item">Category: ${products[i].category}</li>
    </ul>
  </div>
  `;
   mainContainer.insertAdjacentHTML("afterbegin", cardProduct);
  }

}


//function declaration async
async function getAllProducts(){
  if(localStorage.getItem("products")) return;
  try {
    const response = await fetch(URL_BASE);
    if(!response) throw new Error("Error al obtener los productos");
    const data = await response.json();
    // fijamos la data en el localstorage con la llave de products
    localStorage.setItem("products",JSON.stringify(data));
    //si retornamos algo dentro de una función async, siempre va a retornar como promesa
    return data;
  } catch (error) {
    console.log("Error", error);
  }
}
//function expression async
const getSingleProduct = async function(id){
  try {
    const response = await fetch(`${URL_BASE}/${id}`);
    if(!response) throw new Error("Error al obtener los productos");
    const data = await response.json();
    console.log(data);
  } catch (error) {
    console.log("Error",error);
  }
}

// arrow function async
const addProduct = async (productObject) =>{
  const response = await fetch(URL_BASE,{
    method: "POST",
    body: JSON.stringify(productObject)
  });
  const data = await response.json();
  console.log(data);
}

getAllProducts();
getSingleProduct(18);
addProduct(  {
  title: 'test product',
  price: 13.5,
  description: 'lorem ipsum set',
  image: 'https://i.pravatar.cc',
  category: 'electronic'
});

showAllProducts(getAllProducts());


