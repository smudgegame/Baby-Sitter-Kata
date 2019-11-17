
public class BabySitter {
    public int calculatePay(String start, String end) {
        TimeParser timeParser = new TimeParser();
        int startHour = timeParser.parse(start);
        int endHour = timeParser.parse(end);
        if(endHour < startHour) throw new IllegalArgumentException();
        return 10;
    }
}
