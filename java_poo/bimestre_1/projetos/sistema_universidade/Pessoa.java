package java_poo.bimestre_1.projetos.sistema_universidade;

public class Pessoa {
    private String nome;
    private int idade;
    private String cpf;
    private String email;
    private String telefone;
    private String endereco;
    private Universidade universidade;

    public Pessoa(String nome, int idade, String cpf, String email, String telefone, String endereco, Universidade universidade){
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
        this.universidade = universidade;
    }   

    public void adicionarNome(String nome) {
        this.nome = nome;
    }

    public String exibirNome() {
        return nome;
    }

    public void adicionarIdade(int idade) {
        this.idade = idade;
    }

    public int exibirIdade() {
        return idade;
    }

    public void adicionarCpf(String cpf) {
        this.cpf = cpf;
    }

    public String exibirCpf() {
        return cpf;
    }

    public void adicionarEmail(String email) {
        this.email = email;
    }

    public String exibirEmail() {
        return email;
    }

    public void adicionarTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String exibirTelefone() {
        return telefone;
    }

    public void adicionarEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String exibirEndereco() {
        return endereco;
    }
    
    public void vincularUniversidade(Universidade universidade){
        this.universidade = universidade;
    }

    public Universidade exibirUniversidade(){
        return this.universidade;
    }

    public void listar(){
        this.universidade.exibirPessoas();
    }
}
