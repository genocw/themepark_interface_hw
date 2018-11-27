import Attractions.Dodgem;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DodgemsTest {

    Dodgem dodgem;

    @Before
    public void setup() {
        dodgem = new Dodgem("Dodgy");
    }

    //    Inherited things tests

    @Test
    public void canGetName() {
        assertEquals("Dodgy", dodgem.getName());
    }

    @Test
    public void canGetRating() {
        assertEquals(10, dodgem.getRating());
    }

}
