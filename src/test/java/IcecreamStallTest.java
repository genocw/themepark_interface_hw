import Stalls.IcecreamStall;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IcecreamStallTest {

    IcecreamStall icecream;

    @Before
    public void setup() {
        icecream = new IcecreamStall("Icy", "Mr Icy", "A1");
    }

//    Inherited things tests

    @Test
    public void canGetName() {
        assertEquals("Icy", icecream.getName());
    }

    @Test
    public void canGetRating() {
        assertEquals(10, icecream.getRating());
    }

    @Test
    public void canGetOwnerName() {
        assertEquals("Mr Icy", icecream.getOwnerName());
    }

    @Test
    public void canGetParkingSpot() {
        assertEquals("A1", icecream.getParkingSpot());
    }

}
