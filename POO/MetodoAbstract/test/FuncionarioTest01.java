package POO.MetodoAbstract.test;

import POO.MetodoAbstract.dominio.Desenvolvedor;
import POO.MetodoAbstract.dominio.Funcionario;
import POO.MetodoAbstract.dominio.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Gerente lucas1 = new Gerente("Lucas1", 5000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Lucas Tech", 45000);
        System.out.println(desenvolvedor);
        System.out.println(lucas1);
    }
}
