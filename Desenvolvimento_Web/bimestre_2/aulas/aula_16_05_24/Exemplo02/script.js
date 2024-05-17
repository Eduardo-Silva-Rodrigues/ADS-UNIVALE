const element = document.querySelectorAll("p");

// element.forEach(function(a, b){
//     console.log(a);
// })

// for(i = 0; i < element.length; i++){
//     console.log(element.item(i));
// }

const alerta = document.querySelector(".btn-primary");

alerta.addEventListener("click", function(){
    alert("Alerta");
})

const escuro = document.querySelector(".btn-dark");
escuro.addEventListener("click", function(){
    const pagina = document.querySelector("body");
    pagina.style.backgroundColor = "black";
    pagina.style.color = "white";
})

const claro = document.querySelector(".btn-light");
claro.addEventListener("click", function(){
    const pagina = document.querySelector("body");
    pagina.style.backgroundColor = "white";
    pagina.style.color = "black"
})
