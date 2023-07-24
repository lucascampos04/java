package POO.Enumeracao.dominio;

// Enumeração - Tudo é constante
public enum TipoCliente {
    PESSOA_FISICA(1),
    PESSOA_JURIDICA(2);
    public final int VALOR;
    private String nomeRelatorio;
    TipoCliente(int valor) {
        this.VALOR = valor;
        this.nomeRelatorio = nomeRelatorio;
    }

    public int getValor() {
        return VALOR;
    }

    public String getNomeRelatorio() {
        return nomeRelatorio;
    }

    public void setNomeRelatorio(String nomeRelatorio) {
        this.nomeRelatorio = nomeRelatorio;
    }
}
