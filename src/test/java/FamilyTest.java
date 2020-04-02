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
        family.setId("A");

        assertEquals(15,family.getRate(17) );
    }

    @Test
    public void familyBBaseRate(){
        Family family = new Family(7);
        family.setId("B");

        assertEquals(12,family.getRate(17) );
    }

    @Test
    public void familyCBaseRate(){
        Family family = new Family(7);
        family.setId("C");

        assertEquals(21,family.getRate(17) );
    }

    @Test
    public void familyARateBasedOnHour(){
        Family family = new Family(7);
        family.setId("A");

        assertEquals(20,family.getRate(23));
    }

    @Test
    public void familyBTenToTwelve(){
        Family family = new Family(7);
        family.setId("B");

        assertEquals(8,family.getRate(22));
    }

    @Test
    public void familyBAfterTwelve(){
        Family family = new Family(7);
        family.setId("B");

        assertEquals(16,family.getRate(24));
    }

    @Test
    public void familyCAfterNine(){
        Family family = new Family(7);
        family.setId("C");

        assertEquals(15,family.getRate(21) );
    }

}
