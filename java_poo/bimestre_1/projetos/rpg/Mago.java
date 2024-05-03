package java_poo.bimestre_1.projetos.rpg;

public class Mago extends Personagem {
    private int danoMagia = 20;
    private int mana = 200;

    //Métodos set
    public void setDanoMagia(int danoMagia){
        this.danoMagia = danoMagia;
    }
    public void setMana(int mana){
        this.mana = this.mana - mana;
    }
    //Métodos get
    public int getDanoMagia(){
        return this.danoMagia;
    }
    public int getMana(){
        return this.mana;
    }
}
