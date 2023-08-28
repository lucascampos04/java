package POO.ClassesUtilitarias.String.test;

import java.util.Arrays;

public class StringTest02 {
    public static void main(String[] args) {
        String nome = "Luffy";
        String numeros = "012345";

        int[] nums = {1, 2, 3};

        System.out.println(nome.charAt(0)); // Obtém o primeiro caractere de 'nome'
        System.out.println(nome.length()); // Retorna o comprimento da string 'nome'
        System.out.println(nome.replace("f", "L")); // Substitui "f" por "L" na string 'nome'
        System.out.println(nome.toLowerCase()); // Converte 'nome' para minúsculas
        System.out.println(nome.toUpperCase()); // Converte 'nome' para maiúsculas
        System.out.println(numeros.length()); // Retorna o comprimento da string 'numeros'
        System.out.println(numeros.substring(2, numeros.length())); // Pega uma subtring de 'numeros', a partir do índice 2
        System.out.println(numeros.substring(2, 4)); // Pega uma subtring de 'numeros', do índice 2 ao 3
        System.out.println(nome.trim()); // Remove espaços em branco do início e do fim de 'nome'
    }
}
