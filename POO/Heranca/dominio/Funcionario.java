package POO.Heranca.dominio;

public class Funcionario extends Pessoa{
    private double salario;

    static {
        System.out.println("Dentro do bloco inicialização estatico de funcionario 1");
    }

    {
        System.out.println("Bloco de inicialização não estatico de funcionario 2");
    }

    {
        System.out.println("Bloco de inicialização não estatico de funcionario 3");
    }

    public Funcionario(String nome) {
        super(nome);
        System.out.println("Dentro do construtor de funcionario");
    }

    public void relatorioDePagemntos(){
        System.out.println("Eu: " + this.nome + "recebe o salrio : " + this.salario);
    }

    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
}
