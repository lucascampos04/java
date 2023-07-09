package introducao;

public class LacosDeRepeticao {
    public static void main(String[] args) {
        int number = 0;
        while (number < 10){
            System.out.println(++number);
        }

        number = 0;
        do {
            System.out.println("Dentro do Do-While" + ++number);
        } while (number < 19);

        for (int i=0; i < 10; i++){
            System.out.println("For: " + i);
        }
    }
}
