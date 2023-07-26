package POO.Polimorfismo.test;

import POO.Polimorfismo.dominio.Computador;
import POO.Polimorfismo.dominio.Produto;
import POO.Polimorfismo.servico.CalculadoraImposto;

public class ProdutoTest02 {
    public static void main(String[] args) {
        Produto produto = new Computador("MacBook", 15000);
        CalculadoraImposto.calcularImpostoComputador((Computador) produto);
        System.out.println("Valor total ");

    }
}
