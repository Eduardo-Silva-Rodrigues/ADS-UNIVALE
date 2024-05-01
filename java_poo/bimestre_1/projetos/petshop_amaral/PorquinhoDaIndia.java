package java_poo.projetos.petshop_amaral;

//Classe PorquinhoDaIndia herda as porpriedades e métodos da classe Animal:
public class PorquinhoDaIndia extends Animal {
    //Propriedades de PorquinhoDaIndia:
    private String raca;
    private String tipo = "Porquinho da India";
    private String observacoesPorquinhoDaIndia = "";

    //Método construtor de PorquinhoDaIndia:
    public PorquinhoDaIndia(int codigoAnimal, String nome, int idade, Boolean presenca, String raca){
        super(codigoAnimal, nome, idade, presenca);
        this.raca = raca;
    }

    //Getters and setters:
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

    //Polimorfismo de métodos da classe Animal para a classe PorquinhoDaIndia:
    @Override
    public void setObservacoes(String observacoes){
        this.observacoesPorquinhoDaIndia = observacoes;
    }

    @Override
    public String getObservacoes(){
        return observacoesPorquinhoDaIndia;
    }
    
}
