import Attractions.Park;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParkTest {

    Park park;

    @Before
    public void setup() {
        park = new Park("Parky");
    }

    //    Inherited things tests

    @Test
    public void canGetName() {
        assertEquals("Parky", park.getName());
    }

    @Test
    public void canGetRating() {
        assertEquals(10, park.getRating());
    }

}
