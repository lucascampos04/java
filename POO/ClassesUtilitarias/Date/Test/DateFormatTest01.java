package POO.ClassesUtilitarias.Date.Test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateFormatTest01 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        DateFormat[] df = new DateFormat[7];

        // Inicializa diferentes formatos de data no array.
        df[0] = DateFormat.getInstance(); // Formato padrão de data e hora.
        df[1] = DateFormat.getDateInstance(); // Formato padrão de data (sem hora).
        df[2] = DateFormat.getDateInstance(); // Formato padrão de data (sem hora).
        df[3] = DateFormat.getDateInstance(DateFormat.SHORT); // Formato de data curta.
        df[4] = DateFormat.getDateInstance(DateFormat.MEDIUM); // Formato de data média.
        df[5] = DateFormat.getDateInstance(DateFormat.LONG); // Formato de data longa.
        df[6] = DateFormat.getDateInstance(DateFormat.FULL); // Formato de data completa.

        // Itera sobre os formatos de data no array e imprime a data atual formatada de acordo com cada formato.
        for (DateFormat dateFormat : df) {
            System.out.println(dateFormat.format(calendar.getTime()));
        }
    }
}