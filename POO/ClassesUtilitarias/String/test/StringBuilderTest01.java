package POO.ClassesUtilitarias.String.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {

        String nome = "Lucas Oliviera";  // Cria uma String "Lucas Oliveira" e atribui à variável 'nome'
        nome.concat("Lucas");  // Concatenação não é aplicada ao 'nome' original, resultado é descartado
        nome.substring(0, 3);  // Substring não é atribuído a nenhuma variável, resultado é descartado
        System.out.println(nome);  // Imprime o valor original de 'nome'

        StringBuilder sb = new StringBuilder("lucas oliviera ");  // Cria um StringBuilder com conteúdo "lucas oliviera "
        sb.append("Lucas").append(" Oliviera");  // Acrescenta "Lucas" e "Oliviera" ao StringBuilder
        sb.reverse();  // Inverte o conteúdo do StringBuilder
        sb.reverse();  // Reverte novamente, restaurando o conteúdo original
        sb.delete(0, 5);  // Remove caracteres da posição 0 a 4
        System.out.println(sb);  // Imprime o conteúdo final do StringBuilder
    }
}
