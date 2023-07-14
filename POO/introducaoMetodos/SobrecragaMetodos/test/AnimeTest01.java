package POO.introducaoMetodos.SobrecragaMetodos.test;

import POO.introducaoMetodos.SobrecragaMetodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Naruto", "Anime", 12, "Ação");
        anime.imprmir();
    }
}
