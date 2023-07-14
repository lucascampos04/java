package POO_exercicios.ex2.Class;

public class Funcionarios {
    private String nome;
    private int idade;
    private Double[] salario;
    private double media;

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        if (salario == null){
            return;
        }
        for ( Double salary : salario){
            System.out.print(salary + " ");
        }
    }
    public void imprimeMedia(){
        if (salario == null){
            return;
        }
        for(double salary : salario){
            media += salary;
        }
        media /= salario.length;
        System.out.println("Media salarial: " + media);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Double[] getSalario() {
        return salario;
    }

    public void setSalario(Double[] salario) {
        this.salario = salario;
    }

    public double getMedia() {
        return media;
    }
}
