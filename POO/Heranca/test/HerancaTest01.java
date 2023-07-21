package POO.Heranca.test;

import POO.Heranca.dominio.Endereco;
import POO.Heranca.dominio.Funcionario;
import POO.Heranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 1");
        endereco.setCep("12345-6789");
        Pessoa pessoa = new Pessoa("Lucas");
        pessoa.setCpf("1111111");
        pessoa.setEndereco(endereco);
        pessoa.nextUp();
        System.out.println("------------------------");
        Funcionario funcionario = new Funcionario("Lucas");
        funcionario.setSalario(2000.00);
        funcionario.setCpf("2323123241");
        funcionario.setEndereco(endereco);

        funcionario.nextUp();
    }
}
