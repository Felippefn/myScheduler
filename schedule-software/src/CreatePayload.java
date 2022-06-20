public class CreatePayload {
    public static String returnCorrectPayload(String FormatDay, String WeekDay, String Subject, String string) {
        return FormatDay + " || ON " + WeekDay + ": Studied" + " " + Subject + " for " + string + " hours";
    }
}
