package Minha_Versao;

public class User {
    public String nome;
    public String email;
    public Integer idade;
    public Double saldo;
    public Carrinho carrinho;

    public User(String nome, String email, Integer idade, Double saldo, Carrinho carrinho){
        this.nome = nome;
        this.email = email;
        this.idade = idade;
        this.saldo = saldo;
        this.carrinho = carrinho;
    }

    public String getUser(){
        return "Usuário [Nome = "+ nome +", Email = " + email +", Idade = " + idade +", Saldo = " + saldo +"]";
    }

    public void pagar(){
        if (this.saldo >= this.carrinho.precoBruto) {
            this.saldo = this.saldo - this.carrinho.precoBruto;
            System.out.println("Saldo: " + this.saldo);

            this.carrinho.setPrecoTotal(0.0);
            this.carrinho.setPrecoBruto(0.0);
            System.out.println("Valor total: " + this.carrinho.precoTotal + " (Pago)");
        } else {
            System.out.println("Saldo insuficiente!");
        }

        this.carrinho.precoBruto = 0.0;
        this.carrinho.precoTotal = 0.0;
    }
}
