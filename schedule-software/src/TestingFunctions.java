public class TestingFunctions {
    public static void main(String[] args) {
        System.out.println(CreatePayload.returnCorrectPayload(TimeLogFunctions.getCurrentData(), "saturday", "Java", "2"));
        System.out.println(TimeLogFunctions.getWeekDayString());
    }

}
