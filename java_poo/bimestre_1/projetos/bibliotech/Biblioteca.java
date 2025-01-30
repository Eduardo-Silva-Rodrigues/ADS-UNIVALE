package java_poo.bimestre_1.projetos.bibliotech;

import java.time.LocalDateTime;
import java.util.*;

public class Biblioteca {
    private String razaoSocial;
    private String cnpj;
    private String endereco;
    private Set<Livro> livrosDisponiveis = new TreeSet<>(LivroPorNome::compare);
    private Set<Usuario> usuariosCadastrados = new TreeSet<>(UsuarioPorNome::compare);
    private Set<Livro> livrosIndisponiveis = new TreeSet<>(LivroPorNome::compare);
    private Queue<String> relatorios = new PriorityQueue<>(String::compareTo);
    private final Scanner scanner = new Scanner(System.in);

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
        int opcao = 10;
        
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
            System.out.println("8 - Listar todos os usuários");
            System.out.println("9 - Listar todos os livros");
            System.out.println("                     ");
            System.out.println("0 - Sair");
            System.out.println("                     ");
            System.out.print("Opção: ");
            opcao = this.scanner.nextInt();
        
            switch (opcao) {
                case 1:
                    cadastrarUsuario();
                    break;
                case 2:
                    cadastrarLivro();
                    break;
                case 3:
                    consultarUsuarios();
                    break;
                case 4:
                    consultarLivros();
                    break;
                case 5:
                    imprimirRelatorios();
                    break;
                case 6:
                    emprestarLivro();
                    break;
                case 7:
                    devolverLivro();
                    break;
                case 8:
                    listarUsuarios();
                    break;
                case 9:
                    listarLivros();
                    break;
                case 0:
                    this.scanner.close();
                    break;
                default:
                    System.out.println("                       ");
                    System.out.println("== Esta opção não é válida ==");
                    continuar();
            }
        }
    }

    public void continuar(){
        System.out.println("                    ");
        System.out.println("Pressione ENTER pra continuar");
        this.scanner.nextLine();
    }

    public void cadastrarUsuario(){
        System.out.println("                    ");
        System.out.println("CADASTRANDO USUÁRIO:");
        System.out.println("                    ");

        System.out.println("Nome completo: ");
        String nome = this.scanner.next();
        this.scanner.nextLine();
        
        System.out.println("Telefone: ");
        String telefone = this.scanner.next();
        this.scanner.nextLine();
        
        System.out.println("Email: ");
        String email = this.scanner.next();
        this.scanner.nextLine();
        
        System.out.println("Endereço: ");
        String endereco = this.scanner.next();
        this.scanner.nextLine();

        this.usuariosCadastrados.add(new Usuario(nome, telefone, email, endereco));
        continuar();
    }

    public void cadastrarLivro(){
        System.out.println("                    ");
        System.out.println("CADASTRANDO LIVRO:");
        System.out.println("                    ");

        System.out.println("Titulo: ");
        String livroTitulo = this.scanner.next();
        this.scanner.nextLine();
        
        System.out.println("Categoria: ");
        String livroCategoria = this.scanner.next();
        this.scanner.nextLine();
        
        System.out.println("Autor: ");
        String livroAutor = this.scanner.next();
        this.scanner.nextLine();
        
        System.out.println("Editora: ");
        String livroEditora = this.scanner.next();
        this.scanner.nextLine();

        System.out.println("Ano de Publicação: ");
        String livroAnoPublicacao = this.scanner.next();
        this.scanner.nextLine();

        this.livrosDisponiveis.add(new Livro(livroTitulo, livroCategoria, livroAutor, livroEditora, livroAnoPublicacao));
        continuar();
    }

    public void consultarUsuarios(){
        System.out.println("                    ");
        System.out.println("CONSULTA DE USUÁRIOS:");
        System.out.println("                    ");
        System.out.println("Informe o ID do usuário:");
        Long idUser = this.scanner.nextLong();
        this.scanner.hasNextLine();
        if (buscarObjetoPorId(usuariosCadastrados, idUser) != null) {
            Usuario usuario = buscarObjetoPorId(usuariosCadastrados, idUser);

            System.out.println("                    ");
            System.out.println("DADOS DO USUÁRIO:");
            System.out.println("                    ");
            System.out.println("ID: " + usuario.getID());
            System.out.println("NOME: " + usuario.getNome());
            System.out.println("TELEFONE: " + usuario.getTelefone());
            System.out.println("EMAIL: " + usuario.getEmail());
            System.out.println("ENDEREÇO: " + usuario.getEndereco());
        } else {
            System.out.println("Nenhum usuário cadastrado!");
        }
        continuar();
    }

    public void consultarLivros(){
        System.out.println("                    ");
        System.out.println("CONSULTA DE LIVROS:");
        System.out.println("                    ");
        System.out.println("Informe o ISBN do livro:");
        Long isbnLivro = this.scanner.nextLong();
        this.scanner.hasNextLine();
        if (buscarObjetoPorId(livrosDisponiveis, isbnLivro) != null) {
            Livro livro = buscarObjetoPorId(livrosDisponiveis, isbnLivro);


            System.out.println("                    ");
            System.out.println("DADOS DO USUÁRIO:");
            System.out.println("                    ");
            System.out.println("ISBN: " + livro.getISBN());
            System.out.println("TITULO: " + livro.getTitulo());
            System.out.println("CATEGORIA: " + livro.getCategoria());
            System.out.println("AUTOR: " + livro.getAutor());
            System.out.println("EDITORA: " + livro.getEditora());
            System.out.println("ANO DE PUBLICAÇÃO: " + livro.getAnoPublicacao());
        }
        continuar();
    }

    public void imprimirRelatorios() {
        if (!relatorios.isEmpty()) {
            for (String relatorio : this.relatorios) {
                System.out.println(relatorio);
            }
        } else {
            System.out.println("Nenhum relatório encontrado...");
        }
        continuar();
    }

    public void gerarRelatorio(Livro livro, Usuario usuario, String tipoDeRelatorio) {
        if (livro != null && usuario != null) {
            LocalDateTime data = LocalDateTime.now();
            relatorios.add("O usuário " + usuario.getNome() + " " + tipoDeRelatorio + " o livro '" + livro.getTitulo() + "' na data: " + data);
        }
    }

    public void emprestarLivro(){
        System.out.println("                    ");
        System.out.println("EMPRESTAR LIVRO:");
        System.out.println("                    ");
        System.out.println("(Apenas 1 livro por pessoa)");
        System.out.println("                    ");
        System.out.println("Informe o ID do usuário:");
        Long idUser = this.scanner.nextLong();
        this.scanner.hasNextLine();
        System.out.println("Informe o ISBN do livro:");
        Long isbnLivro = this.scanner.nextLong();
        this.scanner.hasNextLine();

        this.livrosIndisponiveis.add(buscarObjetoPorId(this.livrosDisponiveis, isbnLivro));
        this.livrosDisponiveis.remove(buscarObjetoPorId(this.livrosIndisponiveis, isbnLivro));
        gerarRelatorio(buscarObjetoPorId(livrosDisponiveis, isbnLivro), buscarObjetoPorId(usuariosCadastrados, idUser), "emprestou");
        continuar();
    }

    public void devolverLivro(){
        System.out.println("                    ");
        System.out.println("DEVOLVER LIVRO:");
        System.out.println("                    ");
        System.out.println("Informe o ID do usuário:");
        Long idUser = this.scanner.nextLong();
        this.scanner.hasNextLine();
        System.out.println("Informe o ISBN do livro:");
        Long isbnLivro = this.scanner.nextLong();
        this.scanner.hasNextLine();

        this.livrosDisponiveis.add(buscarObjetoPorId(this.livrosIndisponiveis, isbnLivro));
        this.livrosIndisponiveis.remove(buscarObjetoPorId(this.livrosDisponiveis, isbnLivro));
        gerarRelatorio(buscarObjetoPorId(livrosDisponiveis, isbnLivro), buscarObjetoPorId(usuariosCadastrados, idUser), "devolveu");
        continuar();
    }

    public void listarUsuarios() {
        if (!this.usuariosCadastrados.isEmpty()) {
            for (Usuario usuariosCadastrado : this.usuariosCadastrados) {
                System.out.println(usuariosCadastrado.getID() + " - " + usuariosCadastrado.getNome());
            }
        } else {
            System.out.println("Nenhum usuário foi cadastrado!");
        }
        continuar();
    }

    public void listarLivros() {
        if (!this.livrosDisponiveis.isEmpty()) {
            for (Livro livro : this.livrosDisponiveis) {
                System.out.println(livro.getISBN() + " - " + livro.getTitulo());
            }
        } else {
            System.out.println("Nenhum livro foi cadastrado!");
        }
        continuar();
    }

    public <T> T buscarObjetoPorId(Set<T> lista, Long id) {
        if (!lista.isEmpty()) {
            for (T objeto : lista) {
                for (Usuario usuarioCadastrado : this.usuariosCadastrados) {
                    if (usuarioCadastrado.getID().equals(id) && usuarioCadastrado.equals(objeto)) {
                        return objeto;
                    }
                }
                for (Livro livro : this.livrosDisponiveis) {
                    if (livro.getISBN().equals(id) && livro.equals(objeto)) {
                        return objeto;
                    }
                }
            }
        }

        return null;
    }
}
    
    