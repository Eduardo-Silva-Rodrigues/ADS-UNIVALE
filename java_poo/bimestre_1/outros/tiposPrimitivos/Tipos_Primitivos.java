package java_poo.bimestre_1.outros.tiposprimitivos;

public class Tipos_Primitivos {
    public static void main(String[] args) {
        // 8 bits (-128 a 127)
        byte bit = 127; 

        // 32 bits (-2.147.483.648 a 2.147.483.647)
        int inteiro = 2000000000; 

        // 64 bits (-9.223.372.036.854.775.808 a 9.223.372.036.854.775.807)
        long numeroGrande = 9000000000000000000L; 

        // 16 bits (-32.768 a 32.767)
        short numeroMenor = 32000; 

        // 32 bits
        double numeroDecimalMaior = 2000.00; 

        // 64 bits
        float numeroDecimalMenor = 2500; 

        //16 bits
        char caractere = 65; 

        // 1 bit
        boolean verdadeiro = true; 

        // 1 bit 
        boolean falso = false; 

        System.out.println(bit);
        System.out.println(inteiro);
        System.out.println(numeroGrande);
        System.out.println(numeroMenor);
        System.out.println(numeroDecimalMaior);
        System.out.println(numeroDecimalMenor);
        System.out.println(caractere);
        System.out.println(verdadeiro);
        System.out.println(falso);
    }
}
