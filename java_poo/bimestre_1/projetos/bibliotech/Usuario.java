package java_poo.bimestre_1.projetos.bibliotech;

import java.util.concurrent.ThreadLocalRandom;

public class Usuario {
    private Long ID;
    private String nome;
    private String telefone;
    private String email;
    private String endereco;
    // private List<Usuario> dadosUsuario = new ArrayList<Usuario>();

    Usuario(String nome, String telefone, String email, String endereco){
        this.ID = ThreadLocalRandom.current().nextLong(1, 1000);
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "ID=" + ID +
                ", nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                ", email='" + email + '\'' +
                ", endereco='" + endereco + '\'' +
                '}';
    }

    public Long getID() {
        return ID;
    }
    public String getNome() {
        return nome;
    }
    public String getTelefone() {
        return telefone;
    }
    public String getEmail() {
        return email;
    }
    public String getEndereco() {
        return endereco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    } 
}
