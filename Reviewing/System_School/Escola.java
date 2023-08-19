package Reviewing.System_School;

import java.util.ArrayList;
import java.util.List;

public class Escola {
    private List<Aluno> alunos;
    private List<Professor> professores;

    // Construtor para inicializar listas de alunos e professores
    public Escola() {
        alunos = new ArrayList<>();
        professores = new ArrayList<>();
    }

    // Método para adicionar um aluno à lista
    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public void adicionarProfessor(Professor professor) {
        professores.add(professor);
    }

    public void listarAlunos() {
        System.out.println("Alunos na escola:");
        for (Aluno aluno : alunos) {
            System.out.println("Nome: " + aluno.getNome() + ", Idade: " + aluno.getIdade());
        }
    }

    public void listarProfessores() {
        System.out.println("Professores na escola:");
        for (Professor professor : professores) {
            System.out.println("Nome: " + professor.getNome() + ", Disciplina: " + professor.getDisciplina());
        }
    }
}
