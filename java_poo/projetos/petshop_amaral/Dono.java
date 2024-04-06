package java_poo.projetos.petshop_amaral;

import java.util.ArrayList;

public class Dono {
    private int codigoDono;
    private String nome;
    private String endereco;
    private ArrayList<String> pets = new ArrayList<String>();
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

    public ArrayList<String> getPets() {
        return pets;
    }

    public void setPet(String nomePet) {
        this.pets.add(nomePet);
    }

    public String getObservacoesDono() {
        return observacoesDono;
    }

    public void setObservacoesDono(String observacoesDono) {
        this.observacoesDono = observacoesDono;
    }

    
}
