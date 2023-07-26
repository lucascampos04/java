package POO.Polimorfismo.servico;

import POO.Polimorfismo.dominio.Computador;
import POO.Polimorfismo.dominio.Produto;
import POO.Polimorfismo.dominio.Tomate;

public class CalculadoraImposto {
    public static void calcucarImposto(Produto produto){
        System.out.println("Relatorio de Imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: " +produto.getName());
        System.out.println("Produto: " +produto.getValue());
        System.out.println("Imposto a ser pago: " + imposto);

    }
}