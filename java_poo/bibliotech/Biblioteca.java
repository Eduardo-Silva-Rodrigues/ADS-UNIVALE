package java_poo.bibliotech;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.ArrayList;

public class Biblioteca {
    private String razaoSocial;
    private String cnpj;
    private String endereco;
    private Map<String, ArrayList<String>> livros = new HashMap<String, ArrayList<String>>();
    private Map<String, ArrayList<String>> usuarios = new HashMap<String, ArrayList<String>>();
    // private ArrayList<ArrayList<String>> dados = new ArrayList<ArrayList<String>>();

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

    public void verificar(String id){
        for (Map.Entry<String, ArrayList<String>> entry : usuarios.entrySet()) {
            if (entry.getKey() == id){
                System.out.println("ID já cadastrado!");
            }
        }
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
                    ArrayList<String> listaUsuario = cadastrarUsuario();
                    usuarios.put(listaUsuario.get(0), listaUsuario);
                    continuar();
                    break;
                case 2:
                    ArrayList<String> listaLivro = cadastrarLivro();
                    livros.put(listaLivro.get(0), listaLivro);
                    continuar();
                    break;
                case 3:
                    consultarUsuarios();
                    break;
                case 4:
                consultarLivros();
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

    public void continuar(){
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        System.out.println("                    ");
        System.out.println("Pressione ENTER pra continuar");
        scanner.nextLine();
    }

    public ArrayList<String> cadastrarUsuario(){
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        System.out.println("                    ");
        System.out.println("CADASTRANDO USUÁRIO:");
        System.out.println("                    ");
        
        System.out.println("Novo ID: ");
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
        
        ArrayList<String> dadosUsuario = new ArrayList<String>();
        dadosUsuario.add(0, usuario.getID());
        dadosUsuario.add(1, usuario.getNome());
        dadosUsuario.add(2, usuario.getTelefone());
        dadosUsuario.add(3, usuario.getEmail());
        dadosUsuario.add(4, usuario.getEndereco());

        return dadosUsuario;
    }

    public ArrayList<String> cadastrarLivro(){
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        System.out.println("                    ");
        System.out.println("CADASTRANDO LIVRO:");
        System.out.println("                    ");
        
        System.out.println("ISBN: ");
        String livroISBN = scanner.next();
        scanner.nextLine();

        System.out.println("Titulo: ");
        String livroTitulo = scanner.next();
        scanner.nextLine();
        
        System.out.println("Categoria: ");
        String livroCategoria = scanner.next();
        scanner.nextLine();
        
        System.out.println("Autor: ");
        String livroAutor = scanner.next();
        scanner.nextLine();
        
        System.out.println("Editora: ");
        String livroEditora = scanner.next();
        scanner.nextLine();

        System.out.println("Ano de Publicação: ");
        String livroAnoPublicacao = scanner.next();
        scanner.nextLine();

        Livro livro = new Livro(livroISBN, livroTitulo, livroCategoria, livroAutor, livroEditora, livroAnoPublicacao, "FUNDAÇÃO BIBLIOTECA NACIONAL", "40.176.679/0001-99", "R. Debret, 23 - Centro, Rio de Janeiro");
        
        ArrayList<String> dadosLivro = new ArrayList<String>();
        dadosLivro.add(0, livro.getISBN());
        dadosLivro.add(1, livro.getTitulo());
        dadosLivro.add(2, livro.getCategoria());
        dadosLivro.add(3, livro.getAutor());
        dadosLivro.add(4, livro.getEditora());
        dadosLivro.add(5, livro.getAnoPublicacao());

        return dadosLivro;
    }

    public void consultarUsuarios(){
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        System.out.println("                    ");
        System.out.println("CONSULTA DE USUÁRIOS:");
        System.out.println("                    ");
        System.out.println("Informe o ID do usuário:");
        String idUser = scanner.next();
        scanner.hasNextLine();

        System.out.println("                    ");
        System.out.println("DADOS DO USUÁRIO:");
        System.out.println("                    ");
        System.out.println("ID: " + usuarios.get(idUser).get(0));
        System.out.println("NOME: " + usuarios.get(idUser).get(1));
        System.out.println("TELEFONE: " + usuarios.get(idUser).get(2));
        System.out.println("EMAIL: " + usuarios.get(idUser).get(3));
        System.out.println("ENDEREÇO: " + usuarios.get(idUser).get(4));

        continuar();
    }

    public void consultarLivros(){
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        System.out.println("                    ");
        System.out.println("CONSULTA DE LIVROS:");
        System.out.println("                    ");
        System.out.println("Informe o ISBN do livro:");
        String isbnLivro = scanner.next();
        scanner.hasNextLine();

        System.out.println("                    ");
        System.out.println("DADOS DO USUÁRIO:");
        System.out.println("                    ");
        System.out.println("ISBN: " + livros.get(isbnLivro).get(0));
        System.out.println("TITULO: " + livros.get(isbnLivro).get(1));
        System.out.println("CATEGORIA: " + livros.get(isbnLivro).get(2));
        System.out.println("AUTOR: " + livros.get(isbnLivro).get(3));
        System.out.println("EDITORA: " + livros.get(isbnLivro).get(4));
        System.out.println("ANO DE PUBLICAÇÃO: " + livros.get(isbnLivro).get(5));

        continuar();
    }
}
    
    