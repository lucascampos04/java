package POO.introducaoMetodos.BlocoDeInicializacaoStatic.dominio;

public class Anime {

    private String nome;
    private String tipo;
    private String genero;
    private static int[] episodios;

    // Blocos estáticos
    static {
        System.out.println("Bloco estático 1");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;
        }
    }

    static {
        System.out.println("Bloco estático 2");
        episodios = new int[100];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;
        }
    }

    // Blocos não estáticos
    {
        System.out.println("Bloco de inicialização não estático 1");
    }

    {
        System.out.println("Bloco de inicialização não estático 2");
    }

    {
        System.out.println("Bloco de inicialização não estático 3");
    }

    public Anime(String nome){
        this.nome = nome;
    }

    public Anime() {
        for (int episodio : this.episodios) {
            System.out.print(episodio + " ");
        }
        System.out.println();
    }

    public String getNome(){
        return nome;
    }

    public int[] getEpisodios(){
        return episodios;
    }

}
