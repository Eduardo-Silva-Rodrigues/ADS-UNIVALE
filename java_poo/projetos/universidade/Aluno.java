package java_poo.projetos.universidade;

import java.util.ArrayList;

public class Aluno extends Pessoa {
    private Curso curso;
    private ArrayList<Disciplina> disciplinas;
    private String turma;
    private int semestre;
    private ArrayList<Double> notas;
    
    public Aluno(String nome, String email, String telefone, String cpf, String endereco, Curso curso, ArrayList<Disciplina> disciplinas, String turma, int semestre, ArrayList<Double> notas) {
        super(nome, email, telefone, cpf, endereco);
        this.curso = curso;
        this.disciplinas = disciplinas;
        this.turma = turma;
        this.semestre = semestre;
        this.notas = notas;
    }

    public Curso getCurso() {
        return curso;
    }
    public void setCurso(Curso curso) {
        this.curso = curso;
    }
    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }
    public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }
    public String getTurma() {
        return turma;
    }
    public void setTurma(String turma) {
        this.turma = turma;
    }
    public int getSemestre() {
        return semestre;
    }
    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
    public ArrayList<Double> getNotas() {
        return notas;
    }
    public void setNotas(ArrayList<Double> notas) {
        this.notas = notas;
    }
    
}
