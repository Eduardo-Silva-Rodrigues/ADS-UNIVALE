package java_poo.projetos.universidade;

import java.util.ArrayList;

public class Disciplina {
    private String nome;
    private ArrayList<Aluno> alunos;
    private Curso curso;
    private Integer horas;

    public Disciplina(String nome, Integer horas) {
        this.nome = nome;
        this.horas = horas;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }
    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }
    public Curso getCurso() {
        return curso;
    }
    public void setCurso(Curso curso) {
        this.curso = curso;
    }
    public Integer getHoras() {
        return horas;
    }
    public void setHoras(Integer horas) {
        this.horas = horas;
    }

    
}
