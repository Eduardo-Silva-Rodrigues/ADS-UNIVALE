package java_poo.projetos.petshop_amaral;

//Imports:
import java.util.ArrayList; //Listas para guardar os donos e pets
import java.util.HashMap; //Hashmap para criar pares de chave e valor a fim de identificar os pets presentes no petshop
import java.util.Map; //Map para guardar esses pares
import java.util.Scanner; //Scanner para a entrada de dados

public class Petshop {
    //Propriedades do sistema de petshop:
    private ArrayList<Dono> donosCadastrados = new ArrayList<Dono>();
    private ArrayList<Cachorro> caesCadastrados = new ArrayList<Cachorro>();
    private ArrayList<Gato> gatosCadastrados = new ArrayList<Gato>();
    private ArrayList<Furao> furoesCadastrados = new ArrayList<Furao>();
    private ArrayList<PorquinhoDaIndia> porquinhosDaIndiaCadastrados = new ArrayList<PorquinhoDaIndia>();
    private Map<Integer, String> petsPresentes = new HashMap<Integer, String>();

    //Método construtor:
    public Petshop(ArrayList<Dono> donosCadastrados, Map<Integer, String> petsPresentes){
        this.donosCadastrados = donosCadastrados;
        this.petsPresentes = petsPresentes;
    }

    // Getters and setters:
    public ArrayList<Dono> getDonosCadastrados() {
        return donosCadastrados;
    }

    public void setDonoListaCadastro(Dono donos) {
        if (this.donosCadastrados.isEmpty()){
            this.donosCadastrados.add(0, donos);
        } else {
                this.donosCadastrados.add(this.donosCadastrados.size(), donos);
        }
    }

    public ArrayList<Cachorro> getCaesCadastrados() {
        return caesCadastrados;
    }

    public void setCaesCadastrados(Cachorro cachorro) {
        if (this.caesCadastrados.isEmpty() == true){
            this.caesCadastrados.add(0, cachorro);
        } else {
                this.caesCadastrados.add(this.caesCadastrados.size(), cachorro);
        }    
    }

    public ArrayList<Gato> getGatosCadastrados() {
        return gatosCadastrados;
    }

    public void setGatosCadastrados(Gato gato) {
        if (this.gatosCadastrados.isEmpty() == true){
            this.gatosCadastrados.add(0, gato);
        } else {
                this.gatosCadastrados.add(this.gatosCadastrados.size(), gato);
        } 
    }

    public ArrayList<Furao> getFuroesCadastrados() {
        return furoesCadastrados;
    }

    public void setFuroesCadastrados(Furao furao) {
        if (this.furoesCadastrados.isEmpty() == true){
            this.furoesCadastrados.add(0, furao);
        } else {
                this.furoesCadastrados.add(this.furoesCadastrados.size(), furao);
        } 
    }

    public ArrayList<PorquinhoDaIndia> getPorquinhosDaIndiaCadastrados() {
        return porquinhosDaIndiaCadastrados;
    }

    public void setPorquinhosDaIndiaCadastrados(PorquinhoDaIndia porquinhoDaIndia) {
        if (this.porquinhosDaIndiaCadastrados.isEmpty() == true){
            this.porquinhosDaIndiaCadastrados.add(0, porquinhoDaIndia);
        } else {
                this.porquinhosDaIndiaCadastrados.add(this.porquinhosDaIndiaCadastrados.size(), porquinhoDaIndia);
        }     
    }

    public Map<Integer, String> getPetsPresentes() {
        return petsPresentes;
    }

    public void setPetPresente(Integer codigoPetPresente, String nomePetPresente) {
        this.petsPresentes.put(codigoPetPresente, nomePetPresente);
    }

    //Método de cadastro de Dono e Pet:
    public void criarCadastrarDonoEPet(){
        Scanner sc = new Scanner(System.in);

        //Entrada de dados para cadastro do dono:
        System.out.println("               ");
        System.out.println("[ CADASTRAR DONO ]");
        System.out.println("               ");
        System.out.print("Código: ");
        int codigoDono = sc.nextInt();
        sc.nextLine();
        System.out.println("               ");
        System.out.print("Nome: ");
        String nomeDono = sc.next();
        sc.nextLine();
        System.out.println("               ");
        System.out.print("Endereço: ");
        String enderecoDono = sc.next();
        sc.nextLine();
        System.out.println("               ");
        System.out.print("Observação: ");
        String observacaoDono = sc.next();
        sc.nextLine();

        //Entrada de dados para o cadastro do pet:
        System.out.println("               ");
        System.out.println("[ CADASTRAR PET ]");
        System.out.println("               ");
        System.out.print("Código: ");
        int codigoPet = sc.nextInt();
        sc.nextLine();
        System.out.println("               ");
        System.out.print("Nome: ");
        String nomePet = sc.next();
        sc.nextLine();
        System.out.println("               ");
        System.out.print("Idade: ");
        int idadePet = sc.nextInt();
        sc.nextLine();
        System.out.println("               ");
        System.out.print("Raça: ");
        String racaPet = sc.next();
        sc.nextLine();

        //Seletor do tipo de animal:
        System.out.println("               ");
        System.out.println("[ TIPOS DE PET ]");
        System.out.println("               ");
        System.out.println("[1] Cachorro");
        System.out.println("[2] Gato");
        System.out.println("[3] Furão");
        System.out.println("[4] Porquinho da india");
        System.out.println("               ");
        System.out.print("Opção: ");
        int numeroTipoPet = sc.nextInt();
        sc.nextLine();

        Dono dono = new Dono(codigoDono, nomeDono, enderecoDono);
        dono.setObservacoes(observacaoDono);
        setDonoListaCadastro(dono);
        

        //Condicionais para a criação correta do objeto em relação ao tipo de pet:
        if (numeroTipoPet == 1){
            Cachorro cachorro = new Cachorro(codigoPet, nomePet, idadePet, false, racaPet);
            dono.setPet(codigoPet, nomePet); //O código e nome do pet é adicionado ao Map do dono
            setCaesCadastrados(cachorro); //O pet também é adicionado a lista de cadastro de seu respectivo tipo
            exibirInformacoesDono(codigoDono); //Método para exibir as informações do cadastro
        } 
        
        else if (numeroTipoPet == 2){
            Gato gato = new Gato(codigoPet, nomePet, idadePet, false, racaPet);
            dono.setPet(codigoPet, nomePet);
            setGatosCadastrados(gato);
            exibirInformacoesDono(codigoDono);
        } 
        
        else if (numeroTipoPet == 3){
            Furao gato = new Furao(codigoPet, nomePet, idadePet, false, racaPet);
            dono.setPet(codigoPet, nomePet);
            setFuroesCadastrados(gato);
            exibirInformacoesDono(codigoDono);
        } 
        
        else if (numeroTipoPet == 4){
            PorquinhoDaIndia porquinhoDaIndia = new PorquinhoDaIndia(codigoPet, nomePet, idadePet, false, racaPet);
            dono.setPet(codigoPet, nomePet);
            setPorquinhosDaIndiaCadastrados(porquinhoDaIndia);
            exibirInformacoesDono(codigoDono);
        } 
        
        //Caso a opção selecionada não for reconhecida, uma mensagem de erro é retornada:
        else {
            System.out.println("Tipo de animal não cadastrado");
        }
        
        sc.close();
    }

    //Método para visualizar os donos cadastrados no sistema:
    public void visualizarDonosCadastrados(){
        Scanner sc = new Scanner(System.in);

        //Lista de donos e seus respectivos códigos:
        System.out.println("          ");
        System.out.println("[ DONOS CADASTRADOS ]");
        System.out.println("          ");

        for (int i = 0; i < donosCadastrados.size(); i++){
            System.out.println(donosCadastrados.get(i).getCodigoDono() + " - " + donosCadastrados.get(i).getNome());
        }

        System.out.println("                            ");
        System.out.print("Exibir informações do dono [Código]: "); //Requisição do código
        int codigoDono = sc.nextInt();
        sc.nextLine();
        exibirInformacoesDono(codigoDono); //Método que coleta o código e exibe as informações do Dono escolhido
        sc.close();
    }

    //Método que exibe as informações de um dono:
    public void exibirInformacoesDono(int codigoDono){
        Scanner sc = new Scanner(System.in);

        //Laço de repetição que compara os códigos de todos os donos e retornas as informações do dono que possuir o código igual ao do parâmetro "códigoDono":
        for (Dono dono : donosCadastrados){
            if (dono.getCodigoDono() == codigoDono){
                //Saída de dados das informações do dono:
                System.out.println("            ");
                System.out.println("[ DETALHES DE CADASTRO ]");
                System.out.println("            ");
                System.out.println("Código: " + dono.getCodigoDono());
                System.out.println("Nome: " + dono.getNome());
                System.out.println("Endereço: " + dono.getEndereco());
                System.out.println("Observação: " + dono.getObservacoesDono());
                
                //Exibição dos pets do dono (e seus códigos):
                System.out.println("            ");
                System.out.println("[ PETS ]");
                System.out.println("            ");
                System.out.println(dono.getPets().entrySet());
                
                System.out.println("            ");
                System.out.print("Exibir informações do pet [Código]: "); //Requisição de código de pet
                int codigoPet = sc.nextInt();
                sc.nextLine();
                exibirInformacoesPetAtualizarPresencaEObservacoes(codigoPet); //Método para exibir informações e alterar alguns dados do pet
            }
        }

        sc.close();
    }
    
    //Método para exibir informações e alterar algumas informações de um pet:
    public void exibirInformacoesPetAtualizarPresencaEObservacoes(int codigoPet){
        Scanner sc = new Scanner(System.in);

        String nome = "";
        int idade = 0;
        String presenca = "";
        String observacoes = "";
        String tipoAnimal = "";
        String raca = "";

        //Laços de repetição para verificar cada tipo de pet e comparar seus códigos, o objetivo disso é identificar o pet que queremos:
        for (Cachorro cachorro : caesCadastrados){
            if (codigoPet == cachorro.getCodigoAnimal()){ //Comparador de códigos
                //Coleta de dados:
                nome = cachorro.getNome();
                idade = cachorro.getIdade();
                if (cachorro.getPresenca() == true){
                    presenca = "Presente";
                } else {
                    presenca = "Ausente";
                }
                observacoes = cachorro.getObservacoes();
                tipoAnimal = cachorro.getTipo();
                raca = cachorro.getRaca();
            }
        }

        for (Gato gato : gatosCadastrados){
            if (codigoPet == gato.getCodigoAnimal()){
                nome = gato.getNome();
                idade = gato.getIdade();
                if (gato.getPresenca() == true){
                    presenca = "Presente";
                } else {
                    presenca = "Ausente";
                }                observacoes = gato.getObservacoes();
                tipoAnimal = gato.getTipo();
                raca = gato.getRaca();
            }
        }
        
        for (Furao furao : furoesCadastrados){
            if (codigoPet == furao.getCodigoAnimal()){
                nome = furao.getNome();
                idade = furao.getIdade();
                if (furao.getPresenca() == true){
                    presenca = "Presente";
                } else {
                    presenca = "Ausente";
                }                observacoes = furao.getObservacoes();
                tipoAnimal = furao.getTipo();
                raca = furao.getRaca();
            }
        }
        
        for (PorquinhoDaIndia porquinhoDaIndia : porquinhosDaIndiaCadastrados){
            if (codigoPet == porquinhoDaIndia.getCodigoAnimal()){
                nome = porquinhoDaIndia.getNome();
                idade = porquinhoDaIndia.getIdade();
                if (porquinhoDaIndia.getPresenca() == true){
                    presenca = "Presente";
                } else {
                    presenca = "Ausente";
                }                observacoes = porquinhoDaIndia.getObservacoes();
                tipoAnimal = porquinhoDaIndia.getTipo();
                raca = porquinhoDaIndia.getRaca();
            }
        }
        
        //Saída de dados das informações de pet:
        System.out.println("           ");
        System.out.println("[ DETALHES DO PET ]");
        System.out.println("           ");
        System.out.println("Código: " + codigoPet);
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Presença: " + presenca);
        System.out.println("Observações: " + observacoes);
        System.out.println("Tipo de animal: " + tipoAnimal);
        System.out.println("Raça: " + raca);
        
        //Interface que permite alterar o estado de presença do pet ou encerrar o processe atual:
        System.out.println("                 ");
        System.out.println("[ APLICAR/ALTERAR PRESENÇA ]");
        System.out.println("                 ");
        System.out.println("[1] Presente");
        System.out.println("[2] Ausente");
        System.out.println("[3] Sair");
        System.out.println("                 ");
        System.out.print("Opção: ");
        int res = sc.nextInt();
        
        if (res == 3){
            sc.close();
        }
        
        sc.nextLine();

        //Interface que permite aplicar uma observação sobre o pet:
        System.out.println("                 ");
        System.out.println("[ APLICAR/ALTERAR OBSERVAÇÃO ]");
        System.out.println("                 ");
        System.out.print("Observação: ");
        String obs = sc.next();
        sc.nextLine();

        //Condicionais e laços de repetição para aplicar as alterações:
        if (tipoAnimal == "Cachorro"){
            for (Cachorro cachorro : caesCadastrados){
                if (cachorro.getCodigoAnimal() == codigoPet && res == 1){
                    cachorro.setPresenca(true); //Aplica a alteração de estado de presença
                    cachorro.setObservacoes(obs); //Aplica a alteração de observação do pet
                    exibirInformacoesPetAtualizarPresencaEObservacoes(codigoPet); //Executa mais uma vez a exibição e alteração de informações do pet para ver as alterações atualizadas
                } else if (cachorro.getCodigoAnimal() == codigoPet && res == 2){
                    cachorro.setPresenca(false);
                    cachorro.setObservacoes(obs);
                    exibirInformacoesPetAtualizarPresencaEObservacoes(codigoPet);
                }
            }
        } else if (tipoAnimal == "Gato"){
            for (Gato gato : gatosCadastrados){
                if (gato.getCodigoAnimal() == codigoPet && res == 1){
                    gato.setPresenca(true);
                    gato.setObservacoes(obs);
                    exibirInformacoesPetAtualizarPresencaEObservacoes(codigoPet);
                } else if (gato.getCodigoAnimal() == codigoPet && res == 2){
                    gato.setPresenca(false);
                    gato.setObservacoes(obs);
                    exibirInformacoesPetAtualizarPresencaEObservacoes(codigoPet);
                }
            }
        } else if (tipoAnimal == "Furão"){
            for (Furao furao : furoesCadastrados){
                if (furao.getCodigoAnimal() == codigoPet && res == 1){
                    furao.setPresenca(true);
                    furao.setObservacoes(obs);
                    exibirInformacoesPetAtualizarPresencaEObservacoes(codigoPet);
                } else if (furao.getCodigoAnimal() == codigoPet && res == 2){
                    furao.setPresenca(false);
                    furao.setObservacoes(obs);
                    exibirInformacoesPetAtualizarPresencaEObservacoes(codigoPet);
                }
            }
        } else if (tipoAnimal == "Porquinho da India"){
            for (PorquinhoDaIndia porquinhoDaIndia : porquinhosDaIndiaCadastrados){
                if (porquinhoDaIndia.getCodigoAnimal() == codigoPet && res == 1){
                    porquinhoDaIndia.setPresenca(true);
                    porquinhoDaIndia.setObservacoes(obs);
                    exibirInformacoesPetAtualizarPresencaEObservacoes(codigoPet);
                } else if (porquinhoDaIndia.getCodigoAnimal() == codigoPet && res == 2){
                    porquinhoDaIndia.setPresenca(false);
                    porquinhoDaIndia.setObservacoes(obs);
                    exibirInformacoesPetAtualizarPresencaEObservacoes(codigoPet);
                }
            }
        } else {
            System.out.println("Animal não encontrado");
        }

        sc.close();
    }

    //Método que organiza os pets presentes no petshop, adicionando-os na lista de presença:
    public void organizarPetsPresentes(){
        
        //Laço de repetição para verificar pet por pet:
        for (Cachorro cachorro : caesCadastrados){
            if (cachorro.getPresenca() == true){ //Condicional para verificar o estado da sua presença
                setPetPresente(cachorro.getCodigoAnimal(), cachorro.getNome()); //Caso seja verdadeiro ele é adicionado na lista de presença
            }
        }

        for (Gato gato : gatosCadastrados){
            if (gato.getPresenca() == true){
                setPetPresente(gato.getCodigoAnimal(), gato.getNome());
            }
        }
        
        for (Furao furao : furoesCadastrados){
            if (furao.getPresenca() == true){
                setPetPresente(furao.getCodigoAnimal(), furao.getNome());
            }
        }
        
        for (PorquinhoDaIndia porquinhoDaIndia : porquinhosDaIndiaCadastrados){
            if (porquinhoDaIndia.getPresenca() == true){
                setPetPresente(porquinhoDaIndia.getCodigoAnimal(), porquinhoDaIndia.getNome());
            }
        }
        
    }
}
