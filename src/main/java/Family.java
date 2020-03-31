public class Family {
    private String letter;

    public Family(String letter) {
        this.letter = letter;
    }

    public int getRate(int hour) {
        int rate=15;
        if (letter.equals("A")) rate=15;
        if (letter.equals("B")) rate=12;
        if (letter.equals("C")) rate=21;
        return rate;

    }
}
