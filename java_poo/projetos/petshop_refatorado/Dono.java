package java_poo.projetos.petshop_refatorado;

import java.util.ArrayList;

public class Dono {
    private String nomeCompleto;
    private String cpf;
    private String endereco;
    private ArrayList<Pet> pets = new ArrayList<>();

    public Dono(String nomeCompleto, String cpf, String endereco){
        this.nomeCompleto = nomeCompleto;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    public String obterNomeCompletoDoDono() {
        return nomeCompleto;
    }

    public void adicionarNomeCompletoDoDono(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String obterCpfDoDono() {
        return cpf;
    }

    public String obterEnderecoDoDono() {
        return endereco;
    }

    public void adicionarEnderecoDoDono(String endereco) {
        this.endereco = endereco;
    }

    public ArrayList<Pet> obterPetsDoDono() {
        return pets;
    }

    public void adicionarPetsDoDono(Pet pet) {
        if (pet.compararIdentificadores(this) == false){ pets.add(pet); }
    }

    public boolean compararIdentificadores(Dono dono){
        if (this.obterCpfDoDono() == dono.obterCpfDoDono()){ return true; }
        
        return false;
    }

    @SuppressWarnings("unused")
    public boolean validarCpfDoDono(String cpfDono){
        for (int i = 0; i < cpfDono.length(); i++){
            if (cpfDono.charAt(i) != '0' || cpfDono.charAt(i) != '1' || 
                cpfDono.charAt(i) != '2' || cpfDono.charAt(i) != '3' || 
                cpfDono.charAt(i) != '4' || cpfDono.charAt(i) != '5' || 
                cpfDono.charAt(i) != '6' || cpfDono.charAt(i) != '7' || 
                cpfDono.charAt(i) != '8' || cpfDono.charAt(i) != '9' ||
                cpfDono.charAt(i) != '.' || cpfDono.charAt(i) != '-'){
                    return false;
            } else if (cpfDono.charAt(3) != '.' || cpfDono.charAt(7) != '.' || 
                       cpfDono.charAt(5) != '.' || cpfDono.charAt(11) != '-'){
                return false;
            } else {
                return true;
            }
        }
        
        return true;
    }
}
