import Attractions.Park;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ParkTest {

    Park park;

    @Before
    public void before() {
        park = new Park("Hawk Park", 10, 12, 4);
    }

    @Test
    public void getName() {
        assertEquals("Hawk Park", park.getName());
    }

    @Test
    public void getCost(){
        assertEquals(10, park.getCost());
    }

    @Test
    public void getMinAge(){
        assertEquals(12,park.getMinAge());
    }

    @Test
    public void getRating(){
        assertEquals(4,park.getRating());
    }

    @Test
    public void setName(){
        park.setName("Owl Park");
        assertEquals("Owl Park",park.getName());
    }

    @Test
    public void setCost(){
        park.setCost(12);
        assertEquals(12,park.getCost());
    }

    @Test
    public void setMinAge(){
        park.setMinAge(11);
        assertEquals(11,park.getMinAge());
    }

    @Test
    public void setRating(){
        park.setRating(5);
        assertEquals(5,park.getRating());
    }




}


