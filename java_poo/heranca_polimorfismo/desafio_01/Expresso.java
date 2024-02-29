package java_poo.heranca_polimorfismo.desafio_01;
import java.time.LocalDate;

// Criação e herança de classe:
public class Expresso extends Pedido {
    
    //Construtor:
    public Expresso(Integer codPedido, LocalDate dataPedido, String nomeCliente, String enderCliente, Produto[] listaItens, Double frete){
        super(codPedido, dataPedido, nomeCliente, enderCliente, listaItens, frete);
    }

    // Polimorfismo:
    @Override
    public void calculoValorTotal(){
        //Variáveis para cálculo:
        Double valorTotal = 0.00;
        Double valorFrete = 0.00;
        Double pesoProduto = 0.00;

        //Laços condicionais e de repetição para cálculo:
        if (this.listaItens.length >= 1){
            for (Produto produto : this.listaItens){
                valorTotal += (produto.getPreco() * produto.getQuantidade());
                pesoProduto = produto.getPeso();
                
                if (pesoProduto <= 1.00){
                    valorFrete += (produto.getPeso() * 15.00);
                } else if (pesoProduto > 1.00 && pesoProduto <= 5.00){
                    valorFrete += (produto.getPeso() * 12.50);
                } else if (pesoProduto > 5.00 && pesoProduto <= 10.00){
                    valorFrete += (produto.getPeso() * 10.00);
                } else if (pesoProduto > 10.00 && pesoProduto <= 20.00){
                    valorFrete += (produto.getPeso() * 8.70);
                } else if (pesoProduto > 20.00){
                    valorFrete += (produto.getPeso() * 7.50);
                } else {
                    valorFrete += 0.00;
                }
            }
        }

        //Soma dos resultados:
        valorTotal = valorTotal + valorFrete;

        //Mensagem para exibir resultado:
        System.out.println("Valor total do pedido: "+ valorTotal +" | Frete por peso!");
    }
}
