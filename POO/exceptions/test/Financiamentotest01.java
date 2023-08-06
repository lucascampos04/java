package POO.exceptions.test;

import POO.exceptions.dominio.Financiamento;

public class Financiamentotest01 {
    public static void main(String[] args) {
        double valorTotal = 1000.00;
        double entrada = 500.0;
        int parcelas = 10;

        try {
            Financiamento f = new Financiamento(valorTotal, entrada, parcelas);
            System.out.println(f.prestacao());
        } catch (RuntimeException e){
            System.out.println(e.getMessage());
        }

    }
}
