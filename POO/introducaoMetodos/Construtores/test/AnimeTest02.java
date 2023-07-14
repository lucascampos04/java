package POO.introducaoMetodos.Construtores.test;

import POO.introducaoMetodos.Construtores.dominio.Anime;

public class AnimeTest02 {
    private String tipo;
    private String nome;
    private int episodios;
    private String genero;
    private String estudio;

    public void imprmir(){
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Quantidade de episodios do anime: " + this.episodios);
        System.out.println("Nome do anime: " + this.nome);
        System.out.println("Genero do anime: " + this.genero);
        System.out.println("Estudio: " + this.estudio);
    }

    // Construtor
    public AnimeTest02(String nome, String tipo, int episodios, String genero){
        this();
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
        this.genero = genero;
    }

    // Sobrecarga de construtores
    public AnimeTest02(String nome, String tipo, int episodios, String genero, String estudio){
        this(nome, tipo, episodios, genero);
        this.estudio = estudio;
    }
    public AnimeTest02(){
        System.out.println("teste");
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return this.nome;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public String getTipo() {
        return this.tipo;
    }
    public void setEpisodios(int episodios){
        this.episodios = episodios;
    }
    public int getEpisodios() {
        return this.episodios;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public String getEstudio() {
        return estudio;
    }

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }
}
