import java.util.Map;

public class Family {
    private int rate;
    private String id;
    private Map<Integer,Integer> hourlyRate;
    public Family(int rate, String id, Map<Integer,Integer> hourlyRate) {
        this.rate = rate;
        this.id = id;
        this.hourlyRate = hourlyRate;
    }

    public Family(int rate) {
        this.rate = rate;
    }

    public int getRate(int hour) {
        if (this.id == null)
            return rate;
        if (this.id.equals("A")) {
            rate = 15;
            if (hour >= 23) rate = 20;
        }
        if (this.id.equals("B")) {
            rate = 12;
            if (22 <= hour && hour < 24) rate = 8;
            if (24 <= hour) rate = 16;
        }
        if (this.id.equals("C")) {
            rate = 21;
            if (21 <= hour) rate = 15;
        }
        return rate;
    }

}
