package java_poo.bimestre_1.projetos.restaurante_enum.domain;

import java.util.Date;
import java.util.ArrayList;

public class Pedido {
    private String nomeCliente;
    private String cpfCliente;
    private Date dataPedido;
    private ArrayList<Produtos> produtos = new ArrayList<Produtos>();
    private double valorTotal;

    public Pedido(){

    }

    public Pedido(String nomeCliente, String cpfCliente, Date data,
        ArrayList<Produtos> produtos) {
        this.nomeCliente = nomeCliente;
        this.cpfCliente = cpfCliente;
        this.dataPedido = data;
        this.produtos = produtos;
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

    public Date getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(Date dataPedido) {
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

    public double calcularValorTotalPedido(){
        double valorTotalPedido = 0.0 ;

        for (Produtos produto : produtos) {
            valorTotalPedido += produto.getPrecoProduto();
        }
        
        return valorTotalPedido;
    }

    public void listarProdutos(){
        for (int i = 0; i < produtos.size(); i++) {
            int contador = 0;
            String ultimoProduto = "";
            if (i == 0){
                ultimoProduto = ""; 
            } else {
                ultimoProduto = produtos.get(i - 1).getNomeProduto(); 
            }
            String nomeProduto = produtos.get(i).getNomeProduto();
            for (int j = 0; j < produtos.size(); j++) {
                if (produtos.get(i).getNomeProduto() == produtos.get(j).getNomeProduto()){
                    contador++;
                }
            }
            if (ultimoProduto == nomeProduto){
                continue;
            } else {
                System.out.println(contador + "x " + nomeProduto);
            }
        }
    }

    public void imprimePedido(){
        System.out.println("=== Pedido ===");
        System.out.println("\nCliente: " + getNomeCliente());
        System.out.println("CPF: " + getCpfCliente());
        System.out.println("Data e hora: " + getDataPedido());
        System.out.println(" ");
        listarProdutos();
        System.out.println("\nValor Total: " + getValorTotal());
    }
}
