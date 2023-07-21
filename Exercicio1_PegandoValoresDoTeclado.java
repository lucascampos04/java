import java.util.Scanner;

public class Exercicio1_PegandoValoresDoTeclado {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int acertos = 0;
        int erros = 0;

        System.out.println("Seja Bem vindo ao Quiz da Copa do Mundo!!");
        System.out.println("Tentativas: 3");

        System.out.println("[1] - Começar");
        int start = input.nextInt();
        input.nextLine();

        if (start == 1) {
            while (acertos < 3 && erros < 3) {
                System.out.println("Qual foi o país campeão da Copa do Mundo de 1998?");
                String resposta = input.nextLine();

                if (resposta.equals("Brasil")) {
                    System.out.println("Acertou!!");
                    acertos++;
                } else {
                    System.out.println("Errou!!");
                    erros++;
                }

                System.out.println("Qual foi o país campeão da Copa do Mundo de 2022?");
                String resposta2 = input.nextLine();

                if (resposta2.equals("Argentina")) {
                    System.out.println("Acertou!!");
                    acertos++;
                } else {
                    System.out.println("Errou!!");
                    erros++;
                }

                System.out.println("Artilheiro da Copa do Mundo de 2022?");
                String resposta3 = input.nextLine();

                if (resposta3.equals("Mbappe")) {
                    System.out.println("Acertou!!");
                    acertos++;
                } else {
                    System.out.println("Errou!!");
                    erros++;
                }

                if (acertos > erros) {
                    System.out.println("Parabéns, você ganhou!");
                    System.out.println("Seus acertos: " + acertos);
                } else {
                    System.out.println("Você perdeu! Tente novamente.");
                    System.out.println("Seus acertos: " + acertos + " Seus erros: " + erros);
                    acertos = 0;
                    erros = 0;
                }
            }
        }
    }
}
