package POO.ClassesUtilitarias.Test;

import java.awt.geom.Arc2D;

public class WrapperTest01 {
    public static void main(String[] args) {
        // Wrappers são objetos que vão encapsular os tipos primitivos
        // Tipos primitivos:
        byte byteP = 1;
        short shortP = 1;
        int intP = 1;
        long longP = 10L;
        float floatP = 10F;
        double doubleP = 1;
        char charP = 'W';
        boolean booleanP = true;

        // Classes tipo Wrapper
        // Boxing (ou Autoboxing): Converter tipos primitivos em seus respectivos wrappers
        Byte byteW = 1;         // Byte é o wrapper do tipo primitivo byte
        Short shortW = 1;       // Short é o wrapper do tipo primitivo short
        Integer intW = 1;       // Integer é o wrapper do tipo primitivo int
        Long longW = 10L;       // Long é o wrapper do tipo primitivo long
        Float floatW = 10F;     // Float é o wrapper do tipo primitivo float
        Double doubleW = 10D;   // Double é o wrapper do tipo primitivo double
        Character charW = 'W';  // Character é o wrapper do tipo primitivo char
        Boolean booleanW = true;// Boolean é o wrapper do tipo primitivo boolean

        Byte byteWrapper = Byte.valueOf((byte) 10); // Boxing para Byte
        Short shortWrapper = Short.valueOf((short) 20); // Boxing para Short
        Integer intWrapper = Integer.valueOf(30); // Boxing para Integer
        Long longWrapper = Long.valueOf(40L); // Boxing para Long
        Float floatWrapper = Float.valueOf(50.5F); // Boxing para Float
        Double doubleWrapper = Double.valueOf(60.6); // Boxing para Double
        Character charWrapper = Character.valueOf('X'); // Boxing para Character
        Boolean booleanWrapper = Boolean.valueOf(true); // Boxing para Boolean

        // Unboxing: Converter wrappers em tipos primitivos
        int i = intW;           // Converter Integer em int (Unboxing)
        Integer intW2 = Integer.parseInt("1"); // Converter String em Integer (Unboxing)
        Float floatW2 = Float.parseFloat("1"); // Converter String em Float (Unboxing)
        Boolean verdadeiro = Boolean.parseBoolean("true"); // Converter String em Boolean (Unboxing)

        System.out.println(Character.isDigit('A')); // Verificar se o caractere é um dígito
        System.out.println(Character.isLetterOrDigit('!')); // Verificar se o caractere é uma letra ou dígito
        System.out.println(Character.isUpperCase('A')); // Verificar se o caractere está em maiúsculo
        System.out.println(Character.isLowerCase('a')); // Verificar se o caractere está em minúsculo
    }
}
