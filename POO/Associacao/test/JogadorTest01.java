package POO.Associacao.test;

import POO.Associacao.dominio.Jogador;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Neymar");
        Jogador jogador1 = new Jogador("Pelé");
        Jogador jogador2 = new Jogador("Romario");
        Jogador[] jogadores = new Jogador[]{jogador,jogador1,jogador2};

        for (Jogador jogadore : jogadores) {
            jogadore.nextUp();
        }


    }
}
