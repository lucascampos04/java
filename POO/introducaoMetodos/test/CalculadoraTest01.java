package POO.introducaoMetodos.test;

import POO.introducaoMetodos.dominio.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        System.out.println("Soma");
        calculadora.somaDoisNumeros();

        System.out.println("Subtraindo");
        calculadora.subtraiDoisNumeros();

        System.out.println("Multiplicando");
        calculadora.mutiplicaDoisNumeros();

        System.out.println("Dividindo");
        calculadora.dividiDoisNumeros();

    }
}
