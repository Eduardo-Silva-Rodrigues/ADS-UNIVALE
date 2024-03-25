package java_poo.projetos.sistema_universidade;

import java.util.ArrayList;

public class Disciplina {
    private String nome;
    private Turma turma;
    private Professor professor;
    private ArrayList<Aluno> alunos = new ArrayList<Aluno>();

    public Disciplina(String nome){
        this.nome = nome;
    }

    public void adicionarNome(String nome){
        this.nome = nome;
    }

    public String exibirNome(){
        return this.nome;
    }

    public void adicionarTurma(Turma turma){
        this.turma = turma;
    }

    public String exibirTurma(){
        return this.turma.exibirNome();
    }

    public void adicionarProfessor(Professor professor){
        this.professor = professor;
    }

    public String exibirProfessor(){
        return this.professor.exibirNome();
    }

    public void adicionarAluno(Aluno aluno){
        if (this.alunos.isEmpty()){
            this.alunos.add(0, aluno);
        } else{
            this.alunos.add(this.alunos.size(), aluno);
        }
    }

    public void listarAlunos(){
        if (this.alunos.isEmpty()){
            System.out.println("Nenhum aluno encontrado!");
        } else{
            for (int i = 0; i < this.alunos.size(); i++){
                System.out.println(this.alunos.get(i).exibirNome());
            }
        }
    }

    public ArrayList<Aluno> exibirAlunos(){
        return this.alunos;
    }

}
