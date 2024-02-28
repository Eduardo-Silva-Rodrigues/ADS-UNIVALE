package java_poo.heranca_polimorfismo.desafio_01;
import java.time.LocalDate;

public class Pedido {
    // Propriedades da classe:
    private Integer codPedido;
    private LocalDate dataPedido;
    private Cliente nomeCliente;
    private Cliente enderCliente;
    private Produto[] listaItens;
    private Double frete;
    // Construtor:
    public Pedido(Integer codPedido, LocalDate dataPedido, Cliente nomeCliente, Cliente enderCliente, Produto[] listaItens, Double frete){
        this.codPedido = codPedido;
        this.dataPedido = dataPedido;
        this.nomeCliente = nomeCliente;
        this.listaItens = listaItens;
        this.frete = frete;
    }
    // Métodos de definição:
    public void setCodPedido(Integer codPedido){
        this.codPedido = codPedido;
    }
    public void setDataPedido(LocalDate dataPedido){
        this.dataPedido = dataPedido;
    }
    public void setNomeCliente(Cliente nomeCliente){
        this.nomeCliente = nomeCliente;
    }
    public void setEnderCliente(Cliente enderCliente){
        this.enderCliente = enderCliente;
    }
    public void setItens(Produto[] listaItens){
        this.listaItens = listaItens;
    }
    public void setFrete(Double frete){
        this.frete = frete;
    }
    // Métodos de coleta:
    public Integer getCodPedido(){
        return this.codPedido;
    }
    public LocalDate getDataPedido(){
        return this.dataPedido;
    }
    public Cliente getNomeCliente(){
        return this.nomeCliente;
    }
    public Cliente getEnderCliente(){
        return this.enderCliente;
    }
    public Produto[] getItens(){
        return this.listaItens;
    }
    public Double getFrete(){
        return this.frete;
    }
    // Método de calculo de valor total:
    public void calculoValorTotal(){
        Double valorTotal = 0.00;

        if (this.listaItens.length >= 1){
            for (Produto produto : this.listaItens){
                valorTotal += produto.getPreco();
            }
        }

        valorTotal += getFrete();

        System.out.println("Valor total do pedido: "+ valorTotal);
    }

    public void exibirInfoPedido(){
        System.out.println("○ Código do pedido: "+ this.codPedido);
        System.out.println("○ Data do pedido: "+ this.dataPedido);
        System.out.println("○ Nome do cliente: "+ this.nomeCliente);
        System.out.println("○ Endereço do cliente: "+ this.enderCliente);
        System.out.println("○ Frete: "+ this.frete);
        System.out.println("_______________________________________");
        System.out.println("○ Lista de itens: ");
        
        // if (this.listaItens.length >= 1){
        //     for (Produto produto : this.listaItens){
        //     }
        // }
    }
}
