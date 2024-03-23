package java_poo.projetos.universidade;

public class Nota {
    private Aluno aluno;
    private Disciplina disciplina;
    private Double notaProva;
    private Double notaTrabalho;
    private Double notaAtividade;

    public Nota(Aluno aluno, Disciplina disciplina, Double notaProva, Double notaTrabalho, Double notaAtividade){
        this.notaProva = notaProva;
        this.notaTrabalho = notaTrabalho;
        this.notaAtividade = notaAtividade;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public Double getNotaProva() {
        return notaProva;
    }

    public void setNotaProva(Double notaProva) {
        this.notaProva = notaProva;
    }

    public Double getNotaTrabalho() {
        return notaTrabalho;
    }

    public void setNotaTrabalho(Double notaTrabalho) {
        this.notaTrabalho = notaTrabalho;
    }

    public Double getNotaAtividade() {
        return notaAtividade;
    }

    public void setNotaAtividade(Double notaAtividade) {
        this.notaAtividade = notaAtividade;
    }
    
}
