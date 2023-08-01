package POO.Exception.Exception.test;

import java.io.File;
import java.io.IOException;

public class Exceptiontest01 {
    public static void main(String[] args) throws IOException{
        criarnovoarquivo();
    }

    public static void criarnovoarquivo() throws IOException{
        // Evitar logica de nogocio no try
        File file = new File("arquivo\\teste.txt");
        try{
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado " +isCriado);
        }catch (IOException e){
            e.printStackTrace();
            throw new RuntimeException("Problem na hora de criar o arquivo");
            // throw e; - Puxado a exceção
            // catch NUNCA VAZIO
        }
    }
}