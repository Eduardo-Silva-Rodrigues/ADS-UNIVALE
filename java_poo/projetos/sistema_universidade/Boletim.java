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
        Scanner sc = new Scanner(System.in);

        System.out.println("Atribuindo notas de ATIVIDADE:");
        System.out.println("                              ");
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

        sc.close();
    }

    public void exibirNotasAtividade(){
        if (this.notasAtividade.isEmpty()){
            System.out.println("Sem notas de atividade!");
        } else {
            System.out.println("                   ");
            System.out.println("Notas de ATIVIDADE:");
            System.out.println("                   ");
            for (int i = 0; i < this.notasAtividade.size(); i++){
                System.out.println(this.notasAtividade.get(i).exibirNomeDisciplina() + " : " + this.notasAtividade.get(i).exibirNota());
            }
        }
    }

    public void adicionarNotasTrabalho(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Atribuindo notas de TRABALHO:");
        System.out.println("                              ");
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

        sc.close();
    }

    public void exibirNotasTrabalho(){
        if (this.notasTrabalho.isEmpty()){
            System.out.println("Sem notas de trabalho!");
        } else {
            System.out.println("                   ");
            System.out.println("Notas de TRABALHO:");
            System.out.println("                   ");
            for (int i = 0; i < this.notasTrabalho.size(); i++){
                System.out.println(this.notasTrabalho.get(i).exibirNomeDisciplina() + " : " + this.notasTrabalho.get(i).exibirNota());
            }
        }
    }

    public void adicionarNotasProva(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Atribuindo notas de PROVA:");
        System.out.println("                              ");
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

        sc.close();
    }

    public void exibirNotasProva(){
        if (this.notasProva.isEmpty()){
            System.out.println("Sem notas de prova!");
        } else {
            System.out.println("                   ");
            System.out.println("Notas de PROVA:");
            System.out.println("                   ");
            for (int i = 0; i < this.notasProva.size(); i++){
                System.out.println(this.notasProva.get(i).exibirNomeDisciplina() + " : " + this.notasProva.get(i).exibirNota());
            }
        }
    }
}
