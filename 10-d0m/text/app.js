const pElement = document.querySelector("p");
//primera forma
console.log(pElement.innerText);
console.log(pElement.textContent);
pElement.innerText += " Hola pipol";
//segunda forma
pElement.textContent += " Hola pipol 2";
pElement.textContent = "<p>hola desde un innerHTMl</p>";