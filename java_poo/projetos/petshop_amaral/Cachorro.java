package java_poo.projetos.petshop_amaral;

//Classe cachorro herda as propriedades e métodos da classe Animal:
public class Cachorro extends Animal {
    //Propriedades de Cachorro:
    private String raca;
    private String tipo = "Cachorro";
    private String observacoesCachorro = "";

    //Método construtor de Cachorro:
    public Cachorro(int codigoAnimal, String nome, int idade, Boolean presenca,String raca){
        super(codigoAnimal, raca, idade, presenca);
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

    //Polimorfismo de métodos da classe Animal para a classe Cachorro:
    @Override
    public void setObservacoes(String observacoes){
        this.observacoesCachorro = observacoes;
    }

    @Override
    public String getObservacoes(){
        return observacoesCachorro;
    }
}
