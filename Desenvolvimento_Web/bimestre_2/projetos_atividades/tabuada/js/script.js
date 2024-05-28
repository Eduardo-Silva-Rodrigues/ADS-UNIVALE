const form = document.querySelector("#form");
const containerTables = document.querySelector("#tables-container");
const warn = document.querySelector(".warn");
let tables = [];

form.addEventListener("submit", function(e) {
    e.preventDefault();
    let value = document.querySelector("#input").value;
    console.log(typeof(value));
    validationValue(value);
});

form.addEventListener("reset", function(e) {
    e.preventDefault();
    removeLastTable();
    warn.style.display = "none";
})
// 
function generatedTable(value){
    let table = document.createElement("table");
    table.classList.add("table");
    containerTables.appendChild(table);
    const rows = 10;
    const cells = 5;
    

    for (i = 0; i < rows; i++) {
        let row = table.insertRow();
        for (j = 0; j < cells; j++) {
            let cell = row.insertCell();
            if (j === 0){
                cell.classList.add("column-one");
                cell.innerHTML = value;
            } else if (j === 1) {
                cell.classList.add("column-two");
                cell.innerHTML = "X";
            } else if (j === 2) {
                cell.classList.add("column-three");
                cell.innerHTML = (i + 1);
            } else if (j === 3) {
                cell.classList.add("column-four");
                cell.innerHTML = "=";
            } else {
                cell.classList.add("column-five");
                cell.innerHTML = (value * (i + 1));
            }
        }
    }

    tables.push(table);
    table.style.display = "flex";
}

function removeLastTable(){
    if (tables.length > 0) {
        let last = tables.pop();
        last.remove();
    }
}

function validationValue(value){
    if (!isNaN(value) && !isNaN(parseFloat(value))) {
        removeLastTable();
        generatedTable(parseFloat(value));
        warn.style.display = "none";
    } else {
        removeLastTable();
        warn.style.display = "flex";
    }
}
