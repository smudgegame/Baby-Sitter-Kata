public class Family {
    private int rate;

    public Family(int rate) {
        this.rate = rate;
    }

    public int getRate(int hour) {
        if(hour>=23) rate=20;
        return rate;
    }

}
