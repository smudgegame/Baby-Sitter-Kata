public class BabySitter {
    private Family family;
    private static final int MIN_START_HOUR = 17;
    private static final int MAX_END_HOUR = 28;

    public BabySitter(Family family) {
        this.family = family;
    }

    public int calculatePay(String start, String end) {
        int pay = 0;
        TimeParser timeParser = new TimeParser();
        int startHour = timeParser.parse(start);
        int endHour = timeParser.parse(end);
        if (endHour < startHour || startHour < MIN_START_HOUR || endHour > MAX_END_HOUR)
            throw new IllegalArgumentException();
        for (int x = startHour; x < endHour; x++) {
            pay += family.getRate(x);
        }
        return pay;
    }
}
