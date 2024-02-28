package java_poo.heranca_polimorfismo.desafio_01;

public class ListaItens {
    private Produto item;
    private Integer quantidade;

    public ListaItens(Produto item, Integer quantidade){
        this.item = item;
        this.quantidade = quantidade;
    }

    public void setItem(Produto item){
        this.item = item;
    }
    public void setQuantidade(Integer quantidade){
        this.quantidade = quantidade;
    }

    public Produto getItem(){
        return this.item;
    }
    public Integer getQuantidade(){
        return this.quantidade;
    }
}
