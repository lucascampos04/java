package POO.introducaoMetodos.ModificadorStatic.test;

import POO.introducaoMetodos.ModificadorStatic.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro("BMW", 250);
        Carro carro2 = new Carro("Corsa", 300);
        Carro carro3 = new Carro("Uno", 400);

        carro1.setVelocidadeMaxima(123);

        carro1.imprime();
        carro2.imprime();
        carro3.imprime();
    }
}
