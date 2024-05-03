package java_poo.bimestre_1.projetos.rede_social;

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

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Integer getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(Integer curtidas) {
        this.curtidas = curtidas;
    }

    
}
