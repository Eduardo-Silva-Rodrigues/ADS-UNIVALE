package java_poo.bibliotech;

import java.util.Scanner;

public class Biblioteca {
    public String razaoSocial;
    public String cnpj;
    public String endereco;
    public Livro[] acervo;
    public Usuario[] listaUsuarios;

    Biblioteca(String razaoSocial, String cnpj, String endereco){
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.endereco = endereco;
    }
    
    public String getRazaoSocial() {
        return razaoSocial;
    }
    public String getCnpj() {
        return cnpj;
    }
    public String getEndereco() {
        return endereco;
    }
    public Livro[] getLivros(){
        return this.acervo;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public void setLivro(Livro[] livro){
        this.acervo = livro;
    } 

    public void interfaceBiblioteca(){
        Scanner scanner = new Scanner(System.in);
        Integer opcao = 8;
        
        while (opcao != 0){
            
            System.out.println("                     ");
            System.out.println("INTERFACA BIBLIOTECH:");
            System.out.println("                     ");
            System.out.println("1 - Cadastrar usuário");
            System.out.println("2 - Cadastrar livro");
            System.out.println("3 - Consultar usários cadastrados");
            System.out.println("4 - Consultar acervo de livros");
            System.out.println("5 - Gerar relatórios de empréstimos");
            System.out.println("6 - Registrar empréstimo");
            System.out.println("7 - Registrar devolução");
            System.out.println("                     ");
            System.out.println("0 - Sair");
            System.out.println("                     ");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();
        
            switch (opcao) {
                case 1:
                    cadastrarUsuario();
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
                case 7:
                    break;
                case 0:
                    scanner.close();
                    break;
                default:
                    System.out.println("Esta opção não é válida");
            }
        }
    }

    public void cadastrarUsuario(){
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        String nome;
        String telefone;
        String email;
        String endereco;

        System.out.println("                    ");
        System.out.println("CADASTRANDO USUÁRIO:");
        System.out.println("                    ");
        System.out.println("Nome completo: ");
        nome = scanner.next();
        scanner.nextLine();
        System.out.println("Telefone: ");
        telefone = scanner.next();
        scanner.nextLine();
        System.out.println("Email: ");
        email = scanner.next();
        scanner.nextLine();
        System.out.println("Endereço: ");
        endereco = scanner.next();
        scanner.nextLine();

        // scanner.close();

        @SuppressWarnings("unused")
        Usuario usuario = new Usuario(nome, telefone, email, endereco);
    }

    public void cadastrarLivro(){
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Registrar ISBN: ");
        Integer ISBN = scanner.nextInt();
        // scanner.close();

        System.out.println("ISBN: "+ ISBN);    
    }
}
    
    