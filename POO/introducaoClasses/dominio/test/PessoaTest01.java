package POO.introducaoClasses.dominio.test;

import POO.introducaoClasses.dominio.Estudante;
public class PessoaTest01 {
    public static void main(String[] args) {
       Estudante pessoa = new Estudante();

       pessoa.nome = "Lucas";
       pessoa.idade = 19;
       pessoa.sexo = "M";

       System.out.println(pessoa.nome);
       System.out.println(pessoa.idade);
       System.out.println(pessoa.sexo);


    }
}
