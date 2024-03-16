package java_poo.projetos.rede_social;

public class Comentario {
    private Usuario usuario;
    private String data;
    private String texto;
    private Integer curtidas;

    public Comentario(Usuario usuario, String data, String texto, Integer curtidas){
        this.usuario = usuario;
        this.data = data;
        this.texto = texto;
        this.curtidas = curtidas;
    }
}
