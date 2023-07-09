package introducao;

public class Array_pt4 {
    public static void main(String[] args) {
        int[] numeros = {1,2,3,4,5,6,7,8};
        for (int i = 0; i < numeros.length ; i++) {
            System.out.println(numeros[i]);
        }

        System.out.println("");

        int[] numeros1 = new int[]{1,2,3,4,5,6,7};
        for (int i = 2; i < numeros1.length ; i++) {
            System.out.println(numeros1[i]);
        }

        System.out.println("\nForEach");

        for (int j : numeros1){
            System.out.println(j);
        }
    }
}
