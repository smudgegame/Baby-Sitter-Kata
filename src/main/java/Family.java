import java.util.Map;

public class Family {
    private int rate;
    private Map<Integer,Integer> hourlyRate;

    public Family(int rate, Map<Integer,Integer> hourlyRate) {
        this.rate = rate;
        this.hourlyRate = hourlyRate;
    }

    public int getRate(int hour) {
        if(hourlyRate.containsKey(hour)){
            hourlyRate.putIfAbsent(hour+1,hourlyRate.get(hour));
            return hourlyRate.get(hour);
        }
        return rate;
    }

}
