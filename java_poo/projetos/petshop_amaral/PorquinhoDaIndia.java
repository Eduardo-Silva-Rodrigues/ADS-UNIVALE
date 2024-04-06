package java_poo.projetos.petshop_amaral;

public class PorquinhoDaIndia extends Animal {
    private String raca;
    private String tipo = "Porquinho da India";

    public PorquinhoDaIndia(int codigoAnimal, String nome, int idade, Boolean presenca, String raca){
        super(codigoAnimal, raca, idade, presenca);
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
