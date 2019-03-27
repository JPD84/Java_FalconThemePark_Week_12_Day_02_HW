import Visitors.Visitor;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class VisitorTest {

    Visitor visitor1;
    Visitor visitor2;
    Visitor visitor3;
    Visitor visitor4;
    Visitor visitor5;
    Visitor visitor6;

    @Before
    public void before(){
        visitor1 = new Visitor("visitor1", 20, 178, 50);
        visitor2 = new Visitor("visitor2", 17, 165, 40);
        visitor3 = new Visitor("visitor3", 19, 172,55);
        visitor4 = new Visitor("visitor4", 23, 159,60);
        visitor5 = new Visitor("visitor5", 42, 172, 110);
        visitor6 = new Visitor("visitor6", 12, 145, 5);
    }

    @Test
    public void getVisitorNo(){
        assertEquals("visitor1",visitor1.getVisitorNo());
    }

    @Test
    public void getAge(){
        assertEquals(20, visitor1.getAge());
    }

    @Test
    public void  getVisitorHeight(){
        visitor1.getHeight();
        assertEquals(178, visitor1.getHeight());
    }

    @Test
    public void getMoney(){
        assertEquals(50, visitor1.getMoney());
    }

    @Test
    public void setAge(){
        visitor1.setAge(25);
        assertEquals(25,visitor1.getAge());
    }

    @Test
    public void setMoney(){
        visitor2.setMoney(55);
        assertEquals(55,visitor2.getMoney());
    }





}
