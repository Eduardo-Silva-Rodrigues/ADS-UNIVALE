package java_poo.aulas.leetcode.atividade03;

public class Soluction {

    // Selo de originalidade (Sem uso do chatGPT);

    public boolean palindromo(int num){
        //Variável que armazena o resultado final:
        boolean valor = false;
        
        //Loop for que compara os caracteres com começo e do final do parâmetro "num":
        for (int i = 0; i < Integer.toString(num).length(); i++){
            //Condicional if que verifica se os caracteres do começo e do final são iguais:
            if (Integer.toString(num).charAt(i) == Integer.toString(num).charAt((Integer.toString(num).length() - 1) - i)){
                //Caso sejam iguais, a variável "valor" receberá true:
                valor = true;
                //Senão, será retornado false:
            } else {
                return false;
            }
        }

        return valor;
    }
}
