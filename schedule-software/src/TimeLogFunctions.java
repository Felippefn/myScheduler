import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeLogFunctions {

// Creating a function to return the name of day week
    public static String getWeekDayString() {  
        Date date = new Date();
        DateFormat formatter = new SimpleDateFormat("EEEE");
        return formatter.format(date);
    }
// Creating a function to return the time
    public static String getCurrentData() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        return formatter.format(date);
    }

}
