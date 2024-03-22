package java_poo.projetos.universidade;

import java.util.ArrayList;
import java.util.Scanner;

public class Universidade {
    private String nome;
    private String endereco;
    private ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
    private ArrayList<Professor> professores = new ArrayList<Professor>();
    private ArrayList<Aluno> alunos = new ArrayList<Aluno>();
    private ArrayList<Curso> cursos = new ArrayList<Curso>();

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
    
    public void continuar(){
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.println("                              ");
        System.out.println("Pressione ENTER para continuar");
        sc.nextLine();
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
            System.out.println("                                  ");
            System.out.println("0 - Sair");
            System.out.println("                                  ");
            System.out.print("Opção: ");
            opcao = sc.nextInt();
            sc.nextLine();
         
            
        switch (opcao) {
            case 1:
                if (pessoas.isEmpty()){
                    pessoas.add(0, cadastrarPessoa());
                } else{
                    pessoas.add(pessoas.size(), cadastrarPessoa());
                }

                continuar();
                break;
            case 2:                
                if (alunos.isEmpty()){
                    alunos.add(0, matricularAluno().get(0));
                } else{
                    alunos.add(alunos.size(), matricularAluno().get(0));
                }

                continuar();
                break;
            case 3:
                if (professores.isEmpty()){
                    professores.add(0, contratarProfessor().get(0));
                } else{
                    professores.add(professores.size(), contratarProfessor().get(0));
                }

                continuar();
                break;
            case 4:
        
                continuar();
                break;
            case 5:
            
                continuar();
                break;
            case 6:
            
                continuar();
                break;
            case 7:
            
                continuar();
                break;
            case 0:
                sc.close();
                break;
    
            default:
                System.out.println("Opção inválida!");
                continuar();
                break;
            }
        }
    }    

    public Pessoa cadastrarPessoa(){
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.println("                 ");
        System.out.println("CADASTRAR PESSOA:");
        System.out.println("                 ");
        System.out.println("Nome:");
        String nome = sc.next();
        sc.nextLine();
        System.out.println("Email:");
        String email = sc.next();
        sc.nextLine();
        System.out.println("Telefone:");
        String telefone = sc.next();
        sc.nextLine();
        System.out.println("CPF:");
        String cpf = sc.next();
        sc.nextLine();
        System.out.println("Endereço:");
        String endereco = sc.next();
        sc.nextLine();

        Pessoa pessoa = new Pessoa(nome, email, telefone, cpf, endereco);
        
        return pessoa;
    }

    public ArrayList<Aluno> matricularAluno(){
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        ArrayList<Aluno> aluno = new ArrayList<Aluno>();
        int opc;

        System.out.println("                      ");
        System.out.println("MATRICULAR ALUNO");
        System.out.println("                      ");
        System.out.println("Nome:");
        String nome = sc.next();
        sc.nextLine();
        System.out.println("Email:");
        String email = sc.next();
        sc.nextLine();
        System.out.println("Telefone:");
        String telefone = sc.next();
        sc.nextLine();
        System.out.println("CPF:");
        String cpf = sc.next();
        sc.nextLine();
        System.out.println("Endereço:");
        String endereco = sc.next();
        sc.nextLine();

        System.out.println("      ");
        System.out.println("CURSO:");
        System.out.println("      ");
        System.out.println("1 - Análise e Desenvolvimento de Sistemas");
        System.out.println("2 - Medicina Veterinária");
        System.out.println("3 - Agronomia");
        System.out.print("Opção: ");
        opc = sc.nextInt();
        sc.nextLine();

        switch (opc){
            case 1:
                System.out.println("             ");
                System.out.println("OUTROS DADOS:");
                System.out.println("             ");
                System.out.println("Semestre:");
                int semestreAds = sc.nextInt();
                sc.hasNextLine();
                System.out.println("Turma:");
                String turmaAds = sc.next();
                sc.hasNextLine();

                Aluno alunoAds = new Aluno(nome, email, telefone, cpf, endereco, cursos.get(0), cursos.get(0).getDisciplinas(), turmaAds, semestreAds);
                aluno.add(0, alunoAds); 
                break;          
            
            case 2:
                System.out.println("             ");
                System.out.println("OUTROS DADOS:");
                System.out.println("             ");
                System.out.println("Semestre:");
                int semestreVet = sc.nextInt();
                sc.hasNextLine();
                System.out.println("Turma:");
                String turmaVet = sc.next();
                sc.hasNextLine();

                Aluno alunoVet = new Aluno(nome, email, telefone, cpf, endereco, cursos.get(1), cursos.get(1).getDisciplinas(), turmaVet, semestreVet);
                aluno.add(0, alunoVet);
                break;
            case 3:
                System.out.println("             ");
                System.out.println("OUTROS DADOS:");
                System.out.println("             ");
                System.out.println("Semestre:");
                int semestreAgro = sc.nextInt();
                sc.hasNextLine();
                System.out.println("Turma:");
                String turmaAgro = sc.next();
                sc.hasNextLine();

                Aluno alunoAgro = new Aluno(nome, email, telefone, cpf, endereco, cursos.get(2), cursos.get(2).getDisciplinas(), turmaAgro, semestreAgro);
                aluno.add(0, alunoAgro);
                break;
            }
            return aluno;
        }

    public ArrayList<Professor> contratarProfessor(){
        ArrayList<Professor> professor = new ArrayList<Professor>();
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int opcao;

        System.out.println("                      ");
        System.out.println("CONTRATAR PROFESSOR");
        System.out.println("                      ");
        System.out.println("Nome:");
        String nome = sc.next();
        sc.nextLine();
        System.out.println("Email:");
        String email = sc.next();
        sc.nextLine();
        System.out.println("Telefone:");
        String telefone = sc.next();
        sc.nextLine();
        System.out.println("CPF:");
        String cpf = sc.next();
        sc.nextLine();
        System.out.println("Endereço:");
        String endereco = sc.next();
        sc.nextLine();

        System.out.println("                      ");
        System.out.println("CURSO:");
        System.out.println("                      ");
        System.out.println("1 - Análise e Desenvolvimento de Sistemas");
        System.out.println("2 - Medicina Veterinária");
        System.out.println("3 - Agronomia");
        int opc = sc.nextInt();
        sc.nextLine();

        switch (opc){
            case 1:
                System.out.println("             ");
                System.out.println("OUTROS DADOS:");
                System.out.println("             ");
                System.out.println("Disciplina:");
                System.out.println("1 - Programação Orientada Objeto");
                System.out.println("2 - Banco de Dados");
                System.out.println("3 - Análise e Projeto de Sistemas");
                opcao = sc.nextInt();
                sc.hasNextLine();
                if (opcao == 1){
                    Disciplina disciplina = cursos.get(0).getDisciplinas().get(0);

                    System.out.println("             ");
                    System.out.println("Salário:");
                    String salarioProfAds = sc.next();
                    sc.hasNextLine();

                    Professor professorAds = new Professor(nome, email, telefone, cpf, endereco, cursos.get(0), disciplina, salarioProfAds);
                    professor.add(0, professorAds);
                } else if (opcao == 2){
                    Disciplina disciplina = cursos.get(1).getDisciplinas().get(1);

                    System.out.println("             ");
                    System.out.println("Salário:");
                    String salarioProfAds = sc.next();
                    sc.hasNextLine();

                    Professor professorAds = new Professor(nome, email, telefone, cpf, endereco, cursos.get(1), disciplina, salarioProfAds);
                    professor.add(0, professorAds);
                } else if (opcao == 3){
                    Disciplina disciplina = cursos.get(2).getDisciplinas().get(2);

                    System.out.println("             ");
                    System.out.println("Salário:");
                    String salarioProfAds = sc.next();
                    sc.hasNextLine();

                    Professor professorAds = new Professor(nome, email, telefone, cpf, endereco, cursos.get(2), disciplina, salarioProfAds);
                    professor.add(0, professorAds);
                } 
                break;          
            
            case 2:
                System.out.println("             ");
                System.out.println("OUTROS DADOS:");
                System.out.println("             ");
                System.out.println("Disciplina:");
                System.out.println("1 - Anatomia");
                System.out.println("2 - Deontologia");
                System.out.println("3 - Embriologia");
                opcao = sc.nextInt();
                sc.hasNextLine();
                if (opcao == 1){
                    Disciplina disciplina = cursos.get(0).getDisciplinas().get(0);

                    System.out.println("             ");
                    System.out.println("Salário:");
                    String salarioProfAds = sc.next();
                    sc.hasNextLine();

                    Professor professorAds = new Professor(nome, email, telefone, cpf, endereco, cursos.get(0), disciplina, salarioProfAds);
                    professor.add(0, professorAds);
                } else if (opcao == 2){
                    Disciplina disciplina = cursos.get(1).getDisciplinas().get(1);

                    System.out.println("             ");
                    System.out.println("Salário:");
                    String salarioProfAds = sc.next();
                    sc.hasNextLine();

                    Professor professorAds = new Professor(nome, email, telefone, cpf, endereco, cursos.get(1), disciplina, salarioProfAds);
                    professor.add(0, professorAds);
                } else if (opcao == 3){
                    Disciplina disciplina = cursos.get(2).getDisciplinas().get(2);

                    System.out.println("             ");
                    System.out.println("Salário:");
                    String salarioProfAds = sc.next();
                    sc.hasNextLine();

                    Professor professorAds = new Professor(nome, email, telefone, cpf, endereco, cursos.get(2), disciplina, salarioProfAds);
                    professor.add(0, professorAds);
                } 
                break; 
            case 3:
                System.out.println("             ");
                System.out.println("OUTROS DADOS:");
                System.out.println("             ");
                System.out.println("Disciplina:");
                System.out.println("1 - Climatologia");
                System.out.println("2 - Estatistica");
                System.out.println("3 - Entomologia");
                opcao = sc.nextInt();
                sc.hasNextLine();
                if (opcao == 1){
                    Disciplina disciplina = cursos.get(0).getDisciplinas().get(0);

                    System.out.println("             ");
                    System.out.println("Salário:");
                    String salarioProfAds = sc.next();
                    sc.hasNextLine();

                    Professor professorAds = new Professor(nome, email, telefone, cpf, endereco, cursos.get(0), disciplina, salarioProfAds);
                    professor.add(0, professorAds);
                } else if (opcao == 2){
                    Disciplina disciplina = cursos.get(1).getDisciplinas().get(1);

                    System.out.println("             ");
                    System.out.println("Salário:");
                    String salarioProfAds = sc.next();
                    sc.hasNextLine();

                    Professor professorAds = new Professor(nome, email, telefone, cpf, endereco, cursos.get(1), disciplina, salarioProfAds);
                    professor.add(0, professorAds);
                } else if (opcao == 3){
                    Disciplina disciplina = cursos.get(2).getDisciplinas().get(2);

                    System.out.println("             ");
                    System.out.println("Salário:");
                    String salarioProfAds = sc.next();
                    sc.hasNextLine();

                    Professor professorAds = new Professor(nome, email, telefone, cpf, endereco, cursos.get(2), disciplina, salarioProfAds);
                    professor.add(0, professorAds);
                } 
                break; 
            }
        return professor;
    }
}





