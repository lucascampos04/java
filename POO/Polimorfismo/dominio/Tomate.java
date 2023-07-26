package POO.Polimorfismo.dominio;

public class Tomate extends Produto{
    private String dataValidade;
    public static final double IMPOSOTO_POR_CENTO = 0.21;
    public Tomate(String name, double value) {
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
        System.out.println("Calculando Imposto");
        return this.value * IMPOSOTO_POR_CENTO;
    }


}
