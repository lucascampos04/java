package introducao;

public class Else_if {
    public static void main(String[] args) {
        int idade = 18;

        if (idade >= 18){
            System.out.println("Voce pode comprar bebida alcolicas");
        } else if (idade >= 16) {
            System.out.println("Voce só pode comprar bebida alcolica com comprovante de seus responsaveis");
        } else{
            System.out.println("Voce não pode comprar bebida alcolica");
        }
    }
}
