public class Family {
    private int rate;

    public Family(int rate) {
        this.rate = rate;
    }

    public int getPay(int hour) {
        int pay = (hour-16)*rate;
        return pay;
    }


}
