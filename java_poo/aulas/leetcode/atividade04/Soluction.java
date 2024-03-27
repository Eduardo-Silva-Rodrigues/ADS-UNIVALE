package java_poo.aulas.leetcode.atividade04;


public class Soluction {

    //Selo de originalidade (Sem uso do chatGPT);

    public int somaRepetida(int num){
        String calculoEmString = "00";
        int calculoInteger = 0;

        if (Integer.toString(num).length() == 1){
            return num;
        }
        
        while (calculoEmString.length() > 1){
            String numeroString = Integer.toString(num);
            char[] listaDeNumerosChar = numeroString.toCharArray();

            for (char numeroChar : listaDeNumerosChar){
                calculoInteger = Integer.parseInt(Character.toString(listaDeNumerosChar[0])) + Integer.parseInt(Character.toString(numeroChar));
            }

            calculoEmString = Integer.toString(calculoInteger);

            if (calculoEmString.length() == 1){
                return calculoInteger = Integer.parseInt(calculoEmString);
            } else {
                num = Integer.parseInt(calculoEmString);
            }
        }

        return calculoInteger;
    }
}
