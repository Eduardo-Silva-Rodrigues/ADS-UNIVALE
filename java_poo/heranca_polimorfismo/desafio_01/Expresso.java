package java_poo.heranca_polimorfismo.desafio_01;
import java.time.LocalDate;

public class Expresso extends Pedido {
public Expresso(Integer codPedido, LocalDate dataPedido, Cliente nomeCliente, Cliente enderCliente, Produto[] listaItens, Double frete){
        super(codPedido, dataPedido, nomeCliente, enderCliente, listaItens, frete);
    }
}
