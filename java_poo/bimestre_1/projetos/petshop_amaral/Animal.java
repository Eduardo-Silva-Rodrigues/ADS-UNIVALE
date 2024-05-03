package java_poo.bimestre_1.projetos.petshop_amaral;

public class Animal {
    //Propriedades de Animal:
    private int codigoAnimal;
    private String nome;
    private int idade;    
    private Boolean presenca;
    private String observacoes;
    
    //Método construtor de Animal:
    public Animal(int codigoAnimal, String nome, int idade, Boolean presenca){
        this.codigoAnimal = codigoAnimal;
        this.nome = nome;
        this.idade = idade;
        this.presenca = presenca;
    }

    //Getters and setters:
    public int getCodigoAnimal() {
        return codigoAnimal;
    }

    public void setCodigoAnimal(int codigoAnimal) {
        this.codigoAnimal = codigoAnimal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Boolean getPresenca() {
        return presenca;
    }

    public void setPresenca(Boolean presenca) {
        this.presenca = presenca;
    }

    public String getObservacoes(){
        return observacoes;
    }

    public void setObservacoes(String observacoes){
        this.observacoes = observacoes;
    }
}
