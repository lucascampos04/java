package POO.introducaoMetodos.test;

import POO.introducaoMetodos.dominio.Calculadora;

public class CalculadoraTest02 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int resul = (int) calculadora.dividiDoisNumeros(20,2);
        System.out.println(resul);
        calculadora.impriDivisaoDoisNumeros(10, 0);
    }
}
