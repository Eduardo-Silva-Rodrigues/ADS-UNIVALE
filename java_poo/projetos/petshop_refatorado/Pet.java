package java_poo.projetos.petshop_refatorado;

public class Pet extends Dono {
    private Dono dono;
    private int codigo;
    private String nome;
    private int idade;
    private String tipoAnimal;
    private String raca;
    private StatusDoPet statusDoPet;

    public Pet(String nomeCompleto, String cpf, String endereco, Dono dono, int codigo, String nome, int idade, String tipoAnimal, String raca){
        super(nomeCompleto, cpf, endereco);
        this.dono = dono;
        this.codigo = codigo;
        this.nome = nome;
        this.idade = idade;
        this.tipoAnimal = tipoAnimal;
        this.raca = raca;
    }

    public Dono obterDonoDoPet() {
        return dono;
    }

    public void adicionarDonoDoPet(Dono dono) {
        this.dono = dono;
    }

    public int obterCodigoDoPet() {
        return codigo;
    }

    public void adicionarCodigoDoPet(int codigo) {
        this.codigo = codigo;
    }

    public String obterNomeDoPet() {
        return nome;
    }

    public void adicionarNomeDoPet(String nome) {
        this.nome = nome;
    }

    public int obterIdadeDoPet() {
        return idade;
    }

    public void adicionarIdadeDoPet(int idade) {
        this.idade = idade;
    }

    public String obterTipoAnimalDoPet() {
        return tipoAnimal;
    }

    public void adicionarTipoAnimalDoPet(String tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }

    public String obterRacaDoPet() {
        return raca;
    }

    public void adicionarRacaDoPet(String raca) {
        this.raca = raca;
    }

    public StatusDoPet getStatusDoPet() {
        return statusDoPet;
    }

    public void setStatusDoPet(StatusDoPet statusDoPet) {
        this.statusDoPet = statusDoPet;
    }

    @Override
    public boolean compararIdentificadores(Dono dono){
        for (Pet pet : dono.obterPetsDoDono()){
            if (this.obterCodigoDoPet() == pet.obterCodigoDoPet()) { return true; }
        }
        
        return false;
    }
}
