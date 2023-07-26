package POO.Polimorfismo.dominio;

public class Tv  extends Produto{
    public static final double IMPOSOTO_POR_CENTO = 0.21;
    public Tv(String name, double value) {
        super(name, value);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto da Televisão");
        return this.value * IMPOSOTO_POR_CENTO;
    }
}
