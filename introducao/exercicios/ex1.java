package introducao.exercicios;

public class ex1 {
    public static void main(String[] args) {
        System.out.println("Hello");
        double salary = 25000;
        double valorDoImposto;
        double imposto1 = 9.70 / 100;
        double imposto2 = 37.35 / 100;
        double imposto3 = 49.50 / 100;

        if (salary < 34713){
            valorDoImposto = salary * imposto1;
        } else if (salary >= 34713 && salary <= 68507) {
            valorDoImposto = salary * imposto2;
        } else {
            valorDoImposto = salary * imposto3;
        }
        System.out.println(valorDoImposto);
    }
}
