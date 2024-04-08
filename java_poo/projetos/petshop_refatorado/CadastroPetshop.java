package java_poo.projetos.petshop_refatorado;

import java.util.ArrayList;

public class CadastroPetshop {
    private ArrayList<Dono> listaDonosCadastrados = new ArrayList<>();
    private ArrayList<Pet> listaPetsCadastrados = new ArrayList<>();
    
    
    public boolean compararCredenciaisDeDono(Dono dono){
        for (Dono donoNaLista : listaDonosCadastrados){
            if (dono.compararIdentificadores(donoNaLista)){ return true; }
        }
        
        return false;
    }

    public boolean compararPetNaListaDeCadastro(Pet pet){
        for (Pet petNaLista : listaPetsCadastrados){
            if (pet == petNaLista){ return true; }
        }
        
        return false;
    }

    public ArrayList<Dono> obterListaDeDonos(){
        return this.listaDonosCadastrados;
    }

    public void adicionarDonoNaListaDeCadastro(Dono dono){
        if (compararCredenciaisDeDono(dono) == false){
            listaDonosCadastrados.add(dono);
        } else {
            System.out.println("\n[ CPF JÁ CADASTRADO! ]\n");
        }
    }
    
    public void adicionarPetNaListaDeCadastro(Pet pet){
        if (compararPetNaListaDeCadastro(pet) == false){
            listaPetsCadastrados.add(pet);
        } else {
            System.out.println("\n[ PET JÁ CADASTRADO! ]\n");
        }
    }    

    public boolean cadastrarNovoDono(String nomeDono, String cpfDono, String enderecoDono){
        if (new Dono(nomeDono, cpfDono, enderecoDono).validarCpfDoDono(cpfDono)) { 
            adicionarDonoNaListaDeCadastro(new Dono(nomeDono, cpfDono, enderecoDono)); 
            return true;
        } else {
            return false;
        }
    }
}
