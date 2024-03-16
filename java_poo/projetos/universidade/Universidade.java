package java_poo.projetos.universidade;

import java.util.ArrayList;
import java.util.Scanner;

public class Universidade {
    private String nome;
    private String endereco;
    private ArrayList<Pessoa> pessoas;
    private ArrayList<Professor> professores;
    private ArrayList<Aluno> alunos;
    private ArrayList<Curso> cursos;

    public Universidade(String nome, String endereco){
        this.nome = nome;
        this.endereco = endereco;
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
    public ArrayList<Pessoa> getPessoas(){
        return pessoas;
    }
    public void setPessoas(ArrayList<Pessoa> pessoas){
        this.pessoas = pessoas;
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
    
    public void interfaceUniversidade(){
        Scanner sc = new Scanner(System.in);
        int opcao = 9;

        while (opcao != 0){
            System.out.println("                      ");
            System.out.println("== INTERFACE " + this.nome + " ==");
            System.out.println("                      ");
            System.out.println("       CADASTRO:      ");
            System.out.println("                      ");
            System.out.println("1 - Cadastrar pessoa");
            System.out.println("2 - Matricular aluno");
            System.out.println("3 - Contratar professor");
            System.out.println("                      ");
            System.out.println("    GERENCIAMENTO:    ");
            System.out.println("                      ");
            System.out.println("4 - Atribuir notas");
            System.out.println("5 - Listar pessoas cadastradas");
            System.out.println("6 - Listar alunos matriculados");
            System.out.println("7 - Listar professores contratados");
            
        }
    }
}
