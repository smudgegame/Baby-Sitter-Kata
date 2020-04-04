import java.util.Map;

public class Family {
    private int rate;
    private Map<Integer, Integer> hourlyRate;
    private static final int END_HOUR = 28;

    public Family(int rate, Map<Integer, Integer> hourlyRate) {
        this.rate = rate;
        this.hourlyRate = hourlyRate;

        for (int hour = 0; hour < END_HOUR; hour++) {
            this.getRate(hour);
        }
    }

    public int getRate(int hour) {
        if (hourlyRate.containsKey(hour)) {
            hourlyRate.putIfAbsent(hour + 1, hourlyRate.get(hour));
            return hourlyRate.get(hour);
        }
        return rate;
    }

}
