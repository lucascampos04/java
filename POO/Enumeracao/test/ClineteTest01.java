package POO.Enumeracao.test;

import POO.Enumeracao.dominio.Cliente;
import POO.Enumeracao.dominio.TipoCliente;

public class ClineteTest01 {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Lucas", TipoCliente.PESSOA_FISICA, Cliente.TipoPagamento.DEBITO);
        Cliente cliente1 = new Cliente("Lucas", TipoCliente.PESSOA_JURIDICA, Cliente.TipoPagamento.CREDITO);

        System.out.println(cliente);
        System.out.println(cliente1);
    }
}
