// Fazendo botão retornar valor no console
const button = document.querySelector("button");

button.addEventListener("click", function () {
    console.log("Eduardo Rodrigues");
});


// Impedindo o recarregamento da página ao submeter valor
const form = document.querySelector("#exemplo_form");

form.addEventListener("submit", function (event) {
    event.preventDefault();
});

// Convertendo String para Number
let texto_numero = "2024";

console.log(typeof (texto_numero));

let numero = parseFloat(texto_numero);

console.log(typeof (numero));

// Inserindo linhas e colunas com JS
const tabela = document.querySelector("#tabela");

let linha_nova = tabela.insertRow();

let coluna1 = linha_nova.insertCell();
let coluna2 = linha_nova.insertCell();
let coluna3 = linha_nova.insertCell();
let coluna4 = linha_nova.insertCell();
let coluna5 = linha_nova.insertCell();
let coluna6 = linha_nova.insertCell();

coluna1.innerHTML = "Eduardo";
coluna2.innerHTML = "9.9";
coluna3.innerHTML = "9.9";
coluna4.innerHTML = "9.9";
coluna5.innerHTML = "9.9";
coluna6.innerHTML = "9.9";

// Adicionando tags HTML pelo JS
const exemplo_1 = document.querySelector("#exemplo_1");

exemplo_1.innerHTML = "<p>Eduardo</p>";

// Formatador de número
const numero01 = 2.54858;
console.log(numero01.toFixed(2));

// Resetando campo do formulário ao submeter o valor
const form02 = document.querySelector("#exemplo_form2");

form02.addEventListener("submit", function (event) {
    event.preventDefault();
    document.querySelector("#exemplo_form2").reset();
})
