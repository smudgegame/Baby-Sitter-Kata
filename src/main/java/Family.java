public class Family {
    private int rate;
    private String id;

    public Family(int rate) {
        this.rate = rate;
    }

    public int getRate(int hour) {
        if(this.id == null)
            return rate;
        if(this.id.equalsIgnoreCase("A"))  rate=15;
            return rate;
    }

    public String getId(String id) {
        this.id = id;
        return id;
    }
}
