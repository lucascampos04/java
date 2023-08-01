package POO.Exception.Exception.test;

import java.io.File;
import java.io.IOException;

public class Exceptiontest01 {
    public static void main(String[] args) {
        criarnovoarquivo();
    }

    private static void criarnovoarquivo(){
        // Evitar logica de nogocio no try
        File file = new File("arquivo\\teste.txt");
        try{
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado " +isCriado);
        }catch (IOException e){
            e.printStackTrace();
            // catch NUNCA VAZIO
        }
    }
}