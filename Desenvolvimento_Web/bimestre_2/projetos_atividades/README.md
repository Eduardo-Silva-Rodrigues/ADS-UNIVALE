# 🎃 Pesquisa de Estrutura de Controle 

### 🎈 **Alunos:**
- *Eduardo Rodrigues*
*(IF, ELSE e ELSE IF)*
- *Gustavo Ariosi* 
*(SWITCH)*
- *Lucas Dias*
*(FOR)*
- *Matheus Cristiano*
*(WHILE)*


### **IF, ELSE e ELSE IF:**

Conhecidos também como estruturas condicionais,  __if__, __else__ e __else if__ são responsáveis por analisar varias condições em cadeia, e caso alguma delas for verdadeira ele executará o código presente dentro do seu escopo.

A estrutura em cadeia se apresenta em uma ordem específica que deve ser respeitada, com o __if__ sendo sempre o primeiro a ser declarado. Caso exista apenas duas condições a serem analisadas, o segundo a ser declarado deve ser o __else__, que por sinal não abriga nenhuma condição explicita em sua declaração. Mas, se a estrutura conter mais de duas condições a serem analisadas, o __else if__ deve ser declarado depois do __if__, e poderá ser usado mais de uma vez caso necessário. Lembrando, que o __else__ sempre será o último a ser declarado na estrutura.

### Exemplo 01:
```javascript
    if (1 > 0){
        console.log("1 é maior que 0");
    }
```
### Exemplo 02:
```javascript
    if (1 > 0){
        console.log("1 é maior que 0");
    } else {
        console.log("1 é menor ou igual a 0");
    }
```
### Exemplo 03:
```javascript
    if (1 > 0){
        console.log("1 é maior que 0");
    } else if (1 < 0){
        console.log("1 é menor que 0");
    } else {
        console.log("Sem resposta");
    }
```
### Exemplo 04:
```javascript
    if (1 > 0){
        console.log("1 é maior que 0");
    } else if (1 < 0){
        console.log("1 é menor que 0");
    } else if (1 <= 0){
        console.log("1 é menor ou igual a 0");    
    } else {
        console.log("Sem resposta");
    }
```
### **SWITCH:**

A condicional switch avalia uma expressão, combinando o valor da expressão para um cláusula case.
A estrutura condicional switch permite executar um bloco de código diferente de acordo com cada opção (cada case) especificada. Seu uso é indicado quando os valores a serem analisados nessas condições são pré-definidos.

### Exemplo 01:
```javascript
    switch (expressão) {
        case valor1:
            //Instruções executadas quando o resultado da expressão for igual á valor1
            [break;]
        case valor2:
            //Instruções executadas quando o resultado da expressão for igual á valor2
            [break;]
```
O programa primeiro procura por um caso o qual a expressão avalie como tendo o mesmo valor que o input da expressão transferindo assim o controle para a cláusula encontrada e em seguida executando as instruções associadas.

### Exemplo 02:
```javascript
    switch (expr) {
        case "Laranjas":
            console.log("As laranjas custam $0.59 o quilo.");
            break;

        case "Maçãs":
            console.log("Maçãs custam $0.32 o quilo.");
            break;
        case "Bananas":
            console.log("Bananas custam $0.48 o quilo.");
            break;
        case "Cerejas":
        console.log("Cerejas custam $3.00 o quilo.");
            break;
        case "Mangas":
        case "Mamões":
            console.log("Mangas e mamões custam $2.79 o quilo.");
            break;
        default:
             console.log("Desculpe, estamos sem nenhuma " + expr + ".");

        console.log("Tem algo mais que você gostaria de levar?");
```

O programa corresponde o valor com o case "Bananas" e executa a instrução associada. Quando break for encontrado, o programa para (break), saindo de switch e executa a instrução localizada após o switch. Se break fosse omitido, a instrução para "Cherries" também seria executada.
### **WHILE:**

While é um laço de repetição que executará o looping infinitamente enquanto a condição que foi especificada for verdadeira.

### Exemplo 01:
```javascript
let i = 0
do {

    i += 1;
    console.log(i);
  } while (i < 10);
```
### Exemplo 02:
```javascript
    n = 0;
    x = 0;
    while (n < 3) {
        n++;
        x += n;
    }
```

### **For Loop:**
O loop de programação é como fazer a mesma coisa repetidas vezes - o que é chamado de **iteração** na linguagem de programação.

Um loop geralmente possui um ou mais dos seguintes itens:

O **contador**, que é inicializado com um certo valor - este é o ponto inicial do loop.

A **condição de saída**, que é o critério no qual o loop pára - geralmente o contador atinge um certo valor. Isso é ilustrado por "Tenho comida suficiente?", na figura acima. Vamos dizer que ele precisa de 10 porções de comida para alimentar sua família.



Um **iterador**, que geralmente incrementa o contador em uma pequena quantidade a cada loop, sucessivamente, até atingir a condição de saída. Nós não ilustramos explicitamente isso acima, mas poderíamos pensar sobre o agricultor ser capaz de coletar 2 porções de comida por hora. Depois de cada hora, a quantidade de comida que ele coletou é incrementada em dois, e ele verifica se ele tem comida suficiente. Se ele atingiu 10 porções (a condição de saída), ele pode parar de coletar e ir para casa.

### Exemplo 01:
```javascript
    for (let i = 0; i < 5; i++) {
        text += "The number is " + i +"<br>";
        }
```
Neste exemplo criamos o contador **i** com valor 0 e usamos um limite de **5** na comparação de menor com um alto incremento **i++**, logo em seguida ele ira imprimir a sequencia de numeros.

### Exemplo 02:
```javascript
    let i = 2;
    let len = cars.length;
    let text = "";
    for (; i < len; i++) {
        text += cars[i] + "<br>";
    }
```
Neste exemplo limitamos o contador em **2**, posteriormente obtemos o valor do array e armazenaremos na variavel **lens**, O loop continuará enquanto i for menor que len, Dentro do loop, o código concatena o elemento atual do array com a string que representa uma quebra de linha em HTML.