package java_poo.bimestre_1.projetos.esquenta;

public class Pessoa {
    private static long aux;
    private long id;
    private String nome;
    private int idade;
    private String endereco;
    private boolean status;

    {
        Pessoa.aux += 1;
        id = aux;
    }

    public Pessoa(String nome, int idade, String endereco, boolean status) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
        this.status = status;
    }

    public long getId(){
        return id;
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

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
