package POO.Heranca.dominio;

public class Funcionario extends Pessoa{
    private double salario;


    public void nextUp(){
        super.nextUp();
        System.out.println(this.salario);
    }

    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
}
