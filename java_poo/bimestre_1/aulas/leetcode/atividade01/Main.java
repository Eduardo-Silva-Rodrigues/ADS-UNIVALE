package java_poo.bimestre_1.aulas.leetcode.atividade01;

public class Main {
    public static void main(String[] args){
        Solution x = new Solution();
        int[] nums = new int[3];
        nums[0] = 3;
        nums[1] = 2;
        nums[2] = 4;
        int[] resultado = x.sumArray(nums, 6);

        System.out.println(resultado[0] + ", " + resultado[1]);
    }
}
