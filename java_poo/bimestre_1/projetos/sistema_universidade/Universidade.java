package java_poo.bimestre_1.projetos.sistema_universidade;

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
            for (int i = 0; i < this.pessoasCadastradas.size(); i++){
                System.out.println((i+1) + " - " + this.pessoasCadastradas.get(i).exibirNome());
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
            for (int i = 0; i < this.professoresContratados.size(); i++){
                System.out.println((i+1) + " - " + this.professoresContratados.get(i).exibirNome());
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
            for (int i = 0; i < this.alunosMatriculados.size(); i++)
                System.out.println((i+1) + " - " + this.alunosMatriculados.get(i).exibirNome());
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
        System.out.println("9 - Encerrar tudo");
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
        } else if (opc == 9){
            sc.close();
        } else if (opc != 0 && opc != 1){
            opcaoInvalida();
        }

        
    }

    public void opcaoInvalida(){
        Scanner sc = new Scanner(System.in);

        System.out.println("                             ");
        System.out.println("Opção inválida!");
        System.out.println("                             ");
        System.out.println("9 - Encerrar tudo");
        System.out.println("0 - Retornar para o começo");
        System.out.println("                             ");
        System.out.print("Opção -> ");
        int opcI = sc.nextInt();

         if (opcI == 0){
            interfaceSecretaria();
        } else if (opcI == 9){
            sc.close();
        } else if (opcI != 0 || opcI != 9) {
            opcaoInvalida();
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

        if (ra == "-1"){
            sc.close();
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
        System.out.println("9 - Encerrar tudo");
        System.out.println("0 - Cancelar");
        System.out.println("                             ");
        System.out.print("Opção -> ");
        int opcC = sc.nextInt();
        sc.nextLine();

        if (opcC == 1){
            curso[0] = this.cursos.get(0);
        } else if (opcC == 2){
            curso[0] = this.cursos.get(1);
        } else if (opcC == 9){
            sc.close();
        } else if (opcC == 0){
            interfaceSecretaria();
        } else {
            opcaoInvalida();
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
        System.out.println("9 - Encerrar tudo");
        System.out.println("0 - Cancelar");
        System.out.println("                             ");
        System.out.print("Opção -> ");
        int opcT = sc.nextInt();
        sc.nextLine();
        
        if (opcT == 1){
            turma[0] = curso.exibirTurmas().get(0);
        } else if (opcT == 2){
            turma[0] = curso.exibirTurmas().get(1);
        } else if (opcT == 9){
            sc.close();
        } else if (opcT == 0){
            interfaceSecretaria();
        } else {
            opcaoInvalida();
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
            System.out.println("3 - Continuar");
            System.out.println("             ");
            System.out.println("9 - Encerrar tudo");
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
                return disciplinas;
            } else if (opcD == 9){
                sc.close();
            } else if (opcD == 0) {
                interfaceSecretaria();;
            }else {
                opcaoInvalida();
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
        System.out.println("9 - Encerrar tudo");
        System.out.println("0 - Cancelar");
        System.out.println("                             ");
        System.out.print("Opção -> ");
        int opcC = sc.nextInt();
        sc.nextLine();

        if (opcC == 1){
            curso[0] = this.cursos.get(0);
        } else if (opcC == 2){
            curso[0] = this.cursos.get(1);
        } else if (opcC == 9){
            sc.close();
        } else if (opcC == 0){
            interfaceSecretaria();
        } else {
            opcaoInvalida();
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
        System.out.println("9 - Encerrar tudo");
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
        } else if (opcD == 9){
            sc.close();
        } else if (opcD == 0) {
            interfaceSecretaria();;
        }else {
            opcaoInvalida();
        }

        return disciplinas;
    }

    public String definirSalarioProfessor(){
        Scanner sc = new Scanner(System.in);

        System.out.println("                             ");
        System.out.println("DISCIPLINAS:");
        System.out.println("                             ");
        System.out.println("0 - Encerrar tudo");
        System.out.println("                             ");
        System.out.print("Salário: ");
        String salario = sc.next();
        
        if (salario == "0"){
            sc.close();
        }

        return salario;
    }

    public int exibirCursosUniversidade(){
        Scanner sc = new Scanner(System.in);
        int container = 0;

        System.out.println("                                        ");
        System.out.println("CURSOS DA " + this.exibirNome() + ":");
        System.out.println("                                    ");
        for (int i = 0; i < this.cursos.size(); i++){
            container = (i + 1);
            System.out.println((i + 1) + " - " + this.cursos.get(i).exibirNome());
        }
        System.out.println("                                    ");
        System.out.println("0 - Encerrar tudo");
        System.out.println("                                    ");
        System.out.print("Opção -> ");
        int opcIC = sc.nextInt();
        sc.nextLine();

        if (opcIC > container){
            opcaoInvalida();
        } else if (opcIC == 0){
            sc.close();
        }

        return opcIC;
    }

    public int[] exibirInformacoesCurso(int opcIC){
        Scanner sc = new Scanner(System.in);
        
        int[] container = new int[2];

        for (int i = 0; i < this.cursos.size(); i++){
            if ((i + 1) == opcIC){
                System.out.println("                                        ");
                System.out.println("NOME:");
                System.out.println(this.cursos.get(i).exibirNome());
                System.out.println("                                        ");
                this.cursos.get(i).listarTurmas();
                System.out.println("                                        ");
                this.cursos.get(i).listarDisciplinas();
                System.out.println("                                        ");
                this.cursos.get(i).listarProfessores();
                System.out.println("                                        ");
                this.cursos.get(i).listarAlunos();
                System.out.println("________________________________________");
                container[0] = i;
            }
        }
        System.out.println("                   ");
        System.out.println("Exibir informações:");
        System.out.println("1 - Turmas");
        System.out.println("2 - Disciplinas");
        System.out.println("3 - Professores");
        System.out.println("4 - Alunos");
        System.out.println("         ");
        System.out.println("9 - Encerrar tudo");
        System.out.println("0 - Cancelar");
        System.out.println("         ");
        System.out.print("Opção -> ");
        int opc = sc.nextInt();
        sc.nextLine();
        container[1] = opc;

        if (opc == 9){
            sc.close();
        } else if (opc == 0){
            interfaceSecretaria();
        }

        return container;
    }

    public void exibirInformacoesTurmas(int opc){
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < this.cursos.size(); i++){
            System.out.println("________________________________________");
            System.out.println("                       ");
            System.out.println(this.cursos.get(opc).exibirTurmas().get(i).exibirNome().toUpperCase());
            System.out.println("Semestre: " + this.cursos.get(opc).exibirTurmas().get(i).exibirSemestre());
            System.out.println("Periodo: " + this.cursos.get(opc).exibirTurmas().get(i).exibirPeriodo());
            System.out.println("                       ");
            System.out.println("DISCIPLINAS:");
            this.cursos.get(opc).exibirTurmas().get(i).listarDisciplinas();
            System.out.println("                       ");
            System.out.println("ALUNOS:");
            this.cursos.get(opc).exibirTurmas().get(i).exibirAlunos();
        }
        System.out.println("________________________________________");
        System.out.println("                   ");
        System.out.println("9 - Encerrar tudo");
        System.out.println("0 - Cancelar");
        System.out.println("         ");
        System.out.print("Opção -> ");
        int opcIT = sc.nextInt();
        sc.nextLine();

        if (opcIT == 0){
            interfaceSecretaria();
        } else if (opcIT == 9){
            sc.close();
        } else {
            opcaoInvalida();
        }
    }

    public void exibirInformacoesDisciplinas(int opc){
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < this.cursos.size(); i++){
            System.out.println("________________________________________");
            System.out.println("                       ");
            System.out.println(this.cursos.get(opc).exibirDisciplinas().get(i).exibirNome().toUpperCase());
            System.out.println("Turma: " + this.cursos.get(opc).exibirDisciplinas().get(i).exibirTurma());
            System.out.println("Professor: " + this.cursos.get(opc).exibirDisciplinas().get(i).exibirProfessor());
            System.out.println("                       ");
            System.out.println("Alunos:");
            this.cursos.get(opc).exibirDisciplinas().get(i).exibirAlunos();
        }
        System.out.println("________________________________________");
        System.out.println("                   ");
        System.out.println("9 - Encerrar tudo");
        System.out.println("0 - Cancelar");
        System.out.println("         ");
        System.out.print("Opção -> ");
        int opcID = sc.nextInt();
        sc.nextLine();

        if (opcID == 0){
            interfaceSecretaria();
        } else if (opcID == 9){
            sc.close();
        } else {
            opcaoInvalida();
        }
    }

    public void exibirInformacoesProfessores(int opc){
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < this.cursos.size(); i++){
            System.out.println("________________________________________");
            System.out.println("                       ");
            System.out.println(this.cursos.get(opc).exibirProfessores().get(i).exibirNome().toUpperCase());
            System.out.println("Curso: " + this.cursos.get(opc).exibirProfessores().get(i).exibirCurso().exibirNome());
            System.out.println("Salário: " + this.cursos.get(opc).exibirProfessores().get(i).exibirSalario());
            System.out.println("                       ");
            System.out.println("Disiciplinas:");
            this.cursos.get(opc).exibirProfessores().get(i).exibirDisciplinas();;
        }
        System.out.println("________________________________________");
        System.out.println("                   ");
        System.out.println("9 - Encerrar tudo");
        System.out.println("0 - Cancelar");
        System.out.println("         ");
        System.out.print("Opção -> ");
        int opcID = sc.nextInt();
        sc.nextLine();

        if (opcID == 0){
            interfaceSecretaria();
        } else if (opcID == 9){
            sc.close();
        } else {
            opcaoInvalida();
        }
    }

    public void exibirInformacoesAlunos(int opc){
        Scanner sc = new Scanner(System.in);

        System.out.println("ALUNOS DO CURSO " + this.cursos.get(opc).exibirNome().toUpperCase());
        for (int i = 0; i < this.cursos.size(); i++){
            System.out.println("________________________________________");
            System.out.println("                       ");
            System.out.println("RA: " + this.cursos.get(opc).exibirAlunos().get(i).exibirRa());
            System.out.println("Nome: " + this.cursos.get(opc).exibirAlunos().get(i).exibirNome());
            System.out.println("Curso: " + this.cursos.get(opc).exibirAlunos().get(i).exibirCurso().exibirNome());
            System.out.println("Turma: " + this.cursos.get(opc).exibirAlunos().get(i).exibirTurma().exibirNome());
            System.out.println("                       ");
            System.out.println("Disiciplinas:");
            this.cursos.get(opc).exibirAlunos().get(i).exibirDisciplinas();;
        }
        System.out.println("________________________________________");
        System.out.println("                   ");
        System.out.println("9 - Encerrar tudo");
        System.out.println("0 - Cancelar");
        System.out.println("         ");
        System.out.print("Opção -> ");
        int opcID = sc.nextInt();
        sc.nextLine();

        if (opcID == 0){
            interfaceSecretaria();
        } else if (opcID == 9){
            sc.close();
        } else {
            opcaoInvalida();
        }
    }

    public void informadorCurso(int[] container){
        if (container[1] == 1){
            exibirInformacoesTurmas(container[0]);
        } else if (container[1] == 2){
            exibirInformacoesDisciplinas(container[0]);
        } else if (container[1] == 3){
            exibirInformacoesProfessores(container[0]);
        } else if (container[1] == 4){
            exibirInformacoesAlunos(container[0]);
        } else {
            opcaoInvalida();
        }
    }

    public int exibirUsuariosCadastrados(){
        Scanner sc = new Scanner(System.in);

        System.out.println("EXIBIR USUÁRIOS CADASTRADOS");
        System.out.println("                     ");
        System.out.println("1 - Alunos");
        System.out.println("2 - Professores");
        System.out.println("3 - Todos");
        System.out.println("         ");
        System.out.println("9 - Encerrar tudo");
        System.out.println("0 - Cancelar");
        System.out.println("________________________________________");
        System.out.print("Opção -> ");
        int opc = sc.nextInt();
        sc.nextLine();

        if (opc == 9){
            sc.close();
        } else if (opc == 0){
            interfaceSecretaria();
        }

        return opc;
    }

    public int exibirAlunosMatriculados(){
        Scanner sc = new Scanner(System.in);

        System.out.println("                    ");
        System.out.println("ALUNOS MATRICULADOS:");
        System.out.println("                    ");
        this.alunosMatriculados.get(0).listar();
        System.out.println("________________________________________");
        System.out.println("                    ");
        System.out.println("0 - Encerrar tudo");
        System.out.println("                    ");
        System.out.print("Opção -> ");
        int opc = sc.nextInt();
        sc.nextLine();

        if (opc == 0){
            sc.close();
        }

        return opc;
    }

    public int exibirProfessoresContratados(){
        Scanner sc = new Scanner(System.in);

        System.out.println("                    ");
        System.out.println("PROFESSORES CONTRATADOS:");
        System.out.println("                    ");
        this.professoresContratados.get(0).listar();
        System.out.println("________________________________________");
        System.out.println("                    ");
        System.out.println("0 - Encerrar tudo");
        System.out.println("                    ");
        System.out.print("Opção -> ");
        int opc = sc.nextInt();
        sc.nextLine();

        if (opc == 0){
            sc.close();
        }

        return opc;
    }

    public int exibirPessoasCadastradas(){
        Scanner sc = new Scanner(System.in);

        System.out.println("                    ");
        System.out.println("TODOS OS USUÁRIOS CADASTRADOS:");
        System.out.println("                    ");
        this.pessoasCadastradas.get(0).listar();
        System.out.println("________________________________________");
        System.out.println("                    ");
        System.out.println("0 - Encerrar tudo");
        System.out.println("                    ");
        System.out.print("Opção -> ");
        int opc = sc.nextInt();
        sc.nextLine();

        if (opc == 0){
            sc.close();
        }

        return opc;
    }

    public void exibirInformacoesAluno(int opc){
        Scanner sc = new Scanner(System.in);

        System.out.println("                                        ");
        System.out.println(this.alunosMatriculados.get(opc-1).exibirNome().toUpperCase());
        System.out.println("Idade: " + this.alunosMatriculados.get(opc-1).exibirIdade());
        System.out.println("CPF: " + this.alunosMatriculados.get(opc-1).exibirCpf());
        System.out.println("Email: " + this.alunosMatriculados.get(opc-1).exibirEmail());
        System.out.println("Telefone: " + this.alunosMatriculados.get(opc-1).exibirTelefone());
        System.out.println("Endereço: " + this.alunosMatriculados.get(opc-1).exibirEndereco());
        System.out.println("RA: " + this.alunosMatriculados.get(opc-1).exibirRa());
        System.out.println("Curso: " + this.alunosMatriculados.get(opc-1).exibirCurso());
        System.out.println("Turma: " + this.alunosMatriculados.get(opc-1).exibirTurma());
        System.out.println("________________________________________");
        System.out.println("                                        ");
        System.out.println("9 - Encerrar tudo");
        System.out.println("0 - Cancelar");
        System.out.println("                                        ");
        System.out.print("Opção -> ");
        int opcIA = sc.nextInt();
        sc.nextLine();

        if (opcIA == 0){
            interfaceSecretaria();
        } else if (opcIA == 9){
            sc.close();
        } else {
            opcaoInvalida();
        }
    }

    public void exibirInformacoesProfessor(int opc){
        Scanner sc = new Scanner(System.in);

        System.out.println("                                        ");
        System.out.println(this.professoresContratados.get(opc-1).exibirNome().toUpperCase());
        System.out.println("Idade: " + this.professoresContratados.get(opc-1).exibirIdade());
        System.out.println("CPF: " + this.professoresContratados.get(opc-1).exibirCpf());
        System.out.println("Email: " + this.professoresContratados.get(opc-1).exibirEmail());
        System.out.println("Telefone: " + this.professoresContratados.get(opc-1).exibirTelefone());
        System.out.println("Endereço: " + this.professoresContratados.get(opc-1).exibirEndereco());
        System.out.println("Curso: " + this.professoresContratados.get(opc-1).exibirCurso().exibirNome());
        System.out.println("Salário: " + this.professoresContratados.get(opc-1).exibirSalario());
        System.out.println("________________________________________");
        System.out.println("                                        ");
        System.out.println("0 - Cancelar");
        System.out.println("                                        ");
        System.out.print("Opção -> ");
        int opcIP = sc.nextInt();
        sc.nextLine();

        if (opcIP == 0){
            interfaceSecretaria();
        } else if (opcIP == 9){
            sc.close();
        } else {
            opcaoInvalida();
        }
    }

    public void exibirInformacoesPessoa(int opc){
        Scanner sc = new Scanner(System.in);

        System.out.println("                                        ");
        System.out.println(this.pessoasCadastradas.get(opc-1).exibirNome().toUpperCase());
        System.out.println("Idade: " + this.pessoasCadastradas.get(opc-1).exibirIdade());
        System.out.println("CPF: " + this.pessoasCadastradas.get(opc-1).exibirCpf());
        System.out.println("Email: " + this.pessoasCadastradas.get(opc-1).exibirEmail());
        System.out.println("Telefone: " + this.pessoasCadastradas.get(opc-1).exibirTelefone());
        System.out.println("Endereço: " + this.pessoasCadastradas.get(opc-1).exibirEndereco());

        System.out.println("________________________________________");
        System.out.println("                                        ");
        System.out.println("9 - Encerrar tudo");
        System.out.println("0 - Cancelar");
        System.out.println("                                        ");
        System.out.print("Opção -> ");
        int opcIPE = sc.nextInt();
        sc.nextLine();

        if (opcIPE == 0){
            interfaceSecretaria();
        } else if (opcIPE == 9){
            sc.close();
        } else {
            opcaoInvalida();
        }
    }

    public void especificarCadastro(Pessoa pessoa){
        Scanner sc = new Scanner(System.in);
        int opc = 9;
        System.out.println("                             ");
        System.out.println("ESPECIFICAÇÃO DE CADASTRO:");
        System.out.println("                             ");
        System.out.println("1 - Matricular como aluno");
        System.out.println("2 - Contratar como professor");
        System.out.println("________________________________________");
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
                    int opcC1 = exibirCursosUniversidade();
                    int[] opcC2 = exibirInformacoesCurso(opcC1);
                    informadorCurso(opcC2);
                    break;
                case 3:
                    int opcUC = exibirUsuariosCadastrados();

                    if (opcUC == 1){
                        int opcAM = exibirAlunosMatriculados();
                        exibirInformacoesAluno(opcAM);
                    } else if (opcUC == 2){
                        int opcPC = exibirProfessoresContratados();
                        exibirInformacoesProfessor(opcPC);
                    } else if (opcUC == 3){
                        int opcPCA = exibirPessoasCadastradas();
                        exibirInformacoesPessoa(opcPCA);
                    } else {
                        opcaoInvalida();
                    }
                    break;
                case 0:
                    System.out.println("Sistema encerrado!");
                    sc.close();
                    break;
                default:
                    System.out.println("               ");
                    System.out.println("Opção inválida!");

                    break;
            }
        }
    }
}

