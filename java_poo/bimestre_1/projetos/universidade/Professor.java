package java_poo.bimestre_1.projetos.universidade;

public class Professor extends Pessoa {
    private Curso curso;
    private Disciplina disciplina;
    private String salario;
    
    public Professor(String nome, String email, String telefone, String cpf, String endereco, Curso curso,
            Disciplina disciplina, String salario) {
        super(nome, email, telefone, cpf, endereco);
        this.curso = curso;
        this.disciplina = disciplina;
        this.salario = salario;
    }

    public Curso getCurso() {
        return curso;
    }
    public void setCurso(Curso curso) {
        this.curso = curso;
    }
    public Disciplina getDisciplinas() {
        return disciplina;
    }
    public void setDisciplinas(Disciplina disciplinas) {
        this.disciplina = disciplinas;
    }
    public String getSalario() {
        return salario;
    }
    public void setSalario(String salario) {
        this.salario = salario;
    }

    @Override
    public void listarPessoas(){
        System.out.println("                        ");
        System.out.println("Nome: " + getNome());
        System.out.println("Email: " + getEmail());
        System.out.println("Telefone: " + getTelefone());
        System.out.println("CPF: " + getCpf());
        System.out.println("Endereço: " + getEndereco());
        System.out.println("Curso: " + this.curso.getNome());
        System.out.println("Disciplina: " + this.disciplina.getNome());
        System.out.println("Salário: " + this.salario);
        System.out.println("                        ");
    }
}
