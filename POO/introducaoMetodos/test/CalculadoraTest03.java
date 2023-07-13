package POO.introducaoMetodos.test;

import POO.introducaoMetodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        int numeros[] = {1,2,3,4,5,6};
        calculadora.somaArray(numeros);
        calculadora.somaVarargs(2,2,2,2,2);
    }
}
