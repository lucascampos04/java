package POO.ModificadorFinal.dominio;

import POO.introducaoMetodos.ModificadorStatic.dominio.Carro;

public class Gol extends Carro {

    @Override
    public void imprime() {
        super.imprime();
    }

    public Gol(String nome, double velocidadeMaxima) {
        super(nome, velocidadeMaxima);
    }
}
