package java_poo.bimestre_1.projetos.restaurante_enum.test;

import java_poo.bimestre_1.projetos.restaurante_enum.domain.Cliente;
import java_poo.bimestre_1.projetos.restaurante_enum.domain.Produtos;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Eduardo", 19, "000.000.000-00");
        ArrayList<Produtos> produtos = new ArrayList<>();
        produtos.add(Produtos.COSTELA);
        produtos.add(Produtos.LIMONADA);
        produtos.add(Produtos.LIMONADA);
        produtos.add(Produtos.LIMONADA);
        produtos.add(Produtos.LASANHA);
        produtos.add(Produtos.LASANHA);
        produtos.add(Produtos.PUDIM);
        produtos.add(Produtos.PUDIM);
        cliente.realizarPedido(produtos);
        cliente.getPedido().imprimePedido();
    }   
}
