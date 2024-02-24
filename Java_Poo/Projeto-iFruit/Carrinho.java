public class Carrinho {
    public Double precoBruto = 0.0;
    private Double taxa = 0.05;
    public Double precoTotal = 0.0;
    public Product[] listaProd;

    public Carrinho(int tamanho){
        this.listaProd = new Product[tamanho];
    }

    public Double mostrarPreco(){
        int i = 0;

        while (i < this.listaProd.length){
            if (this.listaProd[i] != null){
                this.precoBruto += this.listaProd[i].preco;
                i++;
            } else {
                break;
            }
        }

        return this.precoBruto;
    }

    public void addProd(Product produto, int indice) {
        if (indice >= 0 && indice < listaProd.length){
            this.listaProd[indice] = produto;
        }
    }

    public void fecharCompra(){
        int i = 0;

        while (i < this.listaProd.length) {
            if (this.listaProd[i] != null){
                this.precoTotal += this.listaProd[i].calcDesconto();
                i++;
            } else {
                break;
            }
        }

        System.out.println("Valor líquido total: " + (this.precoTotal = this.precoTotal + (this.precoTotal * this.taxa)));
    }

    public void listarProdutos(){
        for (int i = 0; i < this.listaProd.length; i++){
            if (this.listaProd[i] != null){
                System.out.println("Produto "+ (i+1) +": " + this.listaProd[i]);
            }
        }
    }

    public void setPrecoTotal(Double valor){
        this.precoTotal = valor;
    }

    public void setPrecoBruto(Double valor){
        this.precoBruto = valor;
    }
}
