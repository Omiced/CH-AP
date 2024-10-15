/*
  Palindrome
Write a program that prompts for a word or sentence (it can be capitalized, have spaces and punctuation). 
Figure out if the sentence/word is a palindrome or not.  spaces and capitalized letters.
1. Entrada un string ya sea frase o palabra 🐲
2. Definición palindromo Palabra o frase cuyas letras están dispuestas de tal manera que resulta la misma leída de izquierda a derecha
 que de derecha a izquierda; por ejemplo, anilina; dábale arroz a la zorra el abad.
3. guardar la entrada en una variable 🐲
4. Normalizar la palabra o frase, haciendo todo en minis y quitando espacios🐲
  4.1 guardar una copia de la palabra o frase origianl normalizada 🐲
5.convertir la palabra o frase a un array 🐲
6. revertir el array
7. convertir el array de nuevo en frase o palabra y guardarlo en una variable 🐲
8. Comparar el valor original normalizado con el valor revertido normalizado
9. Salida una frase que indique si la entrada del usuario es o no es un palindromo
*/

const isPalindrome = () => {
  const str = prompt("Ingresa una palabra o frase, para verificar si es palindromo");
  const strNormalized = str.toLowerCase().replaceAll(" ","");
  const strArray = strNormalized.split("");
  const strNormReversed = strArray.reverse().join("");
  if(strNormalized === strNormReversed){
    console.log("Tus palabras son limpias, claras y palíndromas 😎");
  }else{
    console.log("Not palíndromas F 😢");
  }

}

isPalindrome();