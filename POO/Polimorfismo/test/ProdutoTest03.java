package POO.Polimorfismo.test;

import POO.Polimorfismo.dominio.Computador;
import POO.Polimorfismo.dominio.Produto;
import POO.Polimorfismo.dominio.Tomate;
import POO.Polimorfismo.servico.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Computador computador = new Computador("Positivo", 0);
        Tomate tomate = new Tomate("Vermelho", 10);

        tomate.setDataValidade("29/06/2004");
        CalculadoraImposto.calcucarImposto(tomate);

        System.out.println("------------------------");

        computador.setDataValidade("12/02/2012");
        CalculadoraImposto.calcucarImposto(computador);
    }
}
