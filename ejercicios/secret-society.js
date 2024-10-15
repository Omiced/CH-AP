/* 
  Secret Society
 

Find the name of a secret society based on the first letter of each member's name.
 

Examples:
- `secretName(["Esperanza", "Franco", "Nia"])` should return `'EFN'`.
- `secretName(['Phoebe', 'Ross', 'Chandler', 'Joey', 'Monica', 'Rachel'])` should return `'CJMPRR'`.
- `secretName(['Harry', 'Ron', 'Hermione'])` should return `'HHR'`.
1. Entrada un array de nombres 🐲
2. Variable para guardar el nombre de la sociedad secretSocietyName 🐲
4. Ordernar el array en orden alfabético🐲
5. Recorrer el array con un map
6. Recoger la primera letra de cada elemento guardar en la variable secretSocietyName
5. Nombre de la sociedad secreta, formado por un string que tiene la primera letra de cada elemento del array que debe estar en mayus
7. retorno secretSocietyName

*/

const secretName = (members) => {
  let secretSocietyName = "";
  const sortedMembers = members.sort();
  const initials = sortedMembers.map(member => member[0] );
  secretSocietyName = initials.join("").toUpperCase();
  return secretSocietyName;
}

console.log(secretName(["Esperanza", "Franco", "Nia"]));
console.log(secretName(['Phoebe', 'Ross', 'Chandler', 'Joey', 'Monica', 'Rachel']));
console.log(secretName(['Harry', 'Ron', 'Hermione']));

console.log("Josue"[0]);
console.log("Josue"[1]);
console.log("Josue"[2]);
console.log("Josue"[3]);
console.log("Josue"[4]);

let nombre = "Karla";
console.log(nombre.charAt(nombre.length - 1));