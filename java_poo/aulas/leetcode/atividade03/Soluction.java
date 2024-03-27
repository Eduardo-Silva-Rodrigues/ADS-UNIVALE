package java_poo.aulas.leetcode.atividade03;

public class Soluction {

    // Selo de originalidade (Sem uso do chatGPT);

    public boolean palindromo(int num){
        String numString = Integer.toString(num);
        boolean valor = false;

        for (int i = 0; i < numString.length(); i++){
            if (numString.charAt(i) == numString.charAt((numString.length() - 1) - i)){
                valor = true;
            } else {
                return false;
            }
        }

        return valor;
    }
}
