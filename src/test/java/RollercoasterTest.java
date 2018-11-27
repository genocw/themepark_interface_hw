import Attractions.Rollercoaster;
import Main.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    Rollercoaster rollercaoster;
    Visitor visitor;

    @Before
    public void setup() {
        rollercaoster = new Rollercoaster("Rolly");
    }

//    Inherited things tests

    @Test
    public void canGetName() {
        assertEquals("Rolly", rollercaoster.getName());
    }

    @Test
    public void canGetRating() {
        assertEquals(10, rollercaoster.getRating());
    }

//    Rollercoaster tests

    @Test
    public void visitorAllowedIfMeetsRequirements() {
        visitor = new Visitor(12, 150, 100);
        assertEquals(true, rollercaoster.isAllowedTo(visitor));
    }

    @Test
    public void visitorNotAllowedIfDoesntMeetRequirements() {
        visitor = new Visitor(11, 150, 100);
        assertEquals(false, rollercaoster.isAllowedTo(visitor));
    }

}
