package java_poo.aulas.leetcode.atividade02;

public class Soluction {
    public int RomanToInteger(String roman){
        int integer = 0;

        for (int i = 0; i < roman.length(); i++){
            int auxiliar = i + 1;
            if (auxiliar == roman.length()){
                auxiliar = roman.length() - 1;
            }

            if (roman.charAt(i) == 'I' && roman.charAt(auxiliar) == 'V' || roman.charAt(i) == 'I' && roman.charAt(auxiliar) == 'X' ){
                integer -= 1;
            } else if (roman.charAt(i) == 'I'){
                integer += 1;
            } else if (roman.charAt(i) == 'V'){
                integer += 5;
            } else if (roman.charAt(i) == 'X' && roman.charAt(auxiliar) == 'L' || roman.charAt(i) == 'X' && roman.charAt(auxiliar) == 'C'){
                integer -= 10;
            } else if (roman.charAt(i) == 'X'){
                integer += 10;
            } else if (roman.charAt(i) == 'L'){
                integer += 50;
            } else if (roman.charAt(i) == 'C' && roman.charAt(auxiliar) == 'D' || roman.charAt(i) == 'C' && roman.charAt(auxiliar) == 'M'){
                integer -= 100;
            } else if (roman.charAt(i) == 'C'){
                integer += 100;
            }else if (roman.charAt(i) == 'D'){
                integer += 500;
            } else if (roman.charAt(i) == 'M'){
                integer += 1000;
            } else {
                System.out.println("Número romando desconhecido!");
            }
        }

        return integer;
    }
}
