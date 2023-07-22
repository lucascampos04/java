package POO.ModificadorFinal.test;

import POO.ModificadorFinal.dominio.Carro;
import POO.ModificadorFinal.dominio.Comprador;
import POO.ModificadorFinal.dominio.Gol;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        System.out.println(Carro.VELOCIDADE_LIMITE = 250);
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("Corsa");
        System.out.println(carro.COMPRADOR);

        Gol gol = new Gol("Golzinho", 200);
        gol.imprime();
    }
}
