package introducao;

public class Arrays_pt3 {
    public static void main(String[] args) {
        // byte, short, int, float e double = 0
        // char '\u0000'
        // boolena false
        // String null

        String[] nomes = new String[3];
        nomes[0] = "Lucas";
        nomes[1] = "Oliviera";
        nomes[2] = "Campos";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
    }
}
