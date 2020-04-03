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
        hourlyRate.put(17, 15);
        hourlyRate.put(18, 15);
        hourlyRate.put(19, 15);
        hourlyRate.put(20, 15);
        hourlyRate.put(21, 15);
        hourlyRate.put(22, 15);
        hourlyRate.put(23, 20);
        hourlyRate.put(24, 20);
        hourlyRate.put(25, 20);
        hourlyRate.put(26, 20);
        hourlyRate.put(27, 20);
        hourlyRate.put(28, 20);

        Family family = new Family(7, hourlyRate);
        BabySitter babySitter = new BabySitter(family);

        int pay = babySitter.calculatePay("5:00pm", "4:00am");
        assertEquals(190, pay);
    }

    @Test
    public void oneFullNightFamilyB() {
        Map<Integer, Integer> hourlyRate = new HashMap<>();
        hourlyRate.put(17, 12);
        hourlyRate.put(18, 12);
        hourlyRate.put(19, 12);
        hourlyRate.put(20, 12);
        hourlyRate.put(21, 12);
        hourlyRate.put(22, 8);
        hourlyRate.put(23, 8);
        hourlyRate.put(24, 16);
        hourlyRate.put(25, 16);
        hourlyRate.put(26, 16);
        hourlyRate.put(27, 16);
        hourlyRate.put(28, 16);

        Family family = new Family(7, hourlyRate);
        BabySitter babySitter = new BabySitter(family);

        int pay = babySitter.calculatePay("5:00pm", "4:00am");
        assertEquals(140, pay);
    }

    @Test
    public void oneFullNightFamilyC() {
        Map<Integer, Integer> hourlyRate = new HashMap<>();
        hourlyRate.put(17, 21);
        hourlyRate.put(18, 21);
        hourlyRate.put(19, 21);
        hourlyRate.put(20, 21);
        hourlyRate.put(21, 15);
        hourlyRate.put(22, 15);
        hourlyRate.put(23, 15);
        hourlyRate.put(24, 15);
        hourlyRate.put(25, 15);
        hourlyRate.put(26, 15);
        hourlyRate.put(27, 15);
        hourlyRate.put(28, 15);

        Family family = new Family(7, hourlyRate);
        BabySitter babySitter = new BabySitter(family);

        int pay = babySitter.calculatePay("5:00pm", "4:00am");
        assertEquals(189, pay);
    }

}
