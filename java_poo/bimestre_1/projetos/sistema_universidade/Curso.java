package java_poo.bimestre_1.projetos.sistema_universidade;

import java.util.ArrayList;

public class Curso {
    private String nome;
    private ArrayList<Turma> turmas = new ArrayList<Turma>();
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
        } else if (!this.turmas.isEmpty()){
            this.turmas.add(this.turmas.size(), turma);
        }
    }

    public ArrayList<Turma> exibirTurmas(){
        return this.turmas;
    }

    public void listarTurmas(){
        if (this.turmas.isEmpty()){
            System.out.println("Nenhuma turma encontrada!");
        } else{
            System.out.println("TURMAS:");
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

    public void listarAlunos(){
        if (this.alunos.isEmpty()){
            System.out.println("Nenhum aluno encontrado!");
        } else{
            System.out.println("ALUNOS:");
            for (int i = 0; i < this.alunos.size(); i++){
                System.out.println(this.alunos.get(i).exibirNome());
            }
        }
    }

    public ArrayList<Aluno> exibirAlunos(){
        return this.alunos;
    }

    public void adicionarProfessor(Professor professor){
        if (this.professores.isEmpty()){
            this.professores.add(0, professor);
        } else {
            this.professores.add(this.professores.size(), professor);
        }
    }

    public void listarProfessores(){
        if (this.professores.isEmpty()){
            System.out.println("Nenhum professor encontrado!");
        } else{
            System.out.println("PROFESSORES:");
            for (int i = 0; i < this.professores.size(); i++){
                System.out.println(this.professores.get(i).exibirNome());
            }
        }
    }

    public ArrayList<Professor> exibirProfessores(){
        return this.professores;
    }

    public void adicionarDisciplina(Disciplina disciplina){
        if (this.disciplinas.isEmpty()){
            this.disciplinas.add(0, disciplina);
        } else {
            this.disciplinas.add(this.disciplinas.size(), disciplina);
        }
    }

    public ArrayList<Disciplina> exibirDisciplinas(){
        return this.disciplinas;
    }

    public void listarDisciplinas(){
        if (this.disciplinas.isEmpty()){
            System.out.println("Nenhuma disciplina encontrada!");
        } else{
            System.out.println("DISCIPLINAS:");
            for (int i = 0; i < this.disciplinas.size(); i++){
                System.out.println(this.disciplinas.get(i).exibirNome());
            }
        }
    }
}

