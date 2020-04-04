import org.junit.BeforeClass;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class BabySitterTest {
    private static BabySitter babySitter;

    @BeforeClass
    public static void setUp() {

        Family family = new Family(7, new HashMap<>());
        babySitter = new BabySitter(family);
    }

    @Test(expected = IllegalArgumentException.class)
    public void startTimeCannotBeAfterEndTime() {
        babySitter.calculatePay("6:00pm", "5:00pm");
    }

    @Test(expected = IllegalArgumentException.class)
    public void timeBeforeAllowableHours() {
        babySitter.calculatePay("4:00pm", "6:00pm");
    }

    @Test(expected = IllegalArgumentException.class)
    public void timeAfterAllowableHours() {
        babySitter.calculatePay("5:00pm", "6:00am");
    }

    @Test
    public void oneHourForTenDollars() {
        Family family = new Family(10, new HashMap<>());
        BabySitter babySitter = new BabySitter(family);
        int pay = babySitter.calculatePay("5:00pm", "6:00pm");
        assertEquals(10, pay);
    }

    @Test
    public void oneHourForFamilyA() {
        Map<Integer, Integer> hourlyRate = new HashMap<>();
        hourlyRate.put(17, 15);
        Family family = new Family(7, hourlyRate);
        BabySitter babySitter = new BabySitter(family);

        int pay = babySitter.calculatePay("5:00pm", "6:00pm");
        assertEquals(15, pay);
    }

    @Test
    public void oneFullNightFamilyA() {
        Map<Integer, Integer> hourlyRate = new HashMap<>();
        hourlyRate.put(23, 20);

        Family family = new Family(15, hourlyRate);
        BabySitter babySitter = new BabySitter(family);

        int pay = babySitter.calculatePay("5:00pm", "4:00am");
        assertEquals(190, pay);
    }

    @Test
    public void oneFullNightFamilyB() {
        Map<Integer, Integer> hourlyRate = new HashMap<>();
        hourlyRate.put(22, 8);
        hourlyRate.put(24, 16);

        Family family = new Family(12, hourlyRate);
        BabySitter babySitter = new BabySitter(family);

        int pay = babySitter.calculatePay("5:00pm", "4:00am");
        assertEquals(140, pay);
    }

    @Test
    public void oneFullNightFamilyC() {
        Map<Integer, Integer> hourlyRate = new HashMap<>();
        hourlyRate.put(21, 15);

        Family family = new Family(21, hourlyRate);
        BabySitter babySitter = new BabySitter(family);

        int pay = babySitter.calculatePay("5:00pm", "4:00am");
        assertEquals(189, pay);
    }

    @Test
    public void partialNight() {
        Map<Integer, Integer> hourlyRate = new HashMap<>();
        hourlyRate.put(23, 20);

        Family family = new Family(15, hourlyRate);
        BabySitter babySitter = new BabySitter(family);

        int pay = babySitter.calculatePay("1:00am", "4:00am");
        assertEquals(60, pay);
    }


}
