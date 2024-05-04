package java_poo.bimestre_1.projetos.restaurante_enum.domain;

public enum Produtos {
    LASANHA("Lasanha", 38.00), 
    MACARRONADA("Macarronada", 30.00), 
    PUDIM("Pudim", 25.00), 
    LIMONADA("Limonada", 10.00), 
    COSTELA("Costela Bovína", 45.00);

    private String nomeProduto;
    private double precoProduto;

    Produtos(String nomeProduto, double precoProduto){
        this.nomeProduto = nomeProduto;
        this.precoProduto = precoProduto;
    }

    public String getNomeProduto(){
        return this.nomeProduto;
    }

    public double getPrecoProduto(){
        return this.precoProduto;
    }
}
