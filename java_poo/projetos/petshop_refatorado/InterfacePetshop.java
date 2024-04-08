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

        interfaceGeral();
        sc.close();
    }

    public void interfaceCadastroPet(){

    }

    public void interfaceParaListarPetsPresentes(){

    }



    public void interfaceParaListarDonos(){
        Scanner sc = new Scanner(System.in);

        System.out.println("\n[ LISTANDO DONOS ]\n");
        for (Dono dono : sistemaDeListagem.obterListaDeDonos()){
            System.out.println(dono.obterCpfDoDono() + " - " + dono.obterNomeCompletoDoDono());
        }
        System.out.print("\nCPF -> ");
        String cpfDono = sc.next();
        sc.nextLine();

        validarCpfDoDono(cpfDono);
    }

    public void interfaceParaVerDatalhesDeCadastro(){

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
