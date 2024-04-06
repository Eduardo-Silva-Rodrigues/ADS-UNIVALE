package java_poo.projetos.petshop_amaral;

import java.util.Map;
import java.util.HashMap;

public class Dono {
    private int codigoDono;
    private String nome;
    private String endereco;
    private Map<Integer, String> pets = new HashMap<Integer, String>();
    private String observacoesDono;

    public Dono(int codigoDono, String nome, String endereco){
        this.codigoDono = codigoDono;
        this.nome = nome;
        this.endereco = endereco;
    }

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
