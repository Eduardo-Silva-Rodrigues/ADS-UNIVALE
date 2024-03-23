package java_poo.aulas.leetcode.atividade01;

public class Solution {
    public int[] sumArray(int[] num, int alvo){
        for (int i = 0; i < num.length; i++){
            if (num[0] + num[i] == alvo && num[0] != num[i]){
                return new int[]{num[0], num[i]};
            } else if (num[1] + num[i] == alvo && num[1] != num[i]){
                return new int[]{num[1], num[i]};
            } else if (num[2] + num[i] == alvo && num[2] != num[i]){
                return new int[]{num[2], num[i]};
            }
        }

        return new int[]{0};
    }
}
