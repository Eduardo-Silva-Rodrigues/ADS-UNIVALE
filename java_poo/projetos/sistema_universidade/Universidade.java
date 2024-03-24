package java_poo.projetos.sistema_universidade;

import java.util.ArrayList;

public class Universidade {
    private String nome;
    private String endereco;
    private ArrayList<Curso> cursos = new ArrayList<Curso>();
    private ArrayList<Pessoa> pessoasCadastradas = new ArrayList<Pessoa>();
    private ArrayList<Professor> professoresContratados = new ArrayList<Professor>();
    private ArrayList<Aluno> alunosMatriculados = new ArrayList<Aluno>();
    
    public Universidade(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public void adicionarNome(String nome){
        this.nome = nome;
    }

    public String exibirNome(){
        return nome;
    }

    public void adicionarEndereco(String endereco){
        this.endereco = endereco;
    }

    public String exibirEndereco(){
        return this.endereco;
    }

    public void adicionarCurso(Curso curso){
        if (this.cursos.isEmpty()){
            this.cursos.add(0, curso);
        } else{
            cursos.add(cursos.size(), curso);
        }
    }

    public void exibirCursos(){
        if (this.cursos.isEmpty()){
            System.out.println("Nenhum curso encontrado!");
        } else {
            System.out.println("Cursos da " + this.nome + ":");
            System.out.println("                          ");
            for (int i = 0; i < this.cursos.size(); i++){
                System.out.println(this.cursos.get(i).exibirNome());
            }
        }
    }

    public void cadastrarPessoa(Pessoa pessoa){
        if (this.pessoasCadastradas.isEmpty()){
            this.pessoasCadastradas.add(0, pessoa);
        } else{
            this.pessoasCadastradas.add(this.pessoasCadastradas.size(), pessoa);
        }
    }

    public void exibirPessoas(){
        if (this.pessoasCadastradas.isEmpty()){
            System.out.println("Nenhuma pessoa cadastrada!");
        } else {
            System.out.println("Pessoas cadastradas:");
            System.out.println("                    ");
            for (int i = 0; i < this.pessoasCadastradas.size(); i++){
                System.out.println(this.pessoasCadastradas.get(i).exibirNome());
            }
        }
    }

    public void contratarProfessor(Professor professor){
        if (this.professoresContratados.isEmpty()){
            this.professoresContratados.add(0, professor);
        } else {
            this.professoresContratados.add(this.professoresContratados.size(), professor);
        }
    }

    public void exibirProfessores(){
        if (this.professoresContratados.isEmpty()){
            System.out.println("Nenhum professor encontrado!");
        } else{
            System.out.println("Professores registrados:");
            System.out.println("                    ");
            for (int i = 0; i < this.professoresContratados.size(); i++){
                System.out.println(this.professoresContratados.get(i).exibirNome());
            }
        }
    }

    public void matricularAluno(Aluno aluno){
        if (this.alunosMatriculados.isEmpty()){
            this.alunosMatriculados.add(0, aluno);
        } else{
            this.alunosMatriculados.add(this.alunosMatriculados.size(), aluno);
        }
    }

    public void exibirAlunos(){
        if (this.alunosMatriculados.isEmpty()){
            System.out.println("Nenhum aluno encontrado!");
        } else{
            System.out.println("Alunos matriculados:");
            System.out.println("                    ");
            for (int i = 0; i < this.alunosMatriculados.size(); i++)
                System.out.println(this.alunosMatriculados.get(i).exibirNome());
        }
    }
}
