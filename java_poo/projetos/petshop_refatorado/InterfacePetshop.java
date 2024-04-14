package java_poo.projetos.petshop_refatorado;

import java.util.Scanner;

public class InterfacePetshop {
    private CadastroPetshop sistemaDeCadastro;
    private ListagemPetshop sistemaDeListagem;

    public InterfacePetshop (CadastroPetshop sistemaDeCadastro){
        this.sistemaDeCadastro = sistemaDeCadastro;
    }

    public void interfaceCadastroDono(){
        Scanner sc = new Scanner(System.in);

        System.out.println("\n[ CADASTRANDO DONO ]\n");
        System.out.println("NOME: ");
        String nomeDono = sc.next();
        sc.nextLine();
        System.out.println("CPF: ");
        String cpfDono = sc.next();
        sc.nextLine();
        System.out.println("ENDEREÇO: ");
        String enderecoDono = sc.next();
        sc.nextLine();
        
        if (sistemaDeCadastro.cadastrarNovoDono(nomeDono, cpfDono, enderecoDono)){
            System.out.println("\n[ NOVO DONO CADASTRADO! ]\n");
        } else {
            System.out.println("\n[ CPF INVÁLIDO! ]\n");
        }

        interfaceDeRetorno();
        sc.close();
    }

    public void interfaceCadastroPet(){
        Scanner sc = new Scanner(System.in);

        System.out.println("\n[ CADASTRANDO PET ]\n");
        System.out.println("NOME: ");
        String nomeDono = sc.next();
        sc.nextLine();
        System.out.println("CÓDIGO: ");
        String cpfDono = sc.next();
        sc.nextLine();
        System.out.println("ENDEREÇO: ");
        String enderecoDono = sc.next();
        sc.nextLine();
        
        if (sistemaDeCadastro.cadastrarNovoDono(nomeDono, cpfDono, enderecoDono)){
            System.out.println("\n[ NOVO DONO CADASTRADO! ]\n");
        } else {
            System.out.println("\n[ CPF INVÁLIDO! ]\n");
        }

        interfaceDeRetorno();
        sc.close();
    }

    public void interfaceParaListarPetsPresentes(){

    }



    public void interfaceParaListarDonos(){
        Scanner sc = new Scanner(System.in);

        System.out.println("\n[ LISTA DE DONOS CADASTRADOS ]\n");
        for (Dono dono : sistemaDeListagem.obterListaDeDonos()){
            System.out.println(dono.obterCpfDoDono() + " - " + dono.obterNomeCompletoDoDono());
            if (dono.validarCpfDoDono(dono.obterCpfDoDono())){
                continue;
            } else {
                System.out.println("\n[ CPF INVÁLIDO! ]\n");
            }
        }
        System.out.print("\n (Digite \"0\" para voltar)\nVISUALIZAR CADASTRO DE DONO [CPF] -> ");
        String cpfDono = sc.next();
        sc.nextLine();

        if (cpfDono == "0"){
            interfaceGeral();
        }

        interfaceParaVerDatalhesDeCadastroDeDono(cpfDono);
    }

    public void interfaceParaVerDatalhesDeCadastroDeDono(String identificador){
        Dono dono = identificadorDeCpf(identificador);

        if (dono == null){
            System.out.println("\n[ CPF INVÁLIDO ]\n");
            interfaceDeRetorno();
        }

        System.out.println("\n[ DETALHES DE CADASTRO DE DONO ]\n");
        System.out.println("NOME: ");
        System.out.println("CPF: ");
        System.out.println("ENDEREÇO: ");
        System.out.println("\n[ PETS ]\n");

        for (Pet pet : dono.obterPetsDoDono()){
            System.out.println(pet.obterCodigoDoPet() + " - " + pet.obterNomeDoPet());
        }

        interfaceDeRetorno();
    }

    public Dono identificadorDeCpf(String cpf){
        for (Dono dono : sistemaDeListagem.obterListaDeDonos()){
            if (dono.obterCpfDoDono() == cpf){
                return dono;
            }
        }

        return null;
    }

    public void interfaceDeRetorno(){
        Scanner sc = new Scanner(System.in);

        System.out.println("\n-- Pressione ENTER para retornar na tela inicial!");
        sc.nextLine();
        interfaceGeral();
        sc.close();
    }

    public void interfaceGeral(){
        Scanner sc = new Scanner(System.in);

        System.out.println("[ PETSHOP AMARAL ]");
        System.out.println("\n--- [Cadastro]\n");
        System.out.println("[1] Cadastrar dono");
        System.out.println("[2] Cadastrar pet");
        System.out.println("\n--- [Listagem]\n");
        System.out.println("[3] Listar donos");
        System.out.println("[4] Listar pets presentes");
        System.out.println("[5] Listar pets deficientes");
        System.out.println("[6] Listar pets prontos");
        System.out.print("\nOpção -> ");

        int opc = sc.nextInt();
        sc.nextLine();

        switch (opc) {
            case 1:
                interfaceCadastroDono();
                break;
        
            case 2:
                
                break;
        
            case 3:
                interfaceParaListarDonos();
                break;
        
            case 4:
                
                break;
        
            case 5:
                
                break;
        
            case 6:
                
                break;

            default:
                
                break;
        }
        sc.close();
    }
}
