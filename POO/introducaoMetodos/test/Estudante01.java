package POO.introducaoMetodos.test;

import POO.introducaoClasses.dominio.Estudante;
import POO.introducaoMetodos.dominio.Studente;

public class Estudante01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        Studente studente = new Studente();

        studente.imprime();

        estudante01.nome = "Lucas";
        estudante01.idade = 19;
        estudante01.sexo = "M";

        estudante02.nome = "Luna";
        estudante02.idade = 20;
        estudante02.sexo = "F";

    }
}
