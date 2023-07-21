package POO.Heranca.SobreEscrita.dominio;

public class Anime extends Object{
    private String nome;


    // toString()
    @Override
    public String toString() {
        return "Anime{" +
                "nome='" + this.nome + '\'' +
                '}';
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}
