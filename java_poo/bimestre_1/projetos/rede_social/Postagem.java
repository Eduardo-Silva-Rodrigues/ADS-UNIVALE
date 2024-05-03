package java_poo.bimestre_1.projetos.rede_social;

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

    public Usuario getNome() {
        return nome;
    }

    public void setNome(Usuario nome) {
        this.nome = nome;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public ArrayList<Comentario> getComentarios() {
        return comentarios;
    }

    public void setComentarios(ArrayList<Comentario> comentarios) {
        this.comentarios = comentarios;
    }

    public Integer getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(Integer curtidas) {
        this.curtidas = curtidas;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    
}