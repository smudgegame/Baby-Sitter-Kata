import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BabySitterTest {
    private static BabySitter babySitter;

    @BeforeClass
    public static void setUp(){
        Family family = new Family(7);
        babySitter = new BabySitter(family);
    }

    @Test(expected = IllegalArgumentException.class)
    public void startTimeCannotBeAfterEndTime() {
        babySitter.calculatePay("6:00pm", "5:00pm");
    }

    @Test(expected = IllegalArgumentException.class)
    public void timeBeforeAllowableHours(){
        babySitter.calculatePay("4:00pm","6:00pm");
    }

    @Test(expected = IllegalArgumentException.class)
    public void timeAfterAllowableHours(){
        babySitter.calculatePay("5:00pm","6:00am");
    }

    @Test
    public void oneHourForTenDollars() {
        Family family = new Family(10);
        BabySitter babySitter = new BabySitter(family);
        int pay = babySitter.calculatePay("5:00pm", "6:00pm");
        assertEquals(10, pay);
    }

    @Test
    public void oneHourForFamilyA() {
        Family family = new Family(7);
        family.setId("A");
        BabySitter babySitter = new BabySitter(family);

        int pay = babySitter.calculatePay("5:00pm", "6:00pm");
        assertEquals(15, pay);
    }

    @Test
    public void oneFullNightFamilyA() {
        Family family =new Family(7);
        family.setId("A");
        BabySitter babySitter = new BabySitter(family);

        int pay = babySitter.calculatePay("5:00pm", "4:00am");
        assertEquals(190, pay);
    }

    @Test
    public void oneFullNightFamilyB(){
        Family family =new Family(7);
        family.setId("B");
        BabySitter babySitter = new BabySitter(family);

        int pay = babySitter.calculatePay("5:00pm", "4:00am");
        assertEquals(140, pay);
    }

    @Test
    public void oneFullNightFamilyC(){
        Family family =new Family(7);
        family.setId("C");
        BabySitter babySitter = new BabySitter(family);

        int pay = babySitter.calculatePay("5:00pm", "4:00am");
        assertEquals(189, pay);
    }

}
