import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FamilyTest {

    @Test
    public void basicFamilyTest() {
        Family family = new Family(6);

        assertEquals(6, family.getRate(17));
    }

    @Test
    public void basicFamilyWithADifferentRate() {
        Family family = new Family(7);

        assertEquals(7, family.getRate(17));
    }

    @Test
    public void baseRateBasedOnFamilyId() {
        Family family = new Family(7);
        family.getId("A");
        assertEquals(15,family.getRate(17) );
    }

    @Test
    public void familyBBaseRate(){
        Family family = new Family(7);
        family.getId("B");
        assertEquals(12,family.getRate(17) );
    }

    @Test
    public void familyCBaseRate(){
        Family family = new Family(7);
        family.getId("C");
        assertEquals(21,family.getRate(17) );
    }
}
