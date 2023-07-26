package POO.Polimorfismo.test;

import POO.Polimorfismo.dominio.Computador;
import POO.Polimorfismo.dominio.Tomate;
import POO.Polimorfismo.dominio.Tv;
import POO.Polimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("Nitro 5", 5000);
        Tomate tomate = new Tomate("Tomate", 10);
        Tv tv = new Tv("Samsung\" ", 10000);
        CalculadoraImposto.calcucarImposto(computador);
        System.out.println("--------------------------");
        CalculadoraImposto.calcucarImposto(tomate);
        System.out.println("-------------------------");
        CalculadoraImposto.calcucarImposto(tv);

    }
}
