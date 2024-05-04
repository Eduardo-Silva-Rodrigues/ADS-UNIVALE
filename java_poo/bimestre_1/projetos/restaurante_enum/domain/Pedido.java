package java_poo.bimestre_1.projetos.restaurante_enum.domain;

import java.util.ArrayList;

public class Pedido {
    private String nomeCliente;
    private String cpfCliente;
    private String dataPedido;
    private ArrayList<Produtos> produtos = new ArrayList<Produtos>();
    private double valorTotal;

    public Pedido(String nomeCliente, String cpfCliente, String dataPedido, ArrayList<Produtos> produtos, double valorTotal){
        this.nomeCliente = nomeCliente;
        this.cpfCliente = cpfCliente;
        this.dataPedido = dataPedido;
        this.produtos = produtos;
        this.valorTotal = valorTotal;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public String getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(String dataPedido) {
        this.dataPedido = dataPedido;
    }

    public ArrayList<Produtos> getProdutos() {
        return produtos;
    }

    public void setProdutos(ArrayList<Produtos> produtos) {
        this.produtos = produtos;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }    
}
