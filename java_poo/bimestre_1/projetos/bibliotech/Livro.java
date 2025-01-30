package java_poo.bimestre_1.projetos.bibliotech;

import java.util.concurrent.ThreadLocalRandom;

public class Livro {
    private Long ISBN;
    private String titulo;
    private String categoria;
    private String autor;
    private String editora;
    private String anoPublicacao;

    Livro(String titulo, String categoria, String autor, String editora, String anoPublicacao){
        this.ISBN = ThreadLocalRandom.current().nextLong(1, 1000);
        this.titulo = titulo;
        this.categoria = categoria;
        this.autor = autor;
        this.editora = editora;
        this.anoPublicacao = anoPublicacao;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "ISBN=" + ISBN +
                ", titulo='" + titulo + '\'' +
                ", categoria='" + categoria + '\'' +
                ", autor='" + autor + '\'' +
                ", editora='" + editora + '\'' +
                ", anoPublicacao='" + anoPublicacao + '\'' +
                '}';
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public void setCategoria(String categoria){
        this.categoria = categoria;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
    public void setEditora(String editora){
        this.editora = editora;
    }
    public void setAnoPublicacao(String anoPublicacao){
        this.anoPublicacao = anoPublicacao;
    }
    
    public Long getISBN(){
        return this.ISBN;
    }
    public String getTitulo(){
        return this.titulo;
    }
    public String getCategoria(){
        return this.categoria;
    }
    public String getAutor(){
        return this.autor;
    }
    public String getEditora(){
        return this.editora;
    }
    public String getAnoPublicacao(){
        return this.anoPublicacao;
    }
}
