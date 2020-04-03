import org.junit.BeforeClass;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

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
        Map<Integer,Integer> hourlyRate = new HashMap<>();
        hourlyRate.put(17,15);
        Family family = new Family(7,"A",hourlyRate);
        BabySitter babySitter = new BabySitter(family);

        int pay = babySitter.calculatePay("5:00pm", "6:00pm");
        assertEquals(15, pay);
    }

    @Test
    public void oneFullNightFamilyA() {
        Map<Integer,Integer> hourlyRate = new HashMap<>();
        hourlyRate.put(17,15);
        Family family =new Family(7,"A",hourlyRate);
        BabySitter babySitter = new BabySitter(family);

        int pay = babySitter.calculatePay("5:00pm", "4:00am");
        assertEquals(190, pay);
    }

    @Test
    public void oneFullNightFamilyB(){
        Map<Integer,Integer> hourlyRate = new HashMap<>();
        hourlyRate.put(17,15);
        Family family =new Family(7,"B",hourlyRate);
        BabySitter babySitter = new BabySitter(family);

        int pay = babySitter.calculatePay("5:00pm", "4:00am");
        assertEquals(140, pay);
    }

    @Test
    public void oneFullNightFamilyC(){
        Map<Integer,Integer> hourlyRate = new HashMap<>();
        hourlyRate.put(17,15);
        Family family =new Family(7,"C",hourlyRate);
        BabySitter babySitter = new BabySitter(family);

        int pay = babySitter.calculatePay("5:00pm", "4:00am");
        assertEquals(189, pay);
    }

}
