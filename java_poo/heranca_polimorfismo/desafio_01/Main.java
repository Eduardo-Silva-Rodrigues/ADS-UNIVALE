package java_poo.heranca_polimorfismo.desafio_01;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        Cliente cliente = new Cliente("Eduardo", "Rua Albedo Rios 77");

        Produto[] listaProdutos = new Produto[3];
    
        listaProdutos[0] = new Produto("Shampoo Anti-Calvice", 15.90, 3, 1.00);
        listaProdutos[1] = new Produto("Entendendo Algoritmos (livro)", 51.70, 1, 2.50);
        listaProdutos[2] = new Produto("Memória RAM 16GB", 199.99, 2, 0.70);

        LocalDate data = LocalDate.now();
        
        Pedido pedidoCliente = new Pedido(1488, data, cliente.getNome(), cliente.getEndereco(), listaProdutos, 15.00);

        pedidoCliente.exibirInfoPedido();
    }
    
}
