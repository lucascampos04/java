package introducao;

public class OperadoresAritimeticos {
    public static void main(String[] args) {
        System.out.println("Operadores Padrão. \n+ | - | * | / | ** | %");

        int n1 = 10;
        int n2 = 10;

        System.out.println("Resultado "+n1+n2); // Concatenando
        System.out.println(n1+n2+" Resultado"); // Realizando a soma

        int n = 10;
        double a = 30;
        System.out.println(n / (int)a);

        int e = 10;
        double r = 30;
        System.out.println(a / r);

        System.out.println("Operadores relacionais ");

        int resto = 30 % 2;
        System.out.println(resto);

        System.out.println("Operador de comparação \n< > | <= | >= | == | !=");

        boolean isDez = 10 != 20;
        boolean isDez1 = 10 == 20;
        boolean isDez2 = 10 >= 20;
        boolean isDez3 = 10 <= 20;


        System.out.println(isDez);
        System.out.println(isDez1);
        System.out.println(isDez2);
        System.out.println(isDez3);
    }
}
