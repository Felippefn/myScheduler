public class CreatePayload {
    public static String returnCorretPayload(String FormatDay, String WeekDay, String Subject, int Hours) {
        return FormatDay + " || ON " + WeekDay + ": Studied" + " " + Subject + " for " + Hours + " hours";
    }
}
