package java_poo.projetos.esquenta;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Criando cargo desenvolvedor
        Desenvolvedor desenvolvedor = new Desenvolvedor();

        //Criando pessoas
        Pessoa pessoa01 = new Pessoa("Ricardinho", 19, "Rua do Limoeiro", false);
        Pessoa pessoa02 = new Pessoa("Rogerinho", 32, "Av. Serpentário", false);
        Pessoa pessoa03 = new Pessoa("Claudinha", 27, "Rua Guimarães", false);
        
        //Criando lista de candidatos
        ArrayList<Pessoa> candidatos = new ArrayList<Pessoa>();
        candidatos.add(pessoa01);
        candidatos.add(pessoa02);
        candidatos.add(pessoa03);

        //Criando funcionários e desenvolvedores
        Funcionario funcionario01 = new Funcionario("Denilson", 20, "Rua do Palmeiras", true, "Funcionario", 3.000);
        Funcionario funcionario02 = new Funcionario("Marta", 51, "Rua Marimbondo", true, "Funcionario", 3.000);
        Funcionario funcionario03 = new Funcionario("Timão", 72, "Rua Santa Klaus", true, "Funcionario", 3.000);
        Funcionario desenvolvedor01 = new Funcionario("Lucas Montano", 27, "Rua Javascript", true, desenvolvedor, 5.000);
        Funcionario desenvolvedor02 = new Funcionario("Attekita Dev", 28, "Rua Switch", true, desenvolvedor, 5.000);
        Funcionario desenvolvedor03 = new Funcionario("Matheus Avila", 18, "Rua do Café Forte", true, desenvolvedor, 5.000);
        //Criando gerente
        Funcionario funcGerente = new Funcionario("Luizito", 34, "Rua Mamonas", true, 10.000);
        //Listando funcionarios, desenvolvedores e gerente
        ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
        funcionarios.add(funcionario01);
        funcionarios.add(funcionario02);
        funcionarios.add(funcionario03);
        funcionarios.add(desenvolvedor01);
        funcionarios.add(desenvolvedor02);
        funcionarios.add(desenvolvedor03);
        funcionarios.add(funcGerente);
        
        //Criando setor RH
        RH rh = new RH(funcGerente, funcionarios, candidatos);

        //Criando cargo gerente
        Gerente gerente = new Gerente(funcGerente, funcionarios, candidatos);
        funcGerente.setCargoGerente(gerente); //Atribuindo cargo gerente para funcionario gerente

        //RH e gerente podem imprimir relatórios, embora um pouco diferentes
        rh.imprimirRelatorioFuncionarios();
        gerente.imprimirRelatorioFuncionarios();

        //RH pode contratar e demitir funcionarios e desenvolvedores
        //- Quando um candidato é contratado ele sai da lista de candidatos e entra na lista de funcionarios
        //- Quando um funcionario é demitido ele sai da lista de funcionarios
        rh.contratarDesenvolvedor(pessoa01);
        rh.demitirDesenvolvedor(desenvolvedor01);
        rh.demitirFuncionario(funcionario03);
        rh.demitirGerente(funcGerente);
        rh.contratarGerente(pessoa03);
        rh.contratarFuncionario(pessoa02);
        rh.imprimirRelatorioFuncionarios();
    }
}
