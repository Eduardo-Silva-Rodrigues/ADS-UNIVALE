package java_poo.bibliotech;

public class Biblioteca {
    public Livro[] livros;

    Biblioteca(Livro[] livros){
        this.livros = livros;
    }

    public void setLivro(Livro[] livros){
        this.livros = livros;
    }

    public Livro[] getLivros(){
        return this.livros;
    }
}