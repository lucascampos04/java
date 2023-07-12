package POO.introducaoClasses.dominio.test;

import POO.introducaoClasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();

        professor.nome = "Lucas";
        professor.idade = 19;
        professor.sexo = 'M';

        System.out.println("Nome: "+professor.nome+" idade: "+professor.idade+" Sexo: "+professor.sexo);
    }
}
