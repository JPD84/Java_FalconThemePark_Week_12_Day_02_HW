import Attractions.RollerCoaster;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class RollerCoasterTest {

    RollerCoaster rollerCoaster;

    @Before
    public void before(){
        rollerCoaster = new RollerCoaster("Falcon Drop", 12, 10, 4);
    }

    @Test
    public void getName(){
        assertEquals("Falcon Drop", rollerCoaster.getName());
    }

    @Test
    public void getAgeRestriction(){
        assertEquals(12, rollerCoaster.getAgeRestriction());
    }

    @Test
    public void getCost(){
        assertEquals(10, rollerCoaster.getCost());
    }

    @Test
    public void getRating(){
        assertEquals(4, rollerCoaster.getRating());
    }

    @Test
    public void setName(){
        rollerCoaster.setName("Eagle ThemePark");
        assertEquals("Eagle ThemePark",rollerCoaster.getName());
    }

    @Test
    public void setAgeRestriction(){
        rollerCoaster.setAgeRestriction(13);
        assertEquals(13,rollerCoaster.getAgeRestriction());
    }

    @Test
    public void setCost(){
        rollerCoaster.setCost(12);
        assertEquals(12,rollerCoaster.getCost());
    }

    @Test
    public void setRating(){
        rollerCoaster.setRating(5);
        assertEquals(5,rollerCoaster.getRating());
    }


}
