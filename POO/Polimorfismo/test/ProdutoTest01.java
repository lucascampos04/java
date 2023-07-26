package POO.Polimorfismo.test;

import POO.Polimorfismo.dominio.Computador;
import POO.Polimorfismo.dominio.Tomate;
import POO.Polimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("Nitro 5", 5000);
        Tomate tomate = new Tomate("Tomate", 10);
        CalculadoraImposto.calcularImpostoComputador(computador);
        System.out.println("------------------------------");
        CalculadoraImposto.calcularImpostoTomate(tomate);

    }
}
