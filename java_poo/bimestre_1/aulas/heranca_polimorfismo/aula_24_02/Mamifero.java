package java_poo.bimestre_1.aulas.heranca_polimorfismo.aula_24_02;

public class Mamifero extends Animal{
    private String tipoDePelo;

    public Mamifero(String nome, Integer idade, String tipoDePelo){
        super(nome, idade);
        this.tipoDePelo = tipoDePelo;
    }

    public String getTipoDePelo() {
        return this.tipoDePelo;
    }

    //Edita método:
    @Override
    public void emitirSom(){
        System.out.println("Som de mamifero!");
    }

}
