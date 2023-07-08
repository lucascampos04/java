package introducao;

public class Else_if {
    public static void main(String[] args) {
        int idade = 18;
        String categoria;

        if (idade >= 18){
            categoria = "Voce pode comprar bebida alcolica";
        } else if (idade >= 16) {
            categoria = "Voce só pode comprar bebida alcolica com comprovante de seus responsaveis";
        } else{
            categoria = "Voce não pode comprar bebida alcolica";
        }


        System.out.println(categoria);
    }
}
