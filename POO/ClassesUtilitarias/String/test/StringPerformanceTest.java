package POO.ClassesUtilitarias.String.test;

public class StringPerformanceTest {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        concatStringBuilder(100_000);
        long fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para StringBuilder: " + (fim - inicio) + "ms");

        inicio = System.currentTimeMillis();
        concatStringBuffer(100_000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para StringBuffer: " + (fim - inicio) + "ms");

        inicio = System.currentTimeMillis();
        concatString(100_000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para String: " + (fim - inicio) + "ms");

        // Nota: O desempenho varia dependendo da situação e do tamanho dos dados.
        // - Use StringBuilder quando houver uma única thread e necessidade de construir/modificar strings.
        // - Use StringBuffer quando múltiplas threads precisarem construir/modificar strings (threadsafety).
        // - Evite usar concatenação de String (+) dentro de loops, pois cria novos objetos a cada concatenação.
        // - Se a concatenação for feita poucas vezes ou com poucos dados, a diferença de desempenho não será significativa.
    }

    private static void concatStringBuffer(int tamanho) {
        StringBuffer sb = new StringBuffer(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sb.append(i);
        }
    }

    private static void concatStringBuilder(int tamanho) {
        StringBuilder sb = new StringBuilder(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sb.append(i);
        }
    }

    private static void concatString(int tamanho) {
        String texto = "";
        for (int i = 0; i < tamanho; i++) {
            texto += i;
        }
    }
}
