package java_poo.bimestre_1.projetos.esquenta;

public class Funcionario extends Pessoa {
    private static long aux;
    private long id;
    private Desenvolvedor cargoDesenvolvedor; // Desenvolvedor, Gerente, RH
    private Gerente cargoGerente;
    private RH cargoRh;
    private String setor;
    private double salario;

    {
        Funcionario.aux += 1;
        this.id = aux;
    }
    
    public Funcionario(String nome, int idade, String endereco, boolean status,
    double salario) {
        super(nome, idade, endereco, status);
        this.salario = salario;
    }
    public Funcionario(String nome, int idade, String endereco, boolean status, String setor,
    double salario) {
        super(nome, idade, endereco, status);
        this.setor = setor;
        this.salario = salario;
    }

    public Funcionario(String nome, int idade, String endereco, boolean status, Desenvolvedor cargoDesenvolvedor,
    double salario) {
        super(nome, idade, endereco, status);
        this.cargoDesenvolvedor = cargoDesenvolvedor;
        this.salario = salario;
    }
    public Funcionario(String nome, int idade, String endereco, boolean status, Desenvolvedor cargoDesenvolvedor, String setor,
    double salario) {
        super(nome, idade, endereco, status);
        this.cargoDesenvolvedor = cargoDesenvolvedor;
        this.setor = setor;
        this.salario = salario;
    }
  
    public Funcionario(String nome, int idade, String endereco, boolean status, Gerente cargoGerente,
    double salario) {
        super(nome, idade, endereco, status);
        this.cargoGerente = cargoGerente;
        this.salario = salario;
    }
    public Funcionario(String nome, int idade, String endereco, boolean status, Gerente cargoGerente, String setor,
    double salario) {
        super(nome, idade, endereco, status);
        this.cargoGerente = cargoGerente;
        this.setor = setor;
        this.salario = salario;
    }
  
    public Funcionario(String nome, int idade, String endereco, boolean status, RH cargoRh,
    double salario) {
        super(nome, idade, endereco, status);
        this.cargoRh = cargoRh;
        this.salario = salario;
    }
    public Funcionario(String nome, int idade, String endereco, boolean status, RH cargoRh, String setor,
    double salario) {
        super(nome, idade, endereco, status);
        this.cargoRh = cargoRh;
        this.setor = setor;
        this.salario = salario;
    }

    public long getId(){
        return id;
    }

    public Desenvolvedor getCargoDesenvolvedor() {
        return cargoDesenvolvedor;
    }

    public void setCargoDesenvolvedor(Desenvolvedor cargoDesenvolvedor) {
        this.cargoDesenvolvedor = cargoDesenvolvedor;
    }

    public Gerente getCargoGerente() {
        return cargoGerente;
    }

    public void setCargoGerente(Gerente cargoGerente) {
        this.cargoGerente = cargoGerente;
    }

    public RH getCargoRh() {
        return cargoRh;
    }

    public void setCargoRh(RH cargoRh) {
        this.cargoRh = cargoRh;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
