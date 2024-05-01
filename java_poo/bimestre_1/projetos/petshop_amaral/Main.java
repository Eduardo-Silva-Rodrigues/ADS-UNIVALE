package java_poo.projetos.petshop_amaral;

//Imports (Explicados nas classes):
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Criadno objetos "Dono"
        Dono dono01 = new Dono(300, "Mauricio", "Rua Alameda dos Anjos");
        dono01.setObservacoes("Vai volta pra buscar 15:30");
        Dono dono02 = new Dono(140, "Ruan", "Rua Precipicio de Golias");
        dono02.setObservacoes("Para entregar em casa depois das 14:00");
        Dono dono03 = new Dono(970, "Levi", "Av. Eden");
        dono03.setObservacoes("Carro azul vai vir buscar 16:00");
        ArrayList<Dono> donosCadastrados = new ArrayList<Dono>();
        donosCadastrados.add(dono01);
        donosCadastrados.add(dono02);
        donosCadastrados.add(dono03);

        // Criando objeto "Petshop"
        Map<Integer, String> petsPresentes = new HashMap<Integer, String>();
        Petshop petshop = new Petshop(donosCadastrados, petsPresentes);

        // Criando objetos "Cachorro"
        Cachorro cachorro01 = new Cachorro(150, "Bob", 7, true, "Doberman");
        cachorro01.setObservacoes("Gosta que coça de baixo da orelha");
        petshop.setCaesCadastrados(cachorro01);
        Cachorro cachorro02 = new Cachorro(280, "Chico", 2, true, "Golden");
        cachorro02.setObservacoes("Muito medroso");
        petshop.setCaesCadastrados(cachorro02);
        Cachorro cachorro03 = new Cachorro(500, "Coin", 5, false, "Pinscher");
        cachorro03.setObservacoes("Muito perigoso, precisa de focinheira");
        petshop.setCaesCadastrados(cachorro03);

        // Criando objetos "Gato"
        Gato gato01 = new Gato(320, "Pelé", 4, false, "Siamês");
        gato01.setObservacoes("Deficiência: Sem perna esquerda traseira");
        petshop.setGatosCadastrados(gato01);
        Gato gato02 = new Gato(50, "Luna", 8, false, "Maine Coon");
        gato02.setObservacoes("Muito bravo (pode arranhar)");
        petshop.setGatosCadastrados(gato02);

        // Criando objeto "Furao"
        Furao furao01 = new Furao(20, "Claudio", 3, true, "Panda");
        furao01.setObservacoes("Muito preguiçoso, pode dormir no banho");
        petshop.setFuroesCadastrados(furao01);


        // Criando objetos "PorquinhoDaIndia"
        PorquinhoDaIndia porquinhoDaIndia01 = new PorquinhoDaIndia(100, "Frederico", 1, true, "Inglês");
        porquinhoDaIndia01.setObservacoes("Deficiência: Cego");
        petshop.setPorquinhosDaIndiaCadastrados(porquinhoDaIndia01);
        PorquinhoDaIndia porquinhoDaIndia02 = new PorquinhoDaIndia(920, "Diego", 4, false, "Rex");
        porquinhoDaIndia02.setObservacoes("Gosta de se esconder");
        petshop.setPorquinhosDaIndiaCadastrados(porquinhoDaIndia02);
        PorquinhoDaIndia porquinhoDaIndia03 = new PorquinhoDaIndia(790, "Ichigo", 5, true, "Teddy");
        porquinhoDaIndia03.setObservacoes("Alérgico a shampoo X");
        petshop.setPorquinhosDaIndiaCadastrados(porquinhoDaIndia03);

        // Setando objetos pets para objetos Dono
        dono01.setPet(150, "Bob");
        dono01.setPet(320, "Pelé");

        dono02.setPet(280, "Chico");
        dono02.setPet(50, "Luna");
        dono02.setPet(100, "Frederico");

        dono03.setPet(20, "Claudio");
        dono03.setPet(920, "Diego");
        dono03.setPet(790, "Ichigo");

        // Organizar os Pets presentes no Petshop (Adicionar eles na lista de presença)
        petshop.organizarPetsPresentes();

        // Cadastrar novos Donos e Pets
        petshop.criarCadastrarDonoEPet(); //Comentar este método para usar o próximo

        // Visualizar cadastro e detalhes de Donos e Pets
        petshop.visualizarDonosCadastrados();



    }
}
