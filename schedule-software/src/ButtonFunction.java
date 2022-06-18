import java.text.SimpleDateFormat;
import java.util.Date;

public class ButtonFunction {

    public static String getActualData() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        return formatter.format(date);
    }

    public static String returnValueClick() {
        String actualTime = TestTime.getActualData();
        return actualTime;
    }

}
