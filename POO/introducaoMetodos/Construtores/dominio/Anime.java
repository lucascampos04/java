package POO.introducaoMetodos.Construtores.dominio;

import POO.introducaoMetodos.Construtores.test.AnimeTest02;

public class Anime {
    public static void main(String[] args) {
        AnimeTest02 anime = new AnimeTest02("Naruto", "Anime", 200, "Ação");
        AnimeTest02 ani = new AnimeTest02();
        anime.imprmir();
    }
}
