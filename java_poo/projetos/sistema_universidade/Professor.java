package java_poo.projetos.sistema_universidade;

import java.util.ArrayList;

public class Professor extends Pessoa {
    private Curso curso;
    private ArrayList<Disciplina> disciplinas = new ArrayList<Disciplina>();
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

    public void adicionarSalario(String salario){
        this.salario = salario;
    }

    public String exibirSalario(){
        return this.salario;
    }

    public void gerarBoletim(String ra){
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
    }

    @Override
    public void listar(){
        exibirUniversidade().exibirProfessores();
    }
}
