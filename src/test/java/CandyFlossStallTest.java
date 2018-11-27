import Stalls.CandyFlossStall;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CandyFlossStallTest {

    CandyFlossStall candy;

    @Before
    public void setup() {
        candy = new CandyFlossStall("Candy", "Ms Candy", "A2");
    }

    //    Inherited things tests

    @Test
    public void canGetName() {
        assertEquals("Candy", candy.getName());
    }

    @Test
    public void canGetRating() {
        assertEquals(10, candy.getRating());
    }

    @Test
    public void canGetOwnerName() {
        assertEquals("Ms Candy", candy.getOwnerName());
    }

    @Test
    public void canGetParkingSpot() {
        assertEquals("A2", candy.getParkingSpot());
    }

}
