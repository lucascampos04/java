package Reviewing.System_School;

public class EscolaTest {
    public static void main(String[] args) {
        Escola escola = new Escola();

        // Criando alunos e professores
        Aluno aluno1 = new Aluno("João", 15);
        Aluno aluno2 = new Aluno("Maria", 16);

        Professor professor1 = new Professor("Carlos", "Matemática");
        Professor professor2 = new Professor("Ana", "História");

        // Adicionando alunos e professores à escola
        escola.adicionarAluno(aluno1);
        escola.adicionarAluno(aluno2);

        escola.adicionarProfessor(professor1);
        escola.adicionarProfessor(professor2);

        // Listando alunos e professores na escola
        escola.listarAlunos();
        escola.listarProfessores();
    }
}
