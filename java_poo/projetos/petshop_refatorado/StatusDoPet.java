package java_poo.projetos.petshop_refatorado;

public class StatusDoPet extends Pet {
    private boolean statusDePresenca;
    private boolean statusDeDeficiencia;
    private boolean statusDeProntidao;
    private String tipoDeDeficiencia;
    private String observacao;

    public StatusDoPet(String nomeCompleto, String cpf, String endereco, Dono dono, int codigo, String nome, int idade, String tipoAnimal, String raca, StatusDoPet statusDoPet, boolean statusDePresenca, boolean statusDeDeficiencia, boolean statusDeProntidao, String tipoDeDeficiencia,String observacao){
        super(nomeCompleto, cpf, endereco, dono, codigo, nome, idade, tipoAnimal, raca);
        this.statusDePresenca = statusDePresenca;
        this.statusDeDeficiencia = statusDeDeficiencia;
        this.statusDeProntidao = statusDeProntidao;
        this.tipoDeDeficiencia = tipoDeDeficiencia;
        this.observacao = observacao;
    }

    public boolean obterStatusDePresenca() {
        return statusDePresenca;
    }

    public void adicionarStatusDePresenca(boolean statusDePresenca) {
        this.statusDePresenca = statusDePresenca;
    }
    
    public boolean obterStatusDeDeficiencia() {
        return statusDeDeficiencia;
    }
    
    public void adicionarStatusDeDeficiencia(boolean statusDeDeficiencia) {
        this.statusDeDeficiencia = statusDeDeficiencia;
    }
    
    public boolean obterStatusDeProntidao() {
        return statusDeProntidao;
    }
    
    public void adicionarStatusDeProntidao(boolean statusDeProntidao) {
        this.statusDeProntidao = statusDeProntidao;
    }

    public String getTipoDeDeficiencia() {
        return tipoDeDeficiencia;
    }

    public void setTipoDeDeficiencia(String tipoDeDeficiencia) {
        this.tipoDeDeficiencia = tipoDeDeficiencia;
    }

    public String obterObservacao() {
        return observacao;
    }
    
    public void adicionarObservacao(String observacao) {
        this.observacao = observacao;
    }
}
