package java_poo.projetos.esquenta;

public class Desenvolvedor {
    private static String nome;
    private String stack;
    private String linguegem;
    private String[] tasks;

    {
        Desenvolvedor.nome = "Desenvolvedor";
    }
    public Desenvolvedor(){
        
    }
    public Desenvolvedor(String nome, String stack, String linguegem, String[] tasks) {

        this.stack = stack;
        this.linguegem = linguegem;
        this.tasks = tasks;
    }

    public static String getNome(){
        return nome;
    }

    public static void setNome(String nome){
        Desenvolvedor.nome = nome;
    }

    public String getStack() {
        return stack;
    }

    public void setStack(String stack) {
        this.stack = stack;
    }

    public String getLinguegem() {
        return linguegem;
    }

    public void setLinguegem(String linguegem) {
        this.linguegem = linguegem;
    }

    public String[] getTasks() {
        return tasks;
    }

    public void setTasks(String[] tasks) {
        this.tasks = tasks;
    }

}
