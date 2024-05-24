const form = document.querySelector("#formulario_aluno"); // Pega a estrutura do formulário
const table = document.querySelector("#corpo_tabela"); // Pega a estrutura da tabela

form.addEventListener("submit", function(event){ // Declara uma função para vigiar o evento "submit"
    event.preventDefault(); // Impede que a página atualize quando o submit é executado

    let nome = document.querySelector("#nome").value; // Pega o valor do campo nome
    let nota01 = parseFloat(document.querySelector("#nota1").value); // Pega o valor do campo nota1
    let nota02 = parseFloat(document.querySelector("#nota2").value); // Pega o valor do campo nota1
    let nota03 = parseFloat(document.querySelector("#nota3").value); // Pega o valor do campo nota1
    let nota04 = parseFloat(document.querySelector("#nota4").value); // Pega o valor do campo nota1
    let listaNotas = [nota01, nota02, nota03, nota04]; // Adiciona todas as notas em uma lista
    let aux = 0; // Variável responsável pela soma das notas
    let resultado; // Variável do resultado final da média

    for (i = 0; i < listaNotas.length; i++){ // Laço for para automatizar o cálculo da média
        aux += listaNotas[i]; // Operação de adição usando a lista de notas 
        resultado = aux / listaNotas.length; // Cálculo final da média
    }
    let newRow = table.insertRow(); // Inserindo uma nova linha na tabela
    let newColumn1 = newRow.insertCell(); // Inserindo uma nova coluna na linha criada anteriormente
    let newColumn2 = newRow.insertCell(); // Inserindo uma nova coluna na linha criada anteriormente
    let newColumn3 = newRow.insertCell(); // Inserindo uma nova coluna na linha criada anteriormente
    let newColumn4 = newRow.insertCell(); // Inserindo uma nova coluna na linha criada anteriormente
    let newColumn5 = newRow.insertCell(); // Inserindo uma nova coluna na linha criada anteriormente
    let newColumn6 = newRow.insertCell(); // Inserindo uma nova coluna na linha criada anteriormente

    newColumn1.innerHTML = nome; // Adicionando o valor do nome na coluna 1
    newColumn2.innerHTML = nota01; // Adicionando o valor da nota1 na coluna 2
    newColumn3.innerHTML = nota02; // Adicionando o valor da nota2 na coluna 3
    newColumn4.innerHTML = nota03; // Adicionando o valor da nota3 na coluna 4
    newColumn5.innerHTML = nota04; // Adicionando o valor da nota4 na coluna 5
    newColumn6.innerHTML = resultado; // Adicionando o valor da média na coluna 6
});
