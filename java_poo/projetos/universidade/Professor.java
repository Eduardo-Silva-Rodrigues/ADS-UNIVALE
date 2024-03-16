package java_poo.projetos.universidade;

public class Professor extends Pessoa {
    private Curso curso;
    private Disciplina disciplinas;
    private String salario;
    
    public Professor(String nome, String email, String telefone, String cpf, String endereco, Curso curso,
            Disciplina disciplinas, String salario) {
        super(nome, email, telefone, cpf, endereco);
        this.curso = curso;
        this.disciplinas = disciplinas;
        this.salario = salario;
    }

    public Curso getCurso() {
        return curso;
    }
    public void setCurso(Curso curso) {
        this.curso = curso;
    }
    public Disciplina getDisciplinas() {
        return disciplinas;
    }
    public void setDisciplinas(Disciplina disciplinas) {
        this.disciplinas = disciplinas;
    }
    public String getSalario() {
        return salario;
    }
    public void setSalario(String salario) {
        this.salario = salario;
    }

    
}
