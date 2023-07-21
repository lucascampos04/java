package POO.Associacao.test;

import java.util.Scanner;

public class LeituraDoTeclado {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = input.nextLine();

        System.out.println("Digite sua idade: ");
        int idade = input.nextInt();

        System.out.println("Digite seu sexo: ");
        char sexo = input.next().charAt(0);

        System.out.println("_-----------------------------_");
        System.out.printf("Seu nome: %s\nSua idade: %d\nSeu sexo: %s ", nome, idade, sexo);
    }
}
