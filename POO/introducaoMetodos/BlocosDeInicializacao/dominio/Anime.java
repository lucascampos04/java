package POO.introducaoMetodos.BlocosDeInicializacao.dominio;

public class Anime {
    private String nome;
    private int[] eps;

    /*
    Bloco de inicialização de instancia
    Ele é executado antes do codigo
    */

    {
        System.out.println("Dentro do bloco de inicialização");

        System.out.println("");

        eps = new int[100];
        for (int i = 0; i < eps.length ; i++) {
            eps[i] = i+1;
        }
    }

    public Anime() {
        System.out.println("Episodios");


        for (int episodios : this.eps){
            System.out.println(episodios + " ");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int[] getEps() {
        return eps;
    }

    public void setEps(int[] eps) {
        this.eps = eps;
    }
}
