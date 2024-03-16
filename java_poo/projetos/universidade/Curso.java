package java_poo.projetos.universidade;

import java.util.ArrayList;

public class Curso {
    private String nome;
    private ArrayList<Disciplina> disciplinas;
    private ArrayList<Professor> professores;
    private ArrayList<Aluno> alunos;
    private ArrayList<String> turmas;
    private String mensalidade;
    
    public Curso(String nome, ArrayList<Disciplina> disciplinas, ArrayList<Professor> professores,
            ArrayList<Aluno> alunos, ArrayList<String> turmas, String mensalidade) {
        this.nome = nome;
        this.disciplinas = disciplinas;
        this.professores = professores;
        this.alunos = alunos;
        this.turmas = turmas;
        this.mensalidade = mensalidade;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }
    public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
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
    public ArrayList<String> getTurmas() {
        return turmas;
    }
    public void setTurmas(ArrayList<String> turmas) {
        this.turmas = turmas;
    }
    public String getMensalidade() {
        return mensalidade;
    }
    public void setMensalidade(String mensalidade) {
        this.mensalidade = mensalidade;
    }
    
}

