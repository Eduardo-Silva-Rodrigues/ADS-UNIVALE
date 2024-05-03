package java_poo.bimestre_1.aulas.leetcode.atividade04;


public class Soluction {

    //Selo de originalidade (Sem uso do chatGPT);

    public int somaRepetida(int num){
        //Variável que guarda o resultado:
        int calculo = 0;

        //Condicional if para verificar se o parâmetro "num" contem apenas 1 caractere:
        if (Integer.toString(num).length() == 1){
            //Se contiver apenas 1 caractere, "num" é retornado:
            return num;
        }
        
        //Loop while para executar o processo enquanto "calculo" conter mais de 1 caractere:
        while (Integer.toString(calculo).length() > 1){
            //Lista que guarda cada caractere do parâmetro "num" individualmente:
            char[] listaDeNumerosChar = Integer.toString(num).toCharArray();

            //Loop for para converter os caracteres para inteiros e realizar a soma entre eles:
            for (char numeroChar : listaDeNumerosChar){
                //Variável "calculo" recebe a soma entre eles:
                calculo = Integer.parseInt(Character.toString(listaDeNumerosChar[0])) + Integer.parseInt(Character.toString(numeroChar));
            }

            //Condicional if verifica a quantidade de caracteres da variável "calculo":
            if (Integer.toString(calculo).length() == 1){
                //Se houver apenas 1 caractere na variável "calculo", então "calculo" será retornado:
                return calculo;
                //Se não houver apenas 1 caractere em "calculo", "num" recebe "calculo" e o processo se repete tudo de novo:
            } else {
                num = calculo;
            }
        }

        return calculo;
    }
}
