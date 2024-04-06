package java_poo.projetos.petshop_amaral;

//Classe Gato herda propriedades e métodos da classe Animal:
public class Gato extends Animal {
    //Propriedades de Gato:
    private String raca;
    private String tipo = "Gato";
    private String observacoesGato = "";

    //Método construtor de Gato:
    public Gato(int codigoAnimal, String nome, int idade, Boolean presenca, String raca){
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

    //Polimorfismo de métodos da classe Animal para a classe Gato:
    @Override
    public void setObservacoes(String observacoes){
        this.observacoesGato = observacoes;
    }

    @Override
    public String getObservacoes(){
        return observacoesGato;
    }
    
}
