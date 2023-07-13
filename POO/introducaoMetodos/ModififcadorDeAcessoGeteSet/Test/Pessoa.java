package POO.introducaoMetodos.ModififcadorDeAcessoGeteSet.Test;

import POO.introducaoMetodos.ModififcadorDeAcessoGeteSet.Dominio.Pessoa01;

public class Pessoa {
    public static void main(String[] args) {
        Pessoa01 pessoa = new Pessoa01();

        pessoa.setIdade(20);
        pessoa.setNome("Lucas");
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
    }
}
