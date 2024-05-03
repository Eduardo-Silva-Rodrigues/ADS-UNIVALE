package java_poo.bimestre_1.projetos.petshop_amaral;

//Classe Furao herda as propriedades e métodos da classe Animal:
public class Furao extends Animal {
    //Propriedades de Furao:
    private String raca;
    private String tipo = "Furão";
    private String observacoesFurao = "";

    //Método construtor de Furao:
    public Furao(int codigoAnimal, String nome, int idade, Boolean presenca, String raca){
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

    //Polimorfismo de métodos da classe Animal para a classe Furao:
    @Override
    public void setObservacoes(String observacoes){
        this.observacoesFurao = observacoes;
    }

    @Override
    public String getObservacoes(){
        return observacoesFurao;
    }
}
