package POO.ModificadorFinal.dominio;

public class Carro {
    private String carro;

    public final Comprador COMPRADOR = new Comprador();
    public static double VELOCIDADE_LIMITE = 250; // constantes em java são definidas em UPPERCASE

    public String getCarro() {
        return carro;
    }

    public void setCarro(String carro) {
        this.carro = carro;
    }
}
