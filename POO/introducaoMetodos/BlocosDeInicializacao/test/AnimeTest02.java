package POO.introducaoMetodos.BlocosDeInicializacao.test;

import POO.introducaoMetodos.BlocosDeInicializacao.dominio.Anime;

public class AnimeTest02 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        for (int ep : anime.getEps()) {
            System.out.print(ep + " ");
        }

    }
}
