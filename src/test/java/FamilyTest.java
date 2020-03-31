import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FamilyTest {

    @Test
    public void basicFamilyTest() {
        Family family = new Family(6);

        assertEquals(6, family.getPay(17));
    }

    @Test
    public void basicFamilyWithADifferentRate() {
        Family family = new Family(7);

        assertEquals(7, family.getPay(17));
    }

    @Test
    public void payBasedOnFamilyA(){
        Family family = new Family(15);

        assertEquals(20,family.getPay(24));
    }

}
