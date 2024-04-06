package java_poo.projetos.petshop_amaral;

import java.util.ArrayList;
import java.util.Scanner;

public class Petshop {
    private ArrayList<Dono> donosCadastrados;
    private ArrayList<Cachorro> caesCadastrados;
    private ArrayList<Gato> gatosCadastrados;
    private ArrayList<Furao> furoesCadastrados;
    private ArrayList<PorquinhoDaIndia> porquinhosDaIndiaCadastrados;
    private ArrayList<String> petsPresentes;

    public Petshop(ArrayList<Dono> donosCadastrados, ArrayList<String> petsPresentes){
        this.donosCadastrados = donosCadastrados;
        this.petsPresentes = petsPresentes;
    }

    public ArrayList<Dono> getDonosCadastrados() {
        return donosCadastrados;
    }

    public void setDonoListaCadastro(Dono donos) {
        this.donosCadastrados.add(donos);
    }

    public ArrayList<Cachorro> getCaesCadastrados() {
        return caesCadastrados;
    }

    public void setCaesCadastrados(Cachorro cachorro) {
        this.caesCadastrados.add(cachorro);
    }

    public ArrayList<Gato> getGatosCadastrados() {
        return gatosCadastrados;
    }

    public void setGatosCadastrados(Gato gato) {
        this.gatosCadastrados.add(gato);
    }

    public ArrayList<Furao> getFuroesCadastrados() {
        return furoesCadastrados;
    }

    public void setFuroesCadastrados(Furao furao) {
        this.furoesCadastrados.add(furao);
    }

    public ArrayList<PorquinhoDaIndia> getPorquinhosDaIndiaCadastrados() {
        return porquinhosDaIndiaCadastrados;
    }

    public void setPorquinhosDaIndiaCadastrados(PorquinhoDaIndia porquinhoDaIndia) {
        this.porquinhosDaIndiaCadastrados.add(porquinhoDaIndia);
    }

    public ArrayList<String> getPetsPresentes() {
        return petsPresentes;
    }

    public void setPetPresente(String petPresente) {
        this.petsPresentes.add(petPresente);
    }

    public void criarCadastrarDonoEPet(){
        Scanner sc = new Scanner(System.in);

        System.out.println("CADASTRAR DONO:");
        System.out.println("               ");
        System.out.print("Código: ");
        int codigoDono = sc.nextInt();
        System.out.println("               ");
        System.out.print("Nome: ");
        String nomeDono = sc.next();
        System.out.println("               ");
        System.out.print("Endereço: ");
        String enderecoDono = sc.next();

        System.out.println("               ");
        System.out.println("CADASTRAR PET:");
        System.out.println("               ");
        System.out.print("Código: ");
        int codigoPet = sc.nextInt();
        System.out.println("               ");
        System.out.print("Nome: ");
        String nomePet = sc.next();
        System.out.println("               ");
        System.out.print("Idade: ");
        int idadePet = sc.nextInt();
        System.out.println("               ");
        System.out.print("Raça: ");
        String racaPet = sc.next();

        System.out.println("               ");
        System.out.println("TIPOS DE PET:");
        System.out.println("               ");
        System.out.println("[1] Cachorro");
        System.out.println("[2] Gato");
        System.out.println("[3] Furão");
        System.out.println("[4] Porquinho da india");
        int numeroTipoPet = sc.nextInt();

        Dono dono = new Dono(codigoDono, nomeDono, enderecoDono);
        setDonoListaCadastro(dono);

        if (numeroTipoPet == 1){
            Cachorro cachorro = new Cachorro(codigoPet, nomePet, idadePet, null, racaPet);
            dono.setPet(nomePet);
            caesCadastrados.add(cachorro);
        } else if (numeroTipoPet == 2){
            Gato gato = new Gato(codigoPet, nomePet, idadePet, null, racaPet);
            dono.setPet(nomePet);
            gatosCadastrados.add(gato);
        } else if (numeroTipoPet == 3){
            Furao gato = new Furao(codigoPet, nomePet, idadePet, null, racaPet);
            dono.setPet(nomePet);
            furoesCadastrados.add(gato);
        } else if (numeroTipoPet == 4){
            PorquinhoDaIndia porquinhoDaIndia = new PorquinhoDaIndia(codigoPet, nomePet, idadePet, null, racaPet);
            dono.setPet(nomePet);
            porquinhosDaIndiaCadastrados.add(porquinhoDaIndia);
        } else {
            System.out.println("Nenhum animal cadastrado");
        }
        sc.close();
    }

    public void visualizarDonosCadastrados(){
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < donosCadastrados.size(); i++){
            System.out.println(donosCadastrados.get(i).getCodigoDono() + " - " + donosCadastrados.get(i));
        }

        System.out.print("Exibir informações do dono: ");
        int codigoDono = sc.nextInt();
        exibirInformacoesDono(codigoDono);
        sc.close();
    }

    public void exibirInformacoesDono(int codigoDono){

    }
}
