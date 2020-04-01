import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BabySitterTest {

    @Test(expected = IllegalArgumentException.class)
    public void startTimeCannotBeAfterEndTime() {
        BabySitter babySitter = new BabySitter();
        babySitter.calculatePay("6:00pm", "5:00pm");
    }

    @Test(expected =IllegalArgumentException.class)
    public void timeBeforeAllowableHours(){
        BabySitter babySitter = new BabySitter();
        babySitter.calculatePay("4:00pm","6:00pm");
    }

    @Test(expected =IllegalArgumentException.class)
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



}
