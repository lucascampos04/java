package POO.Polimorfismo.dominio;

public class Computador extends Produto{
    private String dataValidade;
    public static final double IMPOSTO_POR_CENTO = 0.21;
    public Computador(String name, double value) {
        super(name, value);
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    @Override
    public double calcularImposto() {
        System.out.println("Caalculando Imposto");
        return this.value * IMPOSTO_POR_CENTO;
    }


}
