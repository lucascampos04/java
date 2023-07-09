package introducao;

public class ArrayMultidimensionais_pt2 {
    public static void main(String[] args) {
        int[][] dias = new int[3][3];

        System.out.println("Usando ForEach");

        dias[0][0] = 31;
        dias[0][1] = 30;
        dias[0][2] = 29;

        dias[1][0] = 31;
        dias[1][1] = 31;
        dias[1][2] = 31;

        dias[2][0] = 31;
        dias[2][1] = 31;
        dias[2][2] = 31;

        for (int[] arrBase : dias){
            for (int num : arrBase){
                System.out.println(num);
            }
        }
    }
}
