package java_poo.projetos.sistema_universidade;

import java.util.ArrayList;

public class Curso {
    private String nome;
    private ArrayList<Turma> turmas;
    private ArrayList<Aluno> alunos = new ArrayList<Aluno>();
    private ArrayList<Professor> professores = new ArrayList<Professor>();
    private ArrayList<Disciplina> disciplinas = new ArrayList<Disciplina>();

    public Curso(String nome){
        this.nome = nome;
    }

    public void adicionarNome(String nome){
        this.nome = nome;
    }

    public String exibirNome(){
        return this.nome;
    }

    public void adicionarTurma(Turma turma){
        if (this.turmas.isEmpty()){
            this.turmas.add(0, turma);
        } else{
            this.turmas.add(this.turmas.size(), turma);
        }
    }

    public void exibirTurmas(){
        if (this.turmas.isEmpty()){
            System.out.println("Nenhuma turma encontrada!");
        } else{
            System.out.println("Turmas do curso de " + this.nome + ":");
            System.out.println("                         ");
            for (int i = 0; i < this.turmas.size(); i++){
                System.out.println(this.turmas.get(i).exibirNome());
            }
        }
    }

    public void adicionarAluno(Aluno aluno){
        if (this.alunos.isEmpty()){
            this.alunos.add(0, aluno);
        } else {
            this.alunos.add(this.alunos.size(), aluno);
        }
    }

    public void exibirAlunos(){
        if (this.alunos.isEmpty()){
            System.out.println("Nenhum aluno encontrado!");
        } else{
            System.out.println("Alunos do curso de " + this.nome + ":");
            System.out.println("                         ");
            for (int i = 0; i < this.alunos.size(); i++){
                System.out.println(this.alunos.get(i).exibirNome());
            }
        }
    }

    public void adicionarProfessor(Professor professor){
        if (this.professores.isEmpty()){
            this.professores.add(0, professor);
        } else {
            this.professores.add(this.professores.size(), professor);
        }
    }

    public void exibirProfessores(){
        if (this.professores.isEmpty()){
            System.out.println("Nenhum professor encontrado!");
        } else{
            System.out.println("Professores do curso de " + this.nome + ":");
            System.out.println("                         ");
            for (int i = 0; i < this.professores.size(); i++){
                System.out.println(this.professores.get(i).exibirNome());
            }
        }
    }

    public void adicionarDisciplina(Disciplina disciplina){
        if (this.disciplinas.isEmpty()){
            this.disciplinas.add(0, disciplina);
        } else {
            this.disciplinas.add(this.disciplinas.size(), disciplina);
        }
    }

    public void exibirDisciplinas(){
        if (this.disciplinas.isEmpty()){
            System.out.println("Nenhuma disciplina encontrada!");
        } else{
            for (int i = 0; i < this.disciplinas.size(); i++){
                System.out.println(this.disciplinas.get(i).exibirNome());
            }
        }
    }
}

