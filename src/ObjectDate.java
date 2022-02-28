import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

// Научимся работать с датой и временем
public class ObjectDate {

    /**
     * @author Leonid Zulin
     */
    public static void main(String[] args) throws ParseException {
        // Создадим объект класса даты
        Date d = new Date();
        System.out.println(d);
        // создадим объект класса календарь
        Calendar c = new GregorianCalendar();
        // Сколько миллисекунд прошло с 1ого января 1970 года
        System.out.println(c.getTimeInMillis()/1000/60/60/24);
        System.out.println(c.get(GregorianCalendar.DATE));
        c.set(1980, 1, 1, 0, 0, 1);
        System.out.println(c.getTimeInMillis()/1000/60/60/24);
        c.set(GregorianCalendar.YEAR, 2050);
        System.out.println(c.getTimeInMillis()/1000/60/60/24);

        // Распарсить дату
        String date = "04.02.2022 17:22:05";
        // Для преобразования есть класс
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");

        d = format.parse(date);
        c.setTime(d);
        System.out.println(c.get(GregorianCalendar.MINUTE));
        System.out.println(new SimpleDateFormat("yyyy/MM/dd HH:mm секунд=ss").format(d));







    }
}
