package java_poo.projetos.esquenta;

import java.util.ArrayList;

public class RH {
    private static String nome;
    private Funcionario gerente;
    private ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
    private ArrayList<Pessoa> candidatos = new ArrayList<Pessoa>();

    static {
        RH.nome = "RH";
    }

    public RH(Funcionario gerente) {
        this.gerente = gerente;
    }

    public RH(Funcionario gerente, ArrayList<Funcionario> funcionarios) {
        this.gerente = gerente;
        this.funcionarios = funcionarios;
    }

    public RH(Funcionario gerente, ArrayList<Funcionario> funcionarios, ArrayList<Pessoa> candidatos) {
        this.gerente = gerente;
        this.funcionarios = funcionarios;
        this.candidatos = candidatos;
    }

    public static String getNome(){
        return nome;
    }

    public static void setNome(String nome){
        RH.nome = nome;
    }

    public Funcionario getGerente() {
        return gerente;
    }

    public void setGerente(Funcionario gerente) {
        this.gerente = gerente;
    }

    public ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(ArrayList<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public ArrayList<Pessoa> getCandidatos() {
        return candidatos;
    }

    public void setCandidatos(ArrayList<Pessoa> candidatos) {
        this.candidatos = candidatos;
    }

    public void imprimirRelatorioFuncionarios() {
        System.out.println("=== RELATÓRIO ===");
        System.out.println("\n-- Gerente --");
        getListaFuncionariosGerentes();
        System.out.println("\n-- Funcionarios --");
        getListaFuncionarios();
        System.out.println("\n-- Desenvolvedores --");
        getListaFuncionariosDesenvolvedores();
        System.out.println("\n-- Candidatos --");
        getListaCandidatos();
    }

    public void getListaFuncionariosGerentes() {
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getCargoGerente() != null) {
                System.out.println("- " + funcionario.getNome());
            }
        }
    }

    public void getListaFuncionariosDesenvolvedores() {
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getCargoDesenvolvedor() != null) {
                System.out.println("- " + funcionario.getNome());
            }
        }
    }

    public void getListaFuncionarios() {
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getCargoDesenvolvedor() == null && funcionario.getCargoGerente() == null && funcionario.getCargoRh() == null) {
                System.out.println("- " + funcionario.getNome());
            }
        }
    }

    public void getListaCandidatos(){
        for (Pessoa pessoa : candidatos) {
            System.out.println("- " + pessoa.getNome());
        }
    }

    public void setFuncionarioNaLista(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public void setCandidatoNaLista(Pessoa candidato) {
        candidatos.add(candidato);
    }

    public void contratarDesenvolvedor(Pessoa candidato) {
        Desenvolvedor novoDesenvolvedor = new Desenvolvedor();
        Funcionario novoFuncionario = new Funcionario(candidato.getNome(), candidato.getIdade(),
                candidato.getEndereco(), true, novoDesenvolvedor, 5.000);
        setFuncionarioNaLista(novoFuncionario);

        for (int i = 0; i < candidatos.size(); i++) {
            if (candidato.getId() == candidatos.get(i).getId()){
                candidatos.remove(i);
            }
        }
    }

    public void contratarGerente(Pessoa candidato) {
        Gerente novoGerente = new Gerente(this.gerente, this.funcionarios, this.candidatos);
        Funcionario novoFuncionario = new Funcionario(candidato.getNome(), candidato.getIdade(),
                candidato.getEndereco(), true, novoGerente, 10.000);
        setGerente(novoFuncionario);
        setFuncionarioNaLista(novoFuncionario);

        for (int i = 0; i < candidatos.size(); i++) {
            if (candidato.getId() == candidatos.get(i).getId()){
                candidatos.remove(i);
            }
        }
    }

    public void contratarFuncionario(Pessoa candidato){
        Funcionario novoFuncionario = new Funcionario(candidato.getNome(), candidato.getIdade(),
                candidato.getEndereco(), true, "Gerente", 3.000);
        setFuncionarioNaLista(novoFuncionario);

        for (int i = 0; i < candidatos.size(); i++) {
            if (candidato.getId() == candidatos.get(i).getId()){
                candidatos.remove(i);
            }
        }
    }

    public void demitirDesenvolvedor(Funcionario desenvolvedor){
        for (int i = 0; i < funcionarios.size(); i++) {
            if (funcionarios.get(i).getId() == desenvolvedor.getId()){
                funcionarios.remove(i);
            } 
        }
    }

    public void demitirFuncionario(Funcionario funcionario){
        for (int i = 0; i < funcionarios.size(); i++) {
            if (funcionarios.get(i).getId() == funcionario.getId()){
                funcionarios.remove(i);
            } 
        }
    }

    public void demitirGerente(Funcionario gerente){
        for (int i = 0; i < funcionarios.size(); i++) {
            if (funcionarios.get(i).getId() == gerente.getId()){
                funcionarios.remove(i);
            } 
        }
    }
}
