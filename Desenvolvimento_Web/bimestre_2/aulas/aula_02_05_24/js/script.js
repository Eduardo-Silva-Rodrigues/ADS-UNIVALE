//     Variáveis:

var nome01 = "Eduardo";

let sobrenome01 = "Silva";

console.log(nome01);
console.log(sobrenome01);

if (true){
    var nome02 = "Joana";
}

console.log(nome02);

// if (true){
//     let nome03 = "Joana";
// }

// console.log(nome03);

//     Tipos primitivos:

let nome03 = "Matheus"; //String

let numero01 = 1; //Integer

let numero02 = 1.5; //Double

let verdade = true //Boolean

let texto01; //Indefinido

let texto02 = null //Vazio

//     Operadores aritméticos:

let num1 = 10;
let num2 = 5;

//Adição:
console.log(num1 + num2);

//Subtração:
console.log (num1 - num2);

//Divisão:
console.log(num1 / num2);

//Multiplicação:
console.log(num1 * num2);

//Potenciação:
console.log(num1 ** num2);

//Resto da divisão:
console.log(num1 % num2);

//     Operadores de comparação:

// Igual:
console.log(5 == "5"); //true

// Idêntico:
console.log(5 === "5"); //false

// Maior:
console.log(5 > 7); //false

// Menor:
console.log(5 < 7); //true

// Maior ou igual:
console.log(5 >= 7); //false

// Menor ou igual:
console.log(5 <= 7); //true

// Diferente:
console.log(5 != 7); //true

// Não idêntico:
console.log(5 !== 7) //true

//     Operadores lógicos:

/*

AND - &&
OR - ||
NOT - !

*/

let a = 5;
let b = 10;
//AND:
console.log(a > 0 && b > 5); //true

//OR:
console.log(a > 0 || b > 5); //true

//NOT:
console.log(!a > 0); //false

let resposta = "confirmação";
confirm(resposta);

let nome04 = prompt("Qual o seu nome?");
console.log(nome04)