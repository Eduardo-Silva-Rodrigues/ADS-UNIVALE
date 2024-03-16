package java_poo.aulas.heranca_polimorfismo.aula_24_02;

public class Main {
    public static void main(String[] args){
        Animal animalGenerico = new Animal("Urso", 4);
        Mamifero mamifero = new Mamifero("Tigre", 5, "Liso");
        mamifero.emitirSom();
        System.out.println(animalGenerico.getNome());
    }
}