package java_poo.bimestre_1.projetos.rede_social;

public class Usuario {
    private String nome;
    private String email;
    private String senha;
    private String nascimento;

    public Usuario(String nome, String email, String senha, String nascimento){
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.nascimento = nascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public void criarPost(){

    }

    public void curtirPost(){

    }

    public void comentarPost(){
        
    }
}
