package java_poo.bimestre_1.projetos.bibliotech;

import java.util.Comparator;

public class LivroPorNome {

    public static int compare(Livro o1, Livro o2) {
        return o1.getTitulo().compareTo(o2.getTitulo());
    }
}
