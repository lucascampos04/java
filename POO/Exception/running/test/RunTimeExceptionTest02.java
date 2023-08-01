package POO.Exception.running.test;

public class RunTimeExceptionTest02 {
    public static void main(String[] args) {
        try {
            divisao(1, 1);
        } catch (RuntimeException e){
            e.printStackTrace();
        }
        System.out.println("Codigo finalizado");
    }
    private static int divisao(int a, int b) throws IllegalArgumentException{
        if(b == 0){
            // Usamos throw new para lançar um exceção
            throw new IllegalArgumentException("Argumento invalido");
        }
        return a/b;
    }

}
