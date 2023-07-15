package POO.AssociacaoUnidirecional.test;

import POO.Associacao.dominio.Jogador;
import POO.AssociacaoUnidirecional.dominio.Time;

public class JogadorTest01 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Neymar");
        Time time = new Time("PSG");
        jogador.setTime(time);
        jogador.nextUp();
    }
}
