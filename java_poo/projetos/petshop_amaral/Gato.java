package java_poo.projetos.petshop_amaral;

public class Gato extends Animal {
    private String raca;
    private String tipo = "Gato";

    public Gato(int codigoAnimal, String nome, int idade, Boolean presenca, String raca){
        super(codigoAnimal, nome, idade, presenca);
        this.raca = raca;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    
}
