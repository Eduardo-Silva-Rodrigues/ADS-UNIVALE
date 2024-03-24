package java_poo.projetos.sistema_universidade;

import java.util.ArrayList;

public class Turma {
    private String nome;
    private int semestre;
    private String periodo;
    private ArrayList<Disciplina> disciplinas = new ArrayList<Disciplina>();
    private ArrayList<Aluno> alunos = new ArrayList<Aluno>();

    public Turma(String nome, int semestre, String periodo){
        this.nome = nome;
        this.semestre = semestre;
        this.periodo = periodo;
    }

    public void adicionarNome(String nome){
        this.nome = nome;
    }

    public String exibirNome(){
        return this.nome;
    }

    public void adicionarSemestre(int semestre){
        this.semestre = semestre;
    }

    public int exibirSemestre(){
        return this.semestre;
    }

    public void adicionarPeriodo(String periodo){
        this.periodo = periodo;
    }

    public String exibirPeriodo(){
        return this.periodo;
    }

    public void adicionarDisciplina(Disciplina disciplina){
        if (this.disciplinas.isEmpty()){
            this.disciplinas.add(0, disciplina);
        } else if (!this.disciplinas.isEmpty()){
            this.disciplinas.add(this.disciplinas.size(), disciplina);
        }
    }

    public ArrayList<Disciplina> exibirDisciplinas(){
        return this.disciplinas;
    }

    public void listarDisciplinas(){
        if (this.disciplinas.isEmpty()){
            System.out.println("Nenhuma disciplina encontrada!");
        } else {
            for (int i = 0; i < this.disciplinas.size(); i++){
                System.out.println(this.disciplinas.get(i).exibirNome());
            }
        }
    }

    public void adicionarAluno(Aluno aluno){
        if (this.alunos.isEmpty()){
            this.alunos.add(0, aluno);
        } else{
            this.alunos.add(this.alunos.size(), aluno);
        }
    }

    public void exibirAlunos(){
        if (this.alunos.isEmpty()){
            System.out.println("Nenhum aluno encontrado!");
        } else {
            for (int i = 0; i < this.alunos.size(); i++){
                System.out.println(this.alunos.get(i).exibirNome());
            }
        }
    }
}
