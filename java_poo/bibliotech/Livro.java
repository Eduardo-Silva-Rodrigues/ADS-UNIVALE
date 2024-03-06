package java_poo.bibliotech;

public class Livro {
    public Integer ISBN;
    public String titulo;
    public String categoria;
    public String autor;
    public String editora;
    public Integer anoPublicacao;

    Livro(Integer ISBN, String titulo, String categoria, String autor, String editora, Integer anoPublicacao){
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.categoria = categoria;
        this.autor = autor;
        this.editora = editora;
        this.anoPublicacao = anoPublicacao;
    }

    public void setISBN(Integer ISBN){
        this.ISBN = ISBN;
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
    public void setAnoPublicacao(Integer anoPublicacao){
        this.anoPublicacao = anoPublicacao;
    }
    
    public Integer getISBN(){
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
    public Integer getAnoPublicacao(){
        return this.anoPublicacao;
    }
}
