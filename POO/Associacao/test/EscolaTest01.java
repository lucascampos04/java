package POO.Associacao.test;

import POO.Associacao.dominio.Escola;
import POO.Associacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor("Debora");
        Professor professor1 = new Professor("Mari lurdez");
        Professor[] professors = {professor, professor1};
        Escola escola = new Escola("Isabel Lucci De Oliveira", professors);
        escola.mnextUp();
    }
}
