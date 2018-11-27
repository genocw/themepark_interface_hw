import Attractions.Playground;
import Main.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {

    Playground playground;
    Visitor visitor;

    @Before
    public void setup() {
        playground = new Playground("Groundy");
    }

    //    Inherited things tests

    @Test
    public void canGetName() {
        assertEquals("Groundy", playground.getName());
    }

    @Test
    public void canGetRating() {
        assertEquals(10, playground.getRating());
    }

    //    Rollercoaster tests

    @Test
    public void visitorAllowedIfMeetsRequirements() {
        visitor = new Visitor(15, 150, 100);
        assertEquals(true, playground.isAllowedTo(visitor));
    }

    @Test
    public void visitorNotAllowedIfDoesntMeetRequirements() {
        visitor = new Visitor(16, 150, 100);
        assertEquals(false, playground.isAllowedTo(visitor));
    }

}
