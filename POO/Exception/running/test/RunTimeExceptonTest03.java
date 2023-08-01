package POO.Exception.running.test;

public class RunTimeExceptonTest03 {
    public static void main(String[] args) {
        extracted();
    }

    private static Object extracted() {
        try{
            System.out.println("Abrindo arquivo");
            // exceção
            // throw new RuntimeException();
            System.out.println("Escrevendo dados");
            System.out.println("Fechando o arquivo");
            return "Conexão aberta";
        }catch (Exception e){
            System.out.println("Fechando arquivo");
            e.printStackTrace();
        } finally {
          // O finally sempre sera executado
            System.out.println("fechando recursos do sistema operacional");
        }
        return null;
    }
}
