package java_poo.projetos.petshop_amaral;

public class Cachorro extends Animal {
    private String raca;
    private String tipo = "Cachorro";
    private String observacoesCachorro;

    public Cachorro(int codigoAnimal, String nome, int idade, Boolean presenca,String raca){
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

    @Override
    public void setObservacoes(String observacoes){
        this.observacoesCachorro = observacoes;
    }

    @Override
    public String getObservacoes(){
        return observacoesCachorro;
    }
}
