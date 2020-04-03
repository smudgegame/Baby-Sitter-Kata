public class BabySitter {
    private Family family;

    public BabySitter(Family family){
        this.family =family;
    }

    public int calculatePay(String start, String end) {
        int pay = 0;
        TimeParser timeParser = new TimeParser();
        int startHour = timeParser.parse(start);
        int endHour = timeParser.parse(end);
        if (endHour < startHour || startHour < 17 || endHour > 28)
            throw new IllegalArgumentException();
        for (int x = startHour; x < endHour; x++) {
            pay += family.getRate(x);
        }
        return pay;
    }
}
