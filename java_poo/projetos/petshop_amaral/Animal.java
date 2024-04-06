package java_poo.projetos.petshop_amaral;

public class Animal {
    private int codigoAnimal;
    private String nome;
    private int idade;    
    private Boolean presenca;

    public Animal(int codigoAnimal, String nome, int idade, Boolean presenca){
        this.codigoAnimal = codigoAnimal;
        this.nome = nome;
        this.idade = idade;
        this.presenca = presenca;
    }

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

    
}
