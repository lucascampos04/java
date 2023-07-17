package POO_exercicios.ex1.test;

import POO_exercicios.ex1.Class.Carro;

public class Car {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro carro1 = new Carro();

        carro.nome = "Corsa";
        carro.modelo = "Honda";
        carro.ano = 2011;

        carro1.nome = "Gol";
        carro1.modelo = "Volskwagem";
        carro1.ano = 2000;

        System.out.println("Nome: " + carro.nome + "\nModelo: " + carro.modelo + "\nAno: " + carro.ano);
        System.out.println("Nome: " + carro1.nome + "\nModelo: " + carro1.modelo + "\nAno: " + carro1.ano);
    }
}
