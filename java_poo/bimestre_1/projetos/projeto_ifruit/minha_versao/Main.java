package java_poo.projetos.projeto_ifruit.minha_versao;

public class Main {
    public static void main(String[] args) {
        Product produto1 = new Product("Tomate", 0.15, 0.2, 3.00);
        Product produto2 = new Product("Laranja", 0.05, 0.2, 1.67);
        System.out.println(produto1.getPeso());
        System.out.println(produto1.getPreco());

        Carrinho carrinho = new Carrinho(10);
        carrinho.addProd(produto1, 0);
        carrinho.addProd(produto2, 1);

        User usuario = new User("Eduardo", "exemplo@gmail.com", 19, 1000.00, carrinho);
        System.out.println(usuario.getUser());
        System.out.println(carrinho.mostrarPreco());
        carrinho.fecharCompra();
        usuario.carrinho.listarProdutos();
        usuario.pagar();
    }
}