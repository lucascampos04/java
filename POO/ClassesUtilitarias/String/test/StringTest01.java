package POO.ClassesUtilitarias.String.test;

public class StringTest01 {
    public static void main(String[] args) {
        // Exemplo de manipulação de Strings e comparações

        String nome = "Lucas"; // Variável de referência aponta para o pool de strings
        String nome2 = "Lucas"; // Outra variável de referência aponta para o mesmo objeto no pool

        nome.concat("Oliveira"); // A operação de concatenação retorna uma nova string, mas não é atribuída a nenhuma variável

        System.out.println(nome); // A saída será "Lucas", porque a concatenação não alterou o valor original

        System.out.println(nome.equals(nome2)); // Compara o conteúdo das strings (true)

        System.out.println(nome == nome2); // Compara as referências das strings (true), já que apontam para o mesmo objeto no pool

        String nome3 = new String("Lucas"); // Cria uma nova instância de string na memória, fora do pool

        System.out.println(nome2 == nome3); // Compara as referências das strings (false), pois apontam para objetos diferentes

        System.out.println(nome2 == nome3.intern()); // Compara a referência de nome2 com a string interna do pool (true), após chamar o método intern()

        // Conclusão:
        // - Strings no pool de strings são reutilizadas, otimizando a memória
        // - O método equals() compara o conteúdo das strings
        // - O operador == compara as referências das strings
        // - O método intern() retorna a referência do pool de strings se a string já estiver lá
    }
}
