import javax.security.auth.Subject;

public class CreatePayload {
    public static String returnCorretPayload(String FormatDay, String WeekDay, String Subject, int Hours){
        return FormatDay + " on " + WeekDay + ": Studied" + Subject + "for - " + Hours;
    }
}
