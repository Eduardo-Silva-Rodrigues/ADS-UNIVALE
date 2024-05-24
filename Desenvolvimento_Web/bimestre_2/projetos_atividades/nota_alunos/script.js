const form = document.querySelector("#formulario_aluno"); 
const table = document.querySelector("#corpo_tabela"); 

form.addEventListener("submit", function(event){ 
    event.preventDefault(); 

    let nome = document.querySelector("#nome").value; 
    let nota01 = parseFloat(document.querySelector("#nota1").value); 
    let nota02 = parseFloat(document.querySelector("#nota2").value); 
    let nota03 = parseFloat(document.querySelector("#nota3").value); 
    let nota04 = parseFloat(document.querySelector("#nota4").value); 
    let listaNotas = [nota01, nota02, nota03, nota04]; 
    let aux = 0; 
    let resultado; 

    for (i = 0; i < listaNotas.length; i++){ 
        aux += listaNotas[i];
        resultado = aux / listaNotas.length; 
    }

    let newRow = table.insertRow(); 
    let newColumn1 = newRow.insertCell();
    let newColumn2 = newRow.insertCell();
    let newColumn3 = newRow.insertCell();
    let newColumn4 = newRow.insertCell();
    let newColumn5 = newRow.insertCell();
    let newColumn6 = newRow.insertCell();

    newColumn1.innerHTML = nome; 
    newColumn2.innerHTML = nota01; 
    newColumn3.innerHTML = nota02; 
    newColumn4.innerHTML = nota03; 
    newColumn5.innerHTML = nota04; 
    newColumn6.innerHTML = resultado; 
});
