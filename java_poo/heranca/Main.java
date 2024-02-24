package java_poo.heranca;

public class Main {
    public static void main(String[] args){
        Animal animalGenerico = new Animal("Urso", 4);
        Mamifero mamifero = new Mamifero("Tigre", 5, "Liso");
        mamifero.emitirSom();
        System.out.println(animalGenerico.getNome());
    }
}