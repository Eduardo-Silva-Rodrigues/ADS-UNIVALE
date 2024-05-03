package java_poo.bimestre_1.projetos.esquenta;

import java.util.ArrayList;

public class Gerente extends RH {
    private static String nome = "Gerente";

    static {
        Gerente.nome = "Gerente";
    }

    public Gerente(Funcionario gerente, ArrayList<Funcionario> funcionarios, ArrayList<Pessoa> candidatos) {
        super(gerente, funcionarios, candidatos);
    }

    public static String getNome() {
        return nome;
    }

    public static void setNome(String nome) {
        Gerente.nome = nome;
    }

    @Override
    public void imprimirRelatorioFuncionarios() {
        System.out.println("=== RELATÓRIO ===");
        System.out.println("\n-- Funcionarios --");
        getListaFuncionarios();
        System.out.println("\n-- Desenvolvedores --");
        getListaFuncionariosDesenvolvedores();
    }
}
