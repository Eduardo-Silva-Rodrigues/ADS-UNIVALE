package java_poo.bimestre_1.aulas.heranca_polimorfismo.aula_24_02;

public class Animal {
    private String nome;
    private Integer idade;

    public Animal(String nome, Integer idade){
        this.nome = nome;
        this.idade = idade;
    };

    public void setName(String nome){
        this.nome = nome;
    }

    public void setIdade(Integer idade){
        this.idade = idade;
    }

    public String getNome(){
        return this.nome;
    }

    public Integer getIdade(){
        return this.idade;
    }

    public void emitirSom(){
        System.out.println("Som generico emitido!");
    }
}