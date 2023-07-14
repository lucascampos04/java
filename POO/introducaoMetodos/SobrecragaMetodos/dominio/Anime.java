package POO.introducaoMetodos.SobrecragaMetodos.dominio;

public class Anime {
    private String tipo;
    private String nome;
    private int episodios;

    private String genero;

    public void imprmir(){
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Quantidade de episodios do anime: " + this.episodios);
        System.out.println("Nome do anime: " + this.nome);
        System.out.println("Genero do anime: " + this.genero);
    }
    public void init(String nome, String tipo, int episodios){
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
    }

    // Sobrecarga de metodos
    public void init(String nome, String tipo, int episodios, String genero){
        this.init(nome, tipo, episodios);
        this.genero = genero;
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
}
