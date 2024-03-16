package java_poo.projetos.rede_social;

import java.util.ArrayList;

public class Postagem {
    private Usuario nome;
    private String texto;
    private ArrayList<Comentario> comentarios;
    private Integer curtidas;
    private String data;

    public Postagem(Usuario nome, String texto, ArrayList<Comentario> comentarios, Integer curtidas, String data){
        this.nome = nome;
        this.texto = texto;
        this.comentarios = comentarios;
        this.curtidas = curtidas;
        this.data = data;
    }
}