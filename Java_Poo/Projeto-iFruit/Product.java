public class Product {
    public String nome;
    public Double desconto;
    public Double peso;
    public Double preco;

    public Product(String nome, Double desconto, Double peso,Double preco){
        this.nome = nome;
        this.desconto = desconto;
        this.peso = peso;
        this.preco = preco;
    }

    public Double calcDesconto(){
        return this.preco = this.preco - (this.preco * this.desconto);
    }

    public Double getPreco(){
        return this.preco;
    }

    public Double getPeso(){
        return this.peso;
    }

    public String toString(){
        return "[nome = " + nome + ", preço = " + preco +"]";
    }
}