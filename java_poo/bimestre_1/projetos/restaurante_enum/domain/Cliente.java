package java_poo.bimestre_1.projetos.restaurante_enum.domain;

import java.util.Calendar;
import java.util.Date;
import java.util.ArrayList;

public class Cliente extends Pessoa{
    private Pedido pedido;

    public Cliente(String nome, int idade, String cpf){
        super(nome, idade, cpf);
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public void realizarPedido(ArrayList<Produtos> produtos){
        Calendar calendario = Calendar.getInstance();
        Date dataHoraPedido = calendario.getTime();
        Pedido pedido = new Pedido(getNome(), getCpf(), dataHoraPedido, produtos);
        double valorTotalPedido = pedido.calcularValorTotalPedido();
        pedido.setValorTotal(valorTotalPedido);
        setPedido(pedido);
    }
}
    