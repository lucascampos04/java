package POO.ClassesUtilitarias.Date.Test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class LocaleTest01 {
    public static void main(String[] args) {

        Locale localeitaly = new Locale("it", "IT");
        Locale localeCH = new Locale("it", "CH");
        Locale localeBR = new Locale("pt", "BR");
        Locale localeJP = new Locale("ja", "JP");
        Locale localeHL = new Locale("nl", "NL");

        Calendar calendar = Calendar.getInstance();

        DateFormat italy = DateFormat.getDateInstance(DateFormat.FULL, localeCH);
        DateFormat suica = DateFormat.getDateInstance(DateFormat.FULL, localeitaly);
        DateFormat brazil = DateFormat.getDateInstance(DateFormat.FULL, localeBR);
        DateFormat japan = DateFormat.getDateInstance(DateFormat.FULL, localeJP);
        DateFormat netherlands = DateFormat.getDateInstance(DateFormat.FULL, localeHL);

        System.out.println("Italia  " + italy.format(calendar.getTime()));
        System.out.println("Suiça " + suica.format(calendar.getTime()));
        System.out.println("Brasil " + brazil.format(calendar.getTime()));
        System.out.println("Japão " + japan.format(calendar.getTime()));
        System.out.println("Holanda " + netherlands.format(calendar.getTime()));

        // Traduz o pais
        System.out.println(localeitaly.getDisplayCountry(localeBR));
        System.out.println(localeJP.getDisplayCountry(localeBR));
        System.out.println(localeitaly.getDisplayCountry());
        System.out.println(localeHL.getDisplayCountry());
    }
}
