import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BabySitterTest {

    @Test(expected = IllegalArgumentException.class)
    public void startTimeCannotBeAfterEndTime() {
        BabySitter babySitter = new BabySitter();
        babySitter.calculatePay("6:00pm", "5:00pm");
    }

}
