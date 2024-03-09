package java_poo.bibliotech;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Biblioteca {
    private String razaoSocial;
    private String cnpj;
    private String endereco;
    private Map<String, List<Livro>> livros = new HashMap<String, List<Livro>>();
    private Map<String, List<List<String>>> usuarios = new HashMap<String, List<List<String>>>();
    private List<Livro> dadosLivro = new ArrayList<Livro>();
    private List<String> dadosUsuario = new ArrayList<String>();
    private List<List<String>> dados = new ArrayList<List<String>>();

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

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void interfaceBiblioteca(){
        Scanner scanner = new Scanner(System.in);
        Integer opcao = 8;
        
        while (opcao != 0){
            
            System.out.println("                     ");
            System.out.println("INTERFACE BIBLIOTECH:");
            System.out.println("                     ");
            System.out.println("1 - Cadastrar usuário");
            System.out.println("2 - Cadastrar livro");
            System.out.println("3 - Consultar usuários cadastrados");
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

        System.out.println("                    ");
        System.out.println("CADASTRANDO USUÁRIO:");
        System.out.println("                    ");
        
        System.out.println("ID: ");
        String id = scanner.next();
        scanner.nextLine();
        
        System.out.println("Nome completo: ");
        String nome = scanner.next();
        scanner.nextLine();
        
        System.out.println("Telefone: ");
        String telefone = scanner.next();
        scanner.nextLine();
        
        System.out.println("Email: ");
        String email = scanner.next();
        scanner.nextLine();
        
        System.out.println("Endereço: ");
        String endereco = scanner.next();
        scanner.nextLine();

        Usuario usuario = new Usuario(id, nome, telefone, email, endereco);
        
        dadosUsuario.add(0, usuario.getId());
        dadosUsuario.add(1, usuario.getNome());
        dadosUsuario.add(2, usuario.getTelefone());
        dadosUsuario.add(3, usuario.getEmail());
        dadosUsuario.add(4, usuario.getEndereco());

        dados.add(dadosUsuario);
        usuarios.put(usuario.getId(), dados);

        System.out.println(usuarios.get(usuario.getId()));
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
    
    