import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeLogFunctions {

    public static String getWeekDayString() {
        Date date = new Date();
        DateFormat formatter = new SimpleDateFormat("EEEE");
        return formatter.format(date);
    }

    public static String getActualData() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        return formatter.format(date);
    }

}
