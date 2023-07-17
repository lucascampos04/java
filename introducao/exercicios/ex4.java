package introducao.exercicios;

public class ex4 {
    public static void main(String[] args) {
        int carro = 50000;
        int parcela = 0;
        boolean isQuantidadeDeParcelas = parcela >= 100;

        if (isQuantidadeDeParcelas){
            carro /= parcela;
            System.out.println("O seu carro pode ser parcelado em ate " + carro + "x");
        } else {
            System.out.println("O seu carro não pode ser parcelado");
        }
    }
}
