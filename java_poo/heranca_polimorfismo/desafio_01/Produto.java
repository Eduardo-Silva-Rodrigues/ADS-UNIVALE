package java_poo.heranca_polimorfismo.desafio_01;

public class Produto {
    private String nome;
    private Double preco;
    private Integer quantidade;

    public Produto(String nome, Double preco, Integer quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void setNome (String nome){
        this.nome = nome;
    }
    public void setPreco (Double preco){
        this.preco = preco;
    }
    public void setQuantidade (Integer quantidade){
        this.quantidade = quantidade;
    }

    public String getNome(){
        return this.nome;
    }
    public Double getPreco(){
        return this.preco;
    }
    public Integer getQuantidade(){
        return this.quantidade;
    }
}
