package java_poo.bimestre_1.aulas.leetcode.atividade01;

public class Solution {
    public int[] sumArray(int[] num, int alvo){
        int[] resultado = new int[2];
        for (int i = 0; i < num.length; i++){
            int auxiliar = alvo - num[i];
            for (int j = 1; j < num.length; j++){
                if (num[j] == auxiliar){
                    resultado[0] = i;
                    resultado[1] = j;
                }
            }
        }

        return resultado;
    }
}


