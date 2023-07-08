package introducao;

public class TiposPrimitivosDeVariaveis {
    public static void main(String[] args){
        System.out.println("Tipos Primitivos");
        System.out.println("---------------------------------");
        System.out.println("int, double, float, char, byte, short, long, boolean");

        int idade = 19;
        byte idadeByte = 19;
        short idadeShort = 19;
        boolean verdadeiro = true;
        boolean falso = false;
        char nome = 'M';
        double salario = 2000;
        float salarioFloat = 3000;

        System.out.println("---------------------------------");
        System.out.println("Tamanho de cada variavel");
        System.out.println("byte = 1 byte \nshort = 2 byte \nint = 4 byte \nlong = 8 byte \nfloat = 4 byte" +
                "\ndouble = 8 byte \nboolean = 1 byte \nchar = 2 byte");

        // (Tipo da variavel) força o tamanho do variavel - Casting
        int age = (int)10000000000L;
        System.out.println(age);

        String name = "Lucas Oliviera Campos";
        String endereco = "Rua uuatorze de Novembro, 11";
        double salary = 2023.52;
        String data = "10/11/2023";

        System.out.printf("Eu %s, morando na rua %s, confirmo que recebi o salário de %f, na data %s", name,
                endereco, salary, data);


    }
}
