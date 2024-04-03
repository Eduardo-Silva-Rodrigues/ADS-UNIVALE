package java_poo.projetos.rpg;

abstract class Monstro {
    private int vida = 120;
    private int dano = 20;
    private int estamina = 200;

    public int getVida(){
        return this.vida;
    }
    
    public void setVida(int vida){
        this.vida = vida;
    }
}
