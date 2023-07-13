package POO_exercicios.ex2.Class;

public class Funcionarios {
    public String nome;
    public int idade;
    public Double[] salario;

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
        double media = 0;
        if (salario == null){
            return;
        }
        for(double salary : salario){
            media += salary;
        }
        media /= salario.length;
        System.out.println("Media salarial: " + media);
    }

}
