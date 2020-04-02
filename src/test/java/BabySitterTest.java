import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BabySitterTest {

    @Test(expected = IllegalArgumentException.class)
    public void startTimeCannotBeAfterEndTime() {
        BabySitter babySitter = new BabySitter();
        babySitter.calculatePay("6:00pm", "5:00pm");
    }

    @Test(expected = IllegalArgumentException.class)
    public void timeBeforeAllowableHours(){
        BabySitter babySitter = new BabySitter();
        babySitter.calculatePay("4:00pm","6:00pm");
    }

    @Test(expected = IllegalArgumentException.class)
    public void timeAfterAllowableHours(){
        BabySitter babySitter = new BabySitter();
        babySitter.calculatePay("5:00pm","6:00am");
    }

    @Test
    public void oneHourForTenDollars() {
        BabySitter babySitter = new BabySitter();
        int pay = babySitter.calculatePay("5:00pm", "6:00pm");
        assertEquals(10, pay);
    }

    @Test
    public void oneHourForFamilyA() {
        BabySitter babySitter = new BabySitter();
        babySitter.family.setId("A");
        int pay = babySitter.calculatePay("5:00pm", "6:00pm");
        assertEquals(15, pay);
    }

    @Test
    public void oneFullNightFamilyA() {
        BabySitter babySitter = new BabySitter();
        babySitter.family.setId("A");
        int pay = babySitter.calculatePay("5:00pm", "4:00am");
        assertEquals(190, pay);
    }

    @Test
    public void oneFullNightFamilyB(){
        BabySitter babySitter = new BabySitter();
        babySitter.family.setId("B");
        int pay = babySitter.calculatePay("5:00pm", "4:00am");
        assertEquals(140, pay);
    }

    @Test
    public void oneFullNightFamilyC(){
        BabySitter babySitter = new BabySitter();
        babySitter.family.setId("C");
        int pay = babySitter.calculatePay("5:00pm", "4:00am");
        assertEquals(189, pay);
    }

}
