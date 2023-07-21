package POO.ModificadorFinal.test;

import POO.ModificadorFinal.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro.VELOCIDADE_LIMITE = 20;
    }
}
