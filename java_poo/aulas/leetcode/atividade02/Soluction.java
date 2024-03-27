package java_poo.aulas.leetcode.atividade02;

public class Soluction {

    // Selo de originalidade (Sem uso do chatGPT);

    public int RomanToInteger(String roman){
        //Variável que armazena o resultado final:
        int integer = 0;

        //Loop for que realiza o processo de comparação de cada caractere do parâmetro "roman":
        for (int i = 0; i < roman.length(); i++){
            //Variável auxiliar para indicar o próximo caractere do parâmetro "roman":
            int auxiliar = i + 1;
            //Condicional if para verificar se a variável auxiliar está último index da String:
            if (auxiliar == roman.length()){
                //Caso estiver, auxiliar terá -1 subtraído em si para que não passe do limite de caracteres da String:
                auxiliar = roman.length() - 1;
            }

            //Condicionais que verificam os caracteres de "roman" e atribuem seus valores para a variável "integer":
            if (roman.charAt(i) == 'I' && roman.charAt(auxiliar) == 'V' || roman.charAt(i) == 'I' && roman.charAt(auxiliar) == 'X' ){
                //Caso "I" anteceder "V" ou "X", ao invés de "integer" receber 1, ele perderá 1:
                integer -= 1;
            } else if (roman.charAt(i) == 'I'){
                integer += 1;
            } else if (roman.charAt(i) == 'V'){
                integer += 5;
            } else if (roman.charAt(i) == 'X' && roman.charAt(auxiliar) == 'L' || roman.charAt(i) == 'X' && roman.charAt(auxiliar) == 'C'){
                //Caso "X" anteceder "L" ou "C", ao invés de "integer" receber 10, ele perderá 10:
                integer -= 10;
            } else if (roman.charAt(i) == 'X'){
                integer += 10;
            } else if (roman.charAt(i) == 'L'){
                integer += 50;
            } else if (roman.charAt(i) == 'C' && roman.charAt(auxiliar) == 'D' || roman.charAt(i) == 'C' && roman.charAt(auxiliar) == 'M'){
                //Caso "C" anteceder "D" ou "M", ao invés de "integer" receber 100, ele perderá 100:
                integer -= 100;
            } else if (roman.charAt(i) == 'C'){
                integer += 100;
            }else if (roman.charAt(i) == 'D'){
                integer += 500;
            } else if (roman.charAt(i) == 'M'){
                integer += 1000;
            } else {
                //Se o caractere não for reconhecido pelas outras condicionais, um print será retornado:
                System.out.println("Número romando desconhecido!");
            }
        }

        //Retorna o valor final:
        return integer;
    }
}
