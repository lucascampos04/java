package introducao;

public class If {
    public static void main(String[] args) {
        int idade = 9;
        boolean isAutorizadoVotar = idade > 18;

        // Is é obrigatorio para delcarar variaveis boleanas
        if (isAutorizadoVotar){
            System.out.println("O voto é obrigatorio");
        }
        // ! negação
        if(!isAutorizadoVotar){
           System.out.println("voce não pode votar");
        }

    }
}
