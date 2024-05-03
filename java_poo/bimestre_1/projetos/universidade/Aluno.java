package java_poo.bimestre_1.projetos.universidade;

import java.util.ArrayList;

public class Aluno extends Pessoa {
    private Curso curso;
    private ArrayList<Disciplina> disciplinas;
    private String turma;
    private int semestre;
    private Nota[] notas = new Nota[3];
    
    public Aluno(String nome, String email, String telefone, String cpf, String endereco, Curso curso, ArrayList<Disciplina> disciplinas, String turma, int semestre) {
        super(nome, email, telefone, cpf, endereco);
        this.curso = curso;
        this.disciplinas = disciplinas;
        this.turma = turma;
        this.semestre = semestre;
    }

    public Curso getCurso() {
        return curso;
    }
    public void setCurso(Curso curso) {
        this.curso = curso;
    }
    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }
    public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }
    public String getTurma() {
        return turma;
    }
    public void setTurma(String turma) {
        this.turma = turma;
    }
    public int getSemestre() {
        return semestre;
    }
    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
    public Nota[] getNotas() {
        return notas;
    }
    public void setNotas(int index, Nota notas) {
        this.notas[index] = notas;
    }
    
    @Override
    public void listarPessoas(){
        System.out.println("                        ");
        System.out.println("Nome: " + getNome());
        System.out.println("Email: " + getEmail());
        System.out.println("Telefone: " + getTelefone());
        System.out.println("CPF: " + getCpf());
        System.out.println("Endereço: " + getEndereco());
        System.out.println("Curso: " + this.curso.getNome());
        System.out.println("Turma: " + this.turma);
        System.out.println("Semestre: " + this.semestre);
        for (int i = 0; i < this.notas.length; i++){
            if (this.notas[i].getNotaAtividade() == 0.0 && this.notas[i].getNotaTrabalho() == 0.0 && this.notas[i].getNotaProva() == 0.0){
                System.out.println("Notas: Sem notas"); 
            } else{
                for (int j = 0; j < this.notas.length; j++){
                    if (this.notas[j].getDisciplina().getNome() == this.disciplinas.get(0).getNome()){
                        System.out.println("Notas de Programação Orientada Objeto:");
                        System.out.println("                                      ");
                        System.out.println("Nota de Atividades: " + this.notas[j].getNotaAtividade());
                        System.out.println("Nota de Trabalho: " + this.notas[j].getNotaTrabalho());
                        System.out.println("Nota de Prova: " + this.notas[j].getNotaProva());
                    } else {
                        System.out.println("Sem notas em Programação Orientada Objeto!");
                    }

                    if (this.notas[j].getDisciplina().getNome() == this.disciplinas.get(1).getNome()){
                        System.out.println("Notas de Banco de Dados:");
                        System.out.println("                                      ");
                        System.out.println("Nota de Atividades: " + this.notas[j].getNotaAtividade());
                        System.out.println("Nota de Trabalho: " + this.notas[j].getNotaTrabalho());
                        System.out.println("Nota de Prova: " + this.notas[j].getNotaProva());
                    } else {
                        System.out.println("Sem notas em Banco de Dados!");
                    }

                    if (this.notas[j].getDisciplina().getNome() == this.disciplinas.get(2).getNome()){
                        System.out.println("Notas de Análise e Projeto de Sistemas:");
                        System.out.println("                                      ");
                        System.out.println("Nota de Atividades: " + this.notas[j].getNotaAtividade());
                        System.out.println("Nota de Trabalho: " + this.notas[j].getNotaTrabalho());
                        System.out.println("Nota de Prova: " + this.notas[j].getNotaProva());
                    } else {
                        System.out.println("Sem notas em Análise e Projeto de Sistemas!");
                    }
                }

            }
        }
    }
}
