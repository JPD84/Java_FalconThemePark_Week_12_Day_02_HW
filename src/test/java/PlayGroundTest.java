import Attractions.PlayGround;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PlayGroundTest {

    PlayGround playGround;

    @Before
    public void before(){
        playGround = new PlayGround("Duckling PlayGround", 5, 3, 15, 5);
    }

    @Test
    public void getName(){
        assertEquals("Duckling PlayGround", playGround.getName());
    }

    @Test
    public void getCost(){
        assertEquals(5,playGround.getCost());
    }

    @Test
    public void getMinAge(){
        assertEquals(3,playGround.getMinAge());
    }

    @Test
    public void getMaxAge(){
        assertEquals(15,playGround.getMaxAge());
    }

    @Test
    public void getRating(){
        assertEquals(5,playGround.getRating());
    }

    @Test
    public void setName(){
        playGround.setName("Tir nan Og");
        assertEquals("Tir nan Og",playGround.getName());
    }

    @Test
    public void setCost(){
        playGround.setCost(6);
        assertEquals(6,playGround.getCost());
    }

    @Test
    public void setMinAge(){
        playGround.setMinAge(4);
        assertEquals(4,playGround.getMinAge());
    }

    @Test
    public void setMaxAge(){
        playGround.setMaxAge(16);
        assertEquals(16,playGround.getMaxAge());
    }

    @Test
    public void setRating(){
        playGround.setRating(3);
        assertEquals(3,playGround.getRating());
    }



}
