package java_poo.projetos.petshop_amaral;

//Imports:
import java.util.Map; //Map é uma espécie de tabela de pares de chave e valores
import java.util.HashMap; // Hashmap é aquele quem cria os pares de chave e valores
//Ambos os imports vão ser importantes para a identificação dos pets, pois muitos pets podem ter nomes iguais, então precisamos de um código único para cada um (Chave: código, Valor: pet)

public class Dono {
    //Propriedades de Dono:
    private int codigoDono;
    private String nome;
    private String endereco;
    private Map<Integer, String> pets = new HashMap<Integer, String>();
    private String observacoesDono = "";

    //Método construtor de Dono:
    public Dono(int codigoDono, String nome, String endereco){
        this.codigoDono = codigoDono;
        this.nome = nome;
        this.endereco = endereco;
    }

    //Getters and setters:
    public int getCodigoDono() {
        return codigoDono;
    }

    public void setCodigoDono(int codigoDono) {
        this.codigoDono = codigoDono;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco(){
        return this.endereco;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    public Map<Integer, String> getPets() {
        return pets;
    }

    public void setPet(Integer codigoPet, String nomePet) {
        this.pets.put(codigoPet, nomePet);
    }

    public String getObservacoesDono() {
        return observacoesDono;
    }

    public void setObservacoes(String observacoes) {
        this.observacoesDono = observacoes;
    }
}
