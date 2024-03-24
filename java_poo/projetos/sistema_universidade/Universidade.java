package java_poo.projetos.sistema_universidade;

import java.util.ArrayList;
import java.util.Scanner;

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

    public void registrarPessoa(Pessoa pessoa){
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

    public void cadastrarPessoa(){
        Scanner sc = new Scanner(System.in);

        System.out.println("                             ");
        System.out.println("CADASTRAR PESSOA:");
        System.out.println("                             ");
        System.out.print("Nome: ");
        String nome = sc.next();
        sc.nextLine();
        System.out.println("                             ");

        System.out.print("Idade: ");
        int idade = sc.nextInt();
        sc.nextLine();
        System.out.println("                             ");

        System.out.print("CPF: ");
        String cpf = sc.next();
        sc.nextLine();
        System.out.println("                             ");

        System.out.print("Email: ");
        String email = sc.next();
        sc.nextLine();
        System.out.println("                             ");

        System.out.print("Telefone: ");
        String telefone = sc.next();
        sc.nextLine();
        System.out.println("                             ");

        System.out.print("Endereço: ");
        String endereco = sc.next();
        sc.nextLine();
        System.out.println("                             ");
        System.out.println("1 - Continuar");
        System.out.println("0 - Cancelar");
        System.out.println("                             ");
        System.out.print("Opção -> ");
        int opc = sc.nextInt();
        sc.nextLine();
                
        if (opc == 0){
            interfaceSecretaria();
        } else if (opc == 1){
            Pessoa pessoa = new Pessoa(nome, idade, cpf, email, telefone, endereco, this);
            registrarPessoa(pessoa);
            especificarCadastro(pessoa);
        } else if (opc != 0 && opc != 1){
            opcaoInvalida(1);
        }

        
    }

    public void opcaoInvalida(int opc){
        Scanner sc = new Scanner(System.in);

        System.out.println("                             ");
        System.out.println("Opção inválida!");
        System.out.println("                             ");
        System.out.println("1 - Tentar novamente");
        System.out.println("0 - Cancelar");
        System.out.print("Opção -> ");
        int opcI = sc.nextInt();

        if (opcI == 1){
            lobby(opc);;
        } else if (opcI == 0){
            interfaceSecretaria();
        } else {
            opcaoInvalida(opc);
        }
    }

    public void lobby(int opc){
        switch (opc) {
            case 1:
                cadastrarPessoa();
                break;
            case 2:
                definirRaAluno();
                break;
            case 3:
                definirCursoAluno();
                break;
            case 4:
                Curso cursoT = definirCursoAluno();
                definirTurmaAluno(cursoT);
                break;
            case 5:
                Curso cursoD = definirCursoAluno();
                Turma turma = definirTurmaAluno(cursoD);
                definirDisciplinasAluno(turma);
                break;
            case 6:
                definirCursoProfessor();
                break;
            case 7:
                Curso cursoDP = definirCursoProfessor();
                definirDisciplinasProfessor(cursoDP);
                break;
            case 0:
                
                break;
        
            default:
                break;
        }
    }

    public String definirRaAluno(){
        Scanner sc = new Scanner(System.in);

        System.out.println("                             ");
        System.out.println("REGISTRO DE ALUNO:");
        System.out.println("                             ");
        System.out.print("RA: ");
        String ra = sc.next(); 
        sc.nextLine();
        System.out.println("                             ");
        System.out.println("1 - Continuar");
        System.out.println("0 - Cancelar");
        System.out.println("                             ");
        System.out.print("Opção -> ");
        int opc = sc.nextInt();
        sc.nextLine();

        if (opc == 1){
            return ra;
        } else if (opc == 0){
            interfaceSecretaria();
        } else {
            opcaoInvalida(2);
        }
        return ra;
    }

    public Curso definirCursoAluno(){
        Scanner sc = new Scanner(System.in);
        Curso[] curso = new Curso[1];

        System.out.println("                             ");
        System.out.println("CURSO:");
        System.out.println("                             ");
        System.out.println("1 - " + this.cursos.get(0).exibirNome());
        System.out.println("2 - " + this.cursos.get(1).exibirNome());
        System.out.println("                             ");
        System.out.println("3 - Voltar");
        System.out.println("0 - Cancelar");
        System.out.println("                             ");
        System.out.print("Opção -> ");
        int opcC = sc.nextInt();
        sc.nextLine();

        if (opcC == 1){
            curso[0] = this.cursos.get(0);
        } else if (opcC == 2){
            curso[0] = this.cursos.get(1);
        } else if (opcC == 3){
            lobby(2);
        } else if (opcC == 0){
            interfaceSecretaria();
        } else {
            opcaoInvalida(3);
        }

        return curso[0];
    }

    public Turma definirTurmaAluno(Curso curso){
        Scanner sc = new Scanner(System.in);
        Turma[] turma = new Turma[1];

        System.out.println("                             ");
        System.out.println("TURMA:");
        System.out.println("                             ");
        System.out.println("1 - " + curso.exibirTurmas().get(0).exibirNome());
        System.out.println("2 - " + curso.exibirTurmas().get(1).exibirNome());
        System.out.println("                             ");
        System.out.println("3 - Voltar");
        System.out.println("0 - Cancelar");
        System.out.println("                             ");
        System.out.print("Opção -> ");
        int opcT = sc.nextInt();
        sc.nextLine();
        
        if (opcT == 1){
            turma[0] = curso.exibirTurmas().get(0);
        } else if (opcT == 2){
            turma[0] = curso.exibirTurmas().get(1);
        } else if (opcT == 3){
            lobby(3);
        } else if (opcT == 0){
            interfaceSecretaria();
        } else {
            opcaoInvalida(4);
        }

        return turma[0];
    }

    public ArrayList<Disciplina> definirDisciplinasAluno(Turma turma){
        Scanner sc = new Scanner(System.in);
        ArrayList<Disciplina> disciplinas = new ArrayList<Disciplina>();
        int opcD = 9;

        while (opcD != 0){   
            System.out.println("                             ");
            System.out.println("DISCIPLINAS:");
            System.out.println("                             ");
            System.out.println("1 - " + turma.exibirDisciplinas().get(0).exibirNome());
            System.out.println("2 - " + turma.exibirDisciplinas().get(1).exibirNome());
            System.out.println("                             ");
            System.out.println("3 - Voltar");
            System.out.println("4 - Concluir");
            System.out.println("0 - Cancelar");
            System.out.println("                             ");
            System.out.print("Opção -> ");
            opcD = sc.nextInt();
            sc.nextLine();

            if (opcD == 1){
                if (disciplinas.isEmpty()){
                    disciplinas.add(0, turma.exibirDisciplinas().get(0));
                } else{
                    disciplinas.add(disciplinas.size(), turma.exibirDisciplinas().get(0));
                }
            } else if (opcD == 2){
                if (disciplinas.isEmpty()){
                    disciplinas.add(0, turma.exibirDisciplinas().get(1));
                } else{
                    disciplinas.add(disciplinas.size(), turma.exibirDisciplinas().get(1));
                }
            } else if (opcD == 3){
                lobby(4);
            } else if (opcD == 4){
                return disciplinas;
            } else if (opcD == 0) {
                interfaceSecretaria();;
            }else {
                opcaoInvalida(5);
            }
        }

        return disciplinas;
    }

    public Curso definirCursoProfessor(){
        Scanner sc = new Scanner(System.in);
        Curso[] curso = new Curso[1];

        System.out.println("                             ");
        System.out.println("CURSO:");
        System.out.println("                             ");
        System.out.println("1 - " + this.cursos.get(0).exibirNome());
        System.out.println("2 - " + this.cursos.get(1).exibirNome());
        System.out.println("                             ");
        System.out.println("3 - Voltar");
        System.out.println("0 - Cancelar");
        System.out.println("                             ");
        System.out.print("Opção -> ");
        int opcC = sc.nextInt();
        sc.nextLine();

        if (opcC == 1){
            curso[0] = this.cursos.get(0);
        } else if (opcC == 2){
            curso[0] = this.cursos.get(1);
        } else if (opcC == 3){
            lobby(1);
        } else if (opcC == 0){
            interfaceSecretaria();
        } else {
            opcaoInvalida(6);
        }
        
        return curso[0];
    }

    public ArrayList<Disciplina> definirDisciplinasProfessor(Curso curso){
        Scanner sc = new Scanner(System.in);
        ArrayList<Disciplina> disciplinas = new ArrayList<Disciplina>();

        System.out.println("                             ");
        System.out.println("DISCIPLINAS:");
        System.out.println("                             ");
        System.out.println("1 - " + curso.exibirDisciplinas().get(0).exibirNome());
        System.out.println("2 - " + curso.exibirDisciplinas().get(1).exibirNome());
        System.out.println("                             ");
        System.out.println("3 - Voltar");
        System.out.println("4 - Concluir");
        System.out.println("0 - Cancelar");
        System.out.println("                             ");
        System.out.print("Opção -> ");
        int opcD = sc.nextInt();
        sc.nextLine();

        if (opcD == 1){
            if (disciplinas.isEmpty()){
                disciplinas.add(0, curso.exibirDisciplinas().get(0));
            } else{
                disciplinas.add(disciplinas.size(), curso.exibirDisciplinas().get(0));
            }
        } else if (opcD == 2){
            if (disciplinas.isEmpty()){
                disciplinas.add(0, curso.exibirDisciplinas().get(1));
            } else{
                disciplinas.add(disciplinas.size(), curso.exibirDisciplinas().get(1));
            }
        } else if (opcD == 3){
            lobby(6);
        } else if (opcD == 4){
            return disciplinas;
        } else if (opcD == 0) {
            interfaceSecretaria();;
        }else {
            opcaoInvalida(7);
        }

        return disciplinas;
    }

    public String definirSalarioProfessor(){
        Scanner sc = new Scanner(System.in);

        System.out.println("                             ");
        System.out.println("DISCIPLINAS:");
        System.out.println("                             ");
        System.out.print("Salário: ");
        String salario = sc.next();
        
        return salario;
    }

    public void especificarCadastro(Pessoa pessoa){
        Scanner sc = new Scanner(System.in);
        int opc = 9;
        System.out.println("                             ");
        System.out.println("ESPECIFICAÇÃO DE CADASTRO:");
        System.out.println("                             ");
        System.out.println("1 - Matricular como aluno");
        System.out.println("2 - Contratar como professor");
        System.out.println("                             ");
        System.out.println("3 - Voltar");
        System.out.println("0 - Cancelar");
        System.out.println("                             ");
        System.out.print("Opção -> ");
        opc = sc.nextInt();
        sc.nextLine();

        switch (opc) {
            case 1:
                String ra = definirRaAluno();
                Curso curso = definirCursoAluno();
                Turma turma = definirTurmaAluno(curso);
                ArrayList<Disciplina> disciplinas = definirDisciplinasAluno(turma);
                    
                Aluno aluno = new Aluno(pessoa.exibirNome(), pessoa.exibirIdade(), pessoa.exibirCpf(), pessoa.exibirEmail(), pessoa.exibirTelefone(), pessoa.exibirEndereco(), this, ra, curso, turma);

                for (Disciplina disciplina : disciplinas){
                    aluno.adicionarDisciplina(disciplina);
                }
                break;
            case 2:
                Curso cursoProf = definirCursoProfessor();
                ArrayList<Disciplina> disciplinasProfessor = definirDisciplinasProfessor(cursoProf);
                String salario = definirSalarioProfessor();

                Professor professor = new Professor(pessoa.exibirNome(), pessoa.exibirIdade(), pessoa.exibirCpf(), pessoa.exibirEmail(), pessoa.exibirTelefone(), pessoa.exibirEndereco(), this, cursoProf, salario);
                
                for (Disciplina disciplina : disciplinasProfessor){
                    professor.vincularDisciplina(disciplina);
                }
                break;
            case 3:
                pessoasCadastradas.remove(pessoa);
                cadastrarPessoa();
                break;
            case 0:
                sc.close();
                interfaceSecretaria();
                break;
                
            default:
                break;
        }
    }

    public void interfaceSecretaria(){
        Scanner sc = new Scanner(System.in);
        int opc = 9;

        while (opc != 0){
            System.out.println("                             ");
            System.out.println("SECRETARIA " + this.nome + ":");
            System.out.println("                             ");
            System.out.println("1 - Cadastrar pessoa");
            System.out.println("2 - Exibir cursos");
            System.out.println("3 - Exibir usuários cadastrados");
            System.out.println("0 - Sair");
            System.out.println("                   ");
            System.out.print("Opção -> ");
            opc = sc.nextInt();
            sc.nextLine();
            
            switch (opc) {
                case 1:
                    cadastrarPessoa();
                    break;
                case 2:


                    break;
                case 3:


                    break;
                case 0:
                    sc.close();
                    break;
                default:
                    System.out.println("Opção inválida!");

                    break;
            }
        }
    }
}

