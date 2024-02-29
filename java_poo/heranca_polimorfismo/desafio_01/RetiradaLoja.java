package java_poo.heranca_polimorfismo.desafio_01;

import java.time.LocalDate;

public class RetiradaLoja extends Pedido{

    //Construtor:
    public RetiradaLoja(Integer codPedido, LocalDate dataPedido, String nomeCliente, String enderCliente, Produto[] listaItens, Double frete){
        super(codPedido, dataPedido, nomeCliente, enderCliente, listaItens, frete);
    }
    
    //Polimorfismo:
    @Override
    public void calculoValorTotal(){
        //Variável do resultado:
        Double valorTotal = 0.00;

        //Laço condicional e de repetição para cálculo:
        if (this.listaItens.length >= 1){
            for (Produto produto : this.listaItens){
                valorTotal += produto.getPreco() * produto.getQuantidade();
            }
        }

        //Mensagem para exibir resultado 
        System.out.println("Valor total do pedido: "+ valorTotal +" | Sem frete!");
    }
}
