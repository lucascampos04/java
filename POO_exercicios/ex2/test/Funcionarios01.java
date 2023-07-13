package POO_exercicios.ex2.test;

import POO_exercicios.ex2.Class.Funcionarios;

public class Funcionarios01 {

    public static void main(String[] args) {
        Funcionarios funcionarios = new Funcionarios();
        funcionarios.nome = "Lucas";
        funcionarios.idade = 19;
        funcionarios.salario = new Double[]{120.0, 300.0, 400.50};

        funcionarios.imprime();
        funcionarios.imprimeMedia();
    }
}


