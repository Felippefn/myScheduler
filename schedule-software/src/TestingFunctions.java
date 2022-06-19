public class TestingFunctions {
    public static void main(String[] args) {
        System.out.println(CreatePayload.returnCorretPayload(TimeLogFunctions.getCurrentData(), "saturday", "Java", 2));
        System.out.println(TimeLogFunctions.getWeekDayString());
    }

}
