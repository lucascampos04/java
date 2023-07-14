package POO_exercicios.ex2.test;

import POO_exercicios.ex2.Class.Funcionarios;

public class Funcionarios01 {
    public static void main(String[] args) {
        Funcionarios funcionarios = new Funcionarios();
        funcionarios.setNome("Lucas");
        funcionarios.setIdade(12);
        funcionarios.setSalario(new Double[]{120.0, 300.0, 400.50});
        funcionarios.imprime();
        System.out.println("\nMédia " + funcionarios.getMedia());
    }
}


