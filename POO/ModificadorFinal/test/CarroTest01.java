package POO.ModificadorFinal.test;

import POO.ModificadorFinal.dominio.Carro;
import POO.ModificadorFinal.dominio.Comprador;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        System.out.println(Carro.VELOCIDADE_LIMITE = 250);
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("Corsa");
        System.out.println(carro.COMPRADOR);
    }
}
