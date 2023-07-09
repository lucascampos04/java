package introducao.exercicios;

public class ex2 {
    public static void main(String[] args) {
        int dias = 7;

        switch (dias){
            case 1:
                System.out.println("Final de semana");
                break;
            case 2:
                System.out.println("Dia Util");
                break;
            case 3:
                System.out.println("Dia Util");
                break;
            case 4:
                System.out.println("Dia Util");
                break;
            case 5:
                System.out.println("Dia Util");
                break;
            case 6:
                System.out.println("Dia Util");
                break;
            case 7:
                System.out.println("Final de semana");
                break;
            default:
                System.out.println("Dia inexistente");
        }

        // Simplificado
        int dia = 3;

        switch (dia){
            case 1:
            case 7:
                System.out.println("Final de semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia util");
                break;
            default:
                System.out.println("Dia inexistente");
        }
    }
}
