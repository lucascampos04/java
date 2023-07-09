package introducao;

public class Switch {
    public static void main(String[] args) {
        byte dia = 10;

        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-Feira");
                break;
            case 3:
                System.out.println("Terça-Feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Sabado");
                break;
            default:
                System.out.println("Dia invalido");
        }
    }
}
