public class TimeParser {
    private static final int PM_HOURS_TO_ADD = 12;
    private static final int AM_HOURS_TO_ADD = 24;

    public int parse(String input) {
        String[] splitUpTime = input.split(":");
        int hour = Integer.parseInt(splitUpTime[0]);
        int suffix = PM_HOURS_TO_ADD;
        if (splitUpTime[1].toLowerCase().endsWith("am")) {
            suffix = AM_HOURS_TO_ADD;
        }
        return hour + suffix;
    }
}
