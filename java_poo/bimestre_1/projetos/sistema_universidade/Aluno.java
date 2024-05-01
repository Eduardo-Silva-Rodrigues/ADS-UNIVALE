package java_poo.projetos.sistema_universidade;

import java.util.ArrayList;

public class Aluno extends Pessoa {
    private String ra;
    private Curso curso;
    private Turma turma;
    private ArrayList<Disciplina> disciplinas = new ArrayList<Disciplina>();
    private Boletim boletim;

    public Aluno(String nome, int idade, String cpf, String email, String telefone, String endereco, Universidade universidade, String ra, Curso curso, Turma turma){
        super(nome, idade, cpf, email, telefone, endereco, universidade);
        this.ra = ra;
        this.curso = curso;
        this.turma = turma;
    }

    public void adicionarRa(String ra){
        this.ra = ra;
    }

    public String exibirRa(){
        return this.ra;
    }

    public void adicionarCurso(Curso curso){
        this.curso = curso;
    }

    public Curso exibirCurso(){
        return this.curso;
    }

    public void adicionarTurma(Turma turma){
        this.turma = turma;
    }

    public Turma exibirTurma(){
        return this.turma;
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

    public void adicionarBoletim(Boletim boletim){
        this.boletim = boletim;
    }

    public void exibirBoletim(){
        if (this.boletim == null){
            System.out.println("Boletim não encontrado!");
        } else{
            this.boletim.exibirNotasAtividade();
            this.boletim.exibirNotasTrabalho();
            this.boletim.exibirNotasProva();
        }
    }

    @Override
    public void listar(){
        exibirUniversidade().exibirAlunos();
    }
}
