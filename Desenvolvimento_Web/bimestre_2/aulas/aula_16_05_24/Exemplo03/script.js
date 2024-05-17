const element = document.querySelector("#texto");

element.insertAdjacentHTML("beforebegin", "<p>Teste antes...</p>");
element.insertAdjacentHTML("Afterend", "<p>Teste depois</p>");