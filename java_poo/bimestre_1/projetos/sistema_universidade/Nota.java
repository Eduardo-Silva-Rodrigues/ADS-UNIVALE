package java_poo.bimestre_1.projetos.sistema_universidade;

public class Nota {
    private String nomeDisciplina;
    private Double nota;

    public Nota(String nomeDisciplina, Double nota){
        this.nomeDisciplina = nomeDisciplina;
        this.nota = nota;
    }

    public void adicionarNomeDisciplina(String nomeDisciplina){
        this.nomeDisciplina = nomeDisciplina;
    }

    public String exibirNomeDisciplina(){
        return this.nomeDisciplina;
    }

    public void adicionarNota(Double nota){
        this.nota = nota;
    }

    public Double exibirNota(){
        return this.nota;
    }
}
