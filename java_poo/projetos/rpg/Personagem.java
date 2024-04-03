package java_poo.projetos.rpg;

abstract class Personagem {
    //Atributos base de personagem
    private int vida = 100;
    private int dano = 15;
    private int estamina = 200;
    
    //Método para atacar outro personagem
    public void atacar(Monstro monstro){
        int vidaInimigo = monstro.getVida();
        int vidaPerdida = (vidaInimigo - this.dano);
        monstro.setVida(vidaPerdida);
    }
}
