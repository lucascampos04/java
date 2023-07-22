package POO.Enumeracao.test;

import POO.Enumeracao.dominio.Cliente;
import POO.Enumeracao.dominio.TipoCliente;

public class ClineteTest01 {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Lucas", TipoCliente.PESSOA_FISICA);
        Cliente cliente1 = new Cliente("Lucas", TipoCliente.PESSOA_FISICA);
        Cliente cliente2 = new Cliente("Lucas", TipoCliente.PESSOA_JURIDICA);
        Cliente cliente3 = new Cliente("Lucas", TipoCliente.PESSOA_JURIDICA);

        System.out.println(cliente);
        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(cliente3);

    }
}
