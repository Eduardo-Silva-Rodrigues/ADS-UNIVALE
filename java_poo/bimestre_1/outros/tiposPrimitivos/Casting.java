package java_poo.outros.tiposPrimitivos;

public class Casting {
    public static void main(String[] args) {
        // Casting: forçar uma variável a receber um dado maior do que o suportado
        
        byte bit = (byte) 300; 

        int inteiro = (int) 40000000000L; //Retorna um número com bits cortados para caber dentro da variável

        long numeroGrande = 9000000000000000000L; 

        short numeroMenor = (short) 64000; 

        double numeroDecimalMaior = 2000.00; 

        float numeroDecimalMenor = (float) 2500.00; 

        char caractereASCII = 65; 

        char caractereUniCode = '\u0041'; 

        boolean verdadeiro = true; 

        boolean falso = false; 

        System.out.println(bit);
        System.out.println(inteiro);
        System.out.println(numeroGrande);
        System.out.println(numeroMenor);
        System.out.println(numeroDecimalMaior);
        System.out.println(numeroDecimalMenor);
        System.out.println(caractereASCII);
        System.out.println(caractereUniCode);
        System.out.println(verdadeiro);
        System.out.println(falso);
    }
}
