import java.util.Calendar;
import java.util.GregorianCalendar;
public class GregorianCalenderDemo {
    public static void main(String[] args) {
        GregorianCalendar now = new GregorianCalendar();
        int month  = now.get(Calendar.MONTH);
        int weekend = now.get(Calendar.DAY_OF_WEEK);
        System.out.println(month);
        System.out.println(weekend);
    }
}
