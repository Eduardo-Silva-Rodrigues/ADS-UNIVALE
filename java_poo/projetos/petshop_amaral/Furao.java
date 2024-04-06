package java_poo.projetos.petshop_amaral;

public class Furao extends Animal {
    private String raca;
    private String tipo = "Furão";
    private String observacoesFurao;

    public Furao(int codigoAnimal, String nome, int idade, Boolean presenca, String raca){
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

    @Override
    public void setObservacoes(String observacoes){
        this.observacoesFurao = observacoes;
    }

    @Override
    public String getObservacoes(){
        return observacoesFurao;
    }
}
