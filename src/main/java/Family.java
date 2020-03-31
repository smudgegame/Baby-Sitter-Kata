public class Family {
    private int rate;

    public Family(int rate) {
        this.rate = rate;
    }

    public int getPay(int hour) {
        if(hour>=23) rate+=5;
        return rate;
    }


}
