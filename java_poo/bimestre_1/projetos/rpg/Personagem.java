package java_poo.bimestre_1.projetos.rpg;

abstract class Personagem {
    //Atributos base de personagem
    private int vida = 100;
    private int dano = 15;
    private int estamina = 200;
    
    //Métodos set
    public void setVida(int vida){
        this.vida = vida;
    }
    public void setDano(int dano){
        this.dano = dano;
    }
    public void setEstamina(int estamina){
        this.estamina = estamina;
    }
    //Métodos get
    public int getVida(){
        return this.vida;
    }
    public int getDano(){
        return this.dano;
    }
    public int getEstamina(){
        return this.estamina;
    }
    
}
