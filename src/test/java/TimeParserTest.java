import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TimeParserTest {

    @Test
    public void parse5pmAs48HourTime() {
        TimeParser timeParser = new TimeParser();

        String input = "5:00pm";
        int actual = timeParser.parse(input);

        assertEquals(17, actual);
    }

    @Test
    public void parse6pmAs48HourTime() {
        TimeParser timeParser = new TimeParser();

        String input = "6:00pm";
        int actual = timeParser.parse(input);

        assertEquals(18, actual);
    }

    @Test
    public void parse3amAs48HourTime() {
        TimeParser timeParser = new TimeParser();

        String input = "3:00am";
        int actual = timeParser.parse(input);

        assertEquals(27, actual);
    }

    @Test
    public void parse3AMAs48HourTime() {
        TimeParser timeParser = new TimeParser();

        String input = "3:00AM";
        int actual = timeParser.parse(input);

        assertEquals(27, actual);
    }
}
