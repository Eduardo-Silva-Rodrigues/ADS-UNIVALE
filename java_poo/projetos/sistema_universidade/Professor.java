package java_poo.projetos.sistema_universidade;

import java.util.ArrayList;
import java.util.Scanner;

public class Professor extends Pessoa {
    private Curso curso;
    private ArrayList<Disciplina> disciplinas = new ArrayList<Disciplina>();
    private ArrayList<Boletim> boletins = new ArrayList<Boletim>();
    private String salario;

    public Professor(String nome, int idade, String cpf, String email, String telefone, String endereco, Universidade universidade, Curso curso, String salario){
        super(nome, idade, cpf, email, telefone, endereco, universidade);
        this.curso = curso;
        this.salario = salario;

    }

    public void vincularCurso(Curso curso){
        this.curso = curso;
    }

    public Curso exibirCurso(){
        return this.curso;
    }

    public void vincularDisciplina(Disciplina disciplina){
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

    public int selecaoAlunos(int opc){
        Scanner sc = new Scanner(System.in);
        int opcA = 0;

        System.out.println("            ");
        System.out.println("ALUNOS:");
        System.out.println("            ");
        for (int i = 0; i < this.disciplinas.get(opc - 1).exibirAlunos().size(); i++){
            System.out.println((i + 1) + " - " + this.disciplinas.get(opc - 1).exibirAlunos().get(i).exibirNome());
        }
        System.out.println("___________________________________");
        System.out.println("            ");
        System.out.println("0 - Encerrar tudo");
        System.out.println("            ");
        System.out.print("Opção -> ");
        opcA = sc.nextInt();
        sc.nextLine();
        
        if (opcA == 0){
            sc.close();
        }

        return opcA;
    }

    public int selecaoDisciplinas(){
        Scanner sc = new Scanner(System.in);

        System.out.println("            ");
        System.out.println("DISCIPLINAS:");
        System.out.println("            ");
        for (int i = 0; i < this.disciplinas.size(); i++){
            System.out.println((i + 1) + " - " + this.disciplinas.get(i).exibirNome());
        }
        System.out.println("___________________________________");
        System.out.println("            ");
        System.out.println("0 - Encerrar tudo");
        System.out.println("            ");
        System.out.print("Opção -> ");
        int opc = sc.nextInt();
        sc.nextLine();

        if (opc == 0){
            sc.close();
        }
        
        return opc;
    }

    public void adicionarSalario(String salario){
        this.salario = salario;
    }

    public String exibirSalario(){
        return this.salario;
    }

    public Boletim gerarBoletim(String ra){
        Boletim boletim = new Boletim(ra);

        // Adicionando nome do aluno no boletim
        for (int i = 0; i < this.disciplinas.size(); i++){
            for (int j = 0; j < this.disciplinas.size(); j++){
                if (this.disciplinas.get(i).exibirAlunos().get(j).exibirRa() == ra){
                    boletim.adicionarNome(this.disciplinas.get(i).exibirAlunos().get(j).exibirNome());
                }
            }
        }

        // Adicionando o curso no boletim
        boletim.adicionarCurso(this.curso);

        // Adicionando as disciplinas no boletim
        for (int i = 0; i < this.disciplinas.size(); i++){
            boletim.adicionarDisciplina(this.disciplinas.get(0));
        }

        // Adicionando a turma no boletim
        for (int i = 0; i < this.disciplinas.size(); i++){
            for (int j = 0; j < this.disciplinas.size(); j++){
                if (this.disciplinas.get(i).exibirAlunos().get(j).exibirRa() == ra){
                    boletim.adicionarTurma(this.disciplinas.get(i).exibirAlunos().get(j).exibirTurma());
                }
            }
        }

        //Atribuindo notas
        boletim.adicionarNotasAtividade();
        boletim.adicionarNotasTrabalho();
        boletim.adicionarNotasProva();

        return boletim;
    }

    public int exibirBoletins(){
        Scanner sc = new Scanner(System.in);

        System.out.println("            ");
        System.out.println("BOLETINS:");
        System.out.println("            ");
        for (int i = 0; i < this.boletins.size(); i++){
            System.out.println((i + 1) + " - " + this.boletins.get(i).exibirNome());
        }
        System.out.println("___________________________________");
        System.out.println("        ");
        System.out.println("0 - Encerrar tudo");
        System.out.println("        ");
        System.out.print("Opção ->");
        int opc = sc.nextInt();
        sc.nextLine();

        if (opc == 0){
            sc.close();
        } 

        return opc;
    }

    public void visualizarBoletim(int opc){
        Scanner sc = new Scanner(System.in);

        System.out.println("                                                ");
        System.out.println("BOLETIM DE " + this.boletins.get(opc - 1).exibirNome().toUpperCase() + ":");
        System.out.println("                                                ");
        this.boletins.get(opc - 1).exibirNotasAtividade();
        this.boletins.get(opc - 1).exibirNotasTrabalho();
        this.boletins.get(opc - 1).exibirNotasProva();
        System.out.println("                                                ");
        System.out.println(this.boletins.get(opc - 1).exibirMedia());
        System.out.println("___________________________________");
        System.out.println("                                                ");
        System.out.println("9 - Encerrar tudo");
        System.out.println("0 - Cancelar");
        System.out.println("                                                ");
        System.out.print("Opção -> ");
        int opcV = sc.nextInt();
        sc.nextLine();

        if (opcV == 0){
            interfaceProfessor();
        } else if (opcV == 9){
            sc.close();
        } else {
            opcaoInvalida();
        }

    }

    public void exibirInformacoesCurso(){
        Scanner sc = new Scanner(System.in);

        System.out.println("                                        ");
        System.out.println("NOME:");
        System.out.println(this.curso.exibirNome());
        System.out.println("                                        ");
        System.out.println("TURMAS:");
        for (int i = 0; i < this.curso.exibirTurmas().size(); i++){
            System.out.println(this.curso.exibirTurmas().get(i).exibirNome());
        }
        System.out.println("                                        ");
        System.out.println("ALUNOS:");
        for (int i = 0; i < this.curso.exibirAlunos().size(); i++){
            System.out.println(this.curso.exibirAlunos().get(i).exibirNome());
        }
        System.out.println("                                        ");
        System.out.println("PROFESSORES:");
        for (int i = 0; i < this.curso.exibirProfessores().size(); i++){
            System.out.println(this.curso.exibirProfessores().get(i).exibirNome());
        }
        System.out.println("                                        ");
        System.out.println("________________________________________");
        System.out.println("                                        ");
        System.out.println("9 - Encarrar tudo");
        System.out.println("0 - Cancelar");
        System.out.println("            ");
        System.out.print("Opção -> ");
        int opcC = sc.nextInt();
        sc.nextLine();

        if (opcC == 0){
            interfaceProfessor();
        } else if (opcC == 9){
            sc.close();
        } else {
            opcaoInvalida();
        }
    }

    public void opcaoInvalida(){
        Scanner sc = new Scanner(System.in);

        System.out.println("                             ");
        System.out.println("Opção inválida!");
        System.out.println("                             ");
        System.out.println("0 - Retornar para o começo");
        System.out.println("9 - Encerrar tudo");
        System.out.println("                             ");
        System.out.print("Opção -> ");
        int opcI = sc.nextInt();

         if (opcI == 0){
            interfaceProfessor();;
        } else if (opcI == 9){
            sc.close();
        } else if (opcI != 0) {
            opcaoInvalida();
        }
    }

    public void interfaceProfessor(){
        Scanner sc = new Scanner(System.in);
        int opc = 9;
        while (opc != 0){
            System.out.println("                   ");
            System.out.println("INTERFACE PROFESSOR");
            System.out.println("                   ");
            System.out.println("1 - Selecionar disciplina");
            System.out.println("2 - Informações do curso");
            System.out.println("3 - Exibir boletins");
            System.out.println("0 - Sair");
            System.out.println("                   ");
            System.out.print("Opção -> ");
            int opcI = sc.nextInt();
            sc.nextLine();

            switch (opcI) {
                case 1:
                    int opcSD = selecaoDisciplinas();
                    int opcSA = selecaoAlunos(opcSD);
                    Boletim boletimG = gerarBoletim(this.disciplinas.get(opcSD - 1).exibirAlunos().get(opcSA - 1).exibirRa());

                    if (this.boletins.isEmpty()){
                        this.boletins.add(0, boletimG);
                    } else {
                        this.boletins.add(this.boletins.size(), boletimG);
                    }
                    break;
                case 2:
                    exibirInformacoesCurso();
                    break;
                case 3:
                    int opcB = exibirBoletins();
                    visualizarBoletim(opcB);
                    break;
                case 0:
                    sc.close();
                    break;
            
                default:
                    break;
            }
        }
    }

    @Override
    public void listar(){
        exibirUniversidade().exibirProfessores();
    }
}
