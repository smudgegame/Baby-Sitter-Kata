import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class FamilyTest {

    @Test
    public void basicFamilyTest() {
        Family family = new Family(6, new HashMap<>());

        assertEquals(6, family.getRate(17));
    }

    @Test
    public void basicFamilyWithADifferentRate() {
        Family family = new Family(7,new HashMap<>());

        assertEquals(7, family.getRate(17));
    }

    @Test
    public void baseRateBasedOnFamilyId() {
        Map<Integer, Integer> hourlyRate = new HashMap<>();
        hourlyRate.put(17, 15);
        Family family = new Family(7, hourlyRate);

        assertEquals(15, family.getRate(17));
    }

    @Test
    public void familyBBaseRate() {
        Map<Integer, Integer> hourlyRate = new HashMap<>();
        hourlyRate.put(17, 12);
        Family family = new Family(7,  hourlyRate);

        assertEquals(12, family.getRate(17));
    }

    @Test
    public void familyCBaseRate() {
        Map<Integer, Integer> hourlyRate = new HashMap<>();
        hourlyRate.put(17, 21);
        Family family = new Family(7,hourlyRate);

        assertEquals(21, family.getRate(17));
    }

    @Test
    public void familyARateBasedOnHour() {
        Map<Integer, Integer> hourlyRate = new HashMap<>();
        hourlyRate.put(23, 20);
        Family family = new Family(7,  hourlyRate);

        assertEquals(20, family.getRate(23));
    }

    @Test
    public void familyBTenToTwelve() {
        Map<Integer, Integer> hourlyRate = new HashMap<>();
        hourlyRate.put(22, 8);
        Family family = new Family(7, hourlyRate);

        assertEquals(8, family.getRate(22));
    }

    @Test
    public void familyBAfterTwelve() {
        Map<Integer, Integer> hourlyRate = new HashMap<>();
        hourlyRate.put(24, 16);
        Family family = new Family(7, hourlyRate);

        assertEquals(16, family.getRate(24));
    }

    @Test
    public void familyCAfterNine() {
        Map<Integer, Integer> hourlyRate = new HashMap<>();
        hourlyRate.put(21, 15);
        Family family = new Family(7, hourlyRate);

        assertEquals(15, family.getRate(21));
    }

}
