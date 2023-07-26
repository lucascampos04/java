package POO.Polimorfismo.servico;

import POO.Polimorfismo.dominio.Computador;
import POO.Polimorfismo.dominio.Tomate;

public class CalculadoraImposto {
    public static void calcularImpostoComputador(Computador computador) {
        System.out.println("Relatorio de Imposto do computador : ");
        double imposto = computador.calcularImposto();
        System.out.println("Imposto do computador : " + computador.getName());
        System.out.println("Valor : " + computador.getValue());
        System.out.println("imposto a ser pago : " + imposto);
    }

    public static void calcularImpostoTomate(Tomate tomate) {
        System.out.println("Relatorio de Imposto do tomate : ");
        double imposto = tomate.calcularImposto();
        System.out.println("Imposto do computador : " + tomate.getName());
        System.out.println("Valor : " + tomate.getValue());
        System.out.println("imposto a ser pago : " + imposto);
    }
}