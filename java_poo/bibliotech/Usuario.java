package java_poo.bibliotech;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    public String ID;
    public String nome;
    public String telefone;
    public String email;
    public String endereco;
    public List<Usuario> dadosUsuario = new ArrayList<Usuario>();

    Usuario(String ID, String nome, String telefone, String email, String endereco){
        this.ID = ID;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.endereco = endereco;
    }

    public String getID() {
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

    public void setID(String iD) {
        ID = iD;
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
