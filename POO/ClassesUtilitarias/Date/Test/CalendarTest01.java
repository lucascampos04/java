package POO.ClassesUtilitarias.Date.Test;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest01 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        if (calendar.getFirstDayOfWeek() == Calendar.SUNDAY){
            System.out.println("Primeiro dia da semana");
        }
        System.out.println(Calendar.DAY_OF_WEEK); // dia da semana
        System.out.println(Calendar.DAY_OF_MONTH); // dia do mes
        System.out.println(Calendar.DAY_OF_WEEK_IN_MONTH); // dia da semana do mes

        calendar.add(Calendar.DAY_OF_MONTH, 2); // adicionando mais dias do mes
        calendar.add(Calendar.HOUR, 12); // adicionando horas

        Date date = calendar.getTime();
        System.out.println(date);
    }
}
