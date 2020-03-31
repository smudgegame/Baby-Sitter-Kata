import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FamilyTest {

    @Test
    public void basicFamilyTest() {
        Family family = new Family("A");

        assertEquals(15, family.getRate(17));
    }

    @Test
    public void familyWithDifferentRate() {
        Family family = new Family("B");

        assertEquals(12,family.getRate(17));
    }

    @Test
    public void thirdFamilyRate(){
        Family family = new Family("C");

        assertEquals(21,family.getRate(17));
    }

}
