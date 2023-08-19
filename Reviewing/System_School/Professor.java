package Reviewing.System_School;

public class Professor {
    private String nome;
    private String disciplina;
    public Professor(String nome, String disciplina) {
        this.nome = nome;
        this.disciplina = disciplina;
    }
    public String getNome() {
        return nome;
    }
    public String getDisciplina() {
        return disciplina;
    }
}
