package java_poo.projetos.sistema_universidade;

import java.util.ArrayList;
import java.util.Scanner;

public class Boletim {
    private String nome;
    private String ra;
    private Curso curso;
    private ArrayList<Disciplina> disciplinas = new ArrayList<Disciplina>();
    private Turma turma;
    private ArrayList<Nota> notasAtividade = new ArrayList<Nota>();
    private ArrayList<Nota> notasTrabalho = new ArrayList<Nota>();
    private ArrayList<Nota> notasProva = new ArrayList<Nota>();

    public Boletim(String ra){
        this.ra = ra;
    }

    public void adicionarNome(String nome){
        this.nome = nome;
    }

    public String exibirNome(){
        return this.nome;
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

    public String exibirCurso(){
        return this.curso.exibirNome();
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
            System.out.println("Nenhuma disciplina encontrada");
        } else {
            for (int i = 0; i < this.disciplinas.size(); i++){
                System.out.println(this.disciplinas.get(i).exibirNome());
            }
        }
    }

    public void adicionarTurma(Turma turma){
        this.turma = turma;
    }

    public String exibirTurma(){
        return this.turma.exibirNome();
    }

    public void adicionarNotasAtividade(){
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.println("___________________________________");
        System.out.println("                              ");
        System.out.println("NOTAS ATIVIDADE:");
        for (int i = 0; i < this.disciplinas.size(); i++){
            System.out.print(this.disciplinas.get(i).exibirNome() + ": ");
            Double nota = sc.nextDouble();
            Nota notaAtiv = new Nota(this.disciplinas.get(i).exibirNome(), nota);

            if (this.notasAtividade.isEmpty()){
                this.notasAtividade.add(0, notaAtiv);
            } else {
                this.notasAtividade.add(this.notasAtividade.size(), notaAtiv);
            }
        }
    }

    public void exibirNotasAtividade(){
        if (this.notasAtividade.isEmpty()){
            System.out.println("Sem notas de atividade!");
        } else {
            System.out.println("___________________________________");
            System.out.println("                                   ");
            System.out.println("NOTAS ATIVIDADE:");
            for (int i = 0; i < this.notasAtividade.size(); i++){
                System.out.println(this.notasAtividade.get(i).exibirNomeDisciplina() + " : " + this.notasAtividade.get(i).exibirNota());
            }
        }
    }

    public void adicionarNotasTrabalho(){
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.println("___________________________________");
        System.out.println("                              ");
        System.out.println("NOTAS TRABALHO:");
        for (int i = 0; i < this.disciplinas.size(); i++){
            System.out.print(this.disciplinas.get(i).exibirNome() + ": ");
            Double nota = sc.nextDouble();
            Nota notaTrab = new Nota(this.disciplinas.get(i).exibirNome(), nota);

            if (this.notasTrabalho.isEmpty()){
                this.notasTrabalho.add(0, notaTrab);
            } else {
                this.notasTrabalho.add(this.notasTrabalho.size(), notaTrab);
            }
        }
    }

    public void exibirNotasTrabalho(){
        if (this.notasTrabalho.isEmpty()){
            System.out.println("Sem notas de trabalho!");
        } else {
            System.out.println("___________________________________");
            System.out.println("                   ");
            System.out.println("NOTAS TRABALHO:");
            for (int i = 0; i < this.notasTrabalho.size(); i++){
                System.out.println(this.notasTrabalho.get(i).exibirNomeDisciplina() + " : " + this.notasTrabalho.get(i).exibirNota());
            }
        }
    }

    public void adicionarNotasProva(){
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("___________________________________");
        System.out.println("                              ");
        System.out.println("NOTAS PROVA:");
        for (int i = 0; i < this.disciplinas.size(); i++){
            System.out.print(this.disciplinas.get(i).exibirNome() + ": ");
            Double nota = sc.nextDouble();
            Nota notaProva = new Nota(this.disciplinas.get(i).exibirNome(), nota);

            if (this.notasProva.isEmpty()){
                this.notasProva.add(0, notaProva);
            } else {
                this.notasProva.add(this.notasProva.size(), notaProva);
            }
        }

    }

    public void exibirNotasProva(){
        if (this.notasProva.isEmpty()){
            System.out.println("Sem notas de prova!");
        } else {
            System.out.println("___________________________________");
            System.out.println("                   ");
            System.out.println("NOTAS PROVA:");
            for (int i = 0; i < this.notasProva.size(); i++){
                System.out.println(this.notasProva.get(i).exibirNomeDisciplina() + " : " + this.notasProva.get(i).exibirNota());
            }
        }
    }

    public Double exibirMedia(){
        ArrayList<String> nomesDisciplinas = new ArrayList<String>();
        Double notaAtiv = 0.0;
        Double notaTrab = 0.0;
        Double notaProva = 0.0;
        System.out.println("___________________________________");
        System.out.println("                                   ");
        System.out.println("MÉDIA DE " + this.nome.toUpperCase());
        for (int i = 0; i < this.notasAtividade.size(); i++){
            nomesDisciplinas.add(i, this.notasAtividade.get(i).exibirNomeDisciplina());
        }
        for (int i = 0; i < nomesDisciplinas.size(); i++){
            for (int j = 0; j < this.notasAtividade.size(); j++){
                if (nomesDisciplinas.get(i) == this.notasAtividade.get(j).exibirNomeDisciplina()){
                    notaAtiv = this.notasAtividade.get(j).exibirNota();
                }
            }
            for (int j = 0; j < this.notasTrabalho.size(); j++){
                if (nomesDisciplinas.get(i) == this.notasTrabalho.get(j).exibirNomeDisciplina()){
                    notaTrab = this.notasTrabalho.get(j).exibirNota();
                }
            }
            for (int j = 0; j < this.notasProva.size(); j++){
                if (nomesDisciplinas.get(i) == this.notasProva.get(j).exibirNomeDisciplina()){
                    notaProva = this.notasProva.get(j).exibirNota();
                }
            }
        }

        Double media = (notaAtiv + notaTrab + notaProva) / 3;

        return media;
    }
}
