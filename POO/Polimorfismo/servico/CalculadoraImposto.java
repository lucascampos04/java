package POO.Polimorfismo.servico;

import POO.Polimorfismo.dominio.Computador;
import POO.Polimorfismo.dominio.Produto;
import POO.Polimorfismo.dominio.Tomate;

public class CalculadoraImposto{
    public static void calcucarImposto(Produto produto){
        System.out.println("Relatorio de Imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: " +produto.getName());
        System.out.println("Produto: " +produto.getValue());
        System.out.println("Imposto a ser pago: " + imposto);
        if (produto instanceof  Computador){
            String dataValidade = ((Computador) produto).getDataValidade();
            System.out.println(dataValidade);
        }
        if (produto instanceof Tomate) {
            // Pode ser feito assim :
            String dataValidade = ((Tomate) produto).getDataValidade();
            System.out.println(dataValidade);

            // POde ser feito assim :
            /*
            Tomate tomate = (Tomate) produto;
            System.out.println(tomate.getDataValidade());
            */
        }
    }
}