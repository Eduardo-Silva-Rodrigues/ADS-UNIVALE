package java_poo.projetos.universidade;

import java.util.ArrayList;

public class Universidade {
    private String nome;
    private String endereco;
    private ArrayList<Professor> professores;
    private ArrayList<Aluno> alunos;
    private ArrayList<Curso> cursos;

    public Universidade(String nome, String endereco, ArrayList<Professor> professores, ArrayList<Aluno> alunos, ArrayList<Curso> cursos){
        this.nome = nome;
        this.endereco = endereco;
        this.professores = professores;
        this.alunos = alunos;
        this.cursos = cursos;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public ArrayList<Professor> getProfessores() {
        return professores;
    }
    public void setProfessores(ArrayList<Professor> professores) {
        this.professores = professores;
    }
    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }
    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }
    public ArrayList<Curso> getCursos() {
        return cursos;
    }
    public void setCursos(ArrayList<Curso> cursos) {
        this.cursos = cursos;
    }
    
}
