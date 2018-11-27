import Main.Visitor;
import Stalls.TobaccoStall;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {

    TobaccoStall tobacco;
    Visitor visitor;

    @Before
    public void setup() {
        tobacco = new TobaccoStall("Toby", "Miss Puff", "A3");
    }

    //    Inherited things tests

    @Test
    public void canGetName() {
        assertEquals("Toby", tobacco.getName());
    }

    @Test
    public void canGetRating() {
        assertEquals(10, tobacco.getRating());
    }

    @Test
    public void canGetOwnerName() {
        assertEquals("Miss Puff", tobacco.getOwnerName());
    }

    @Test
    public void canGetParkingSpot() {
        assertEquals("A3", tobacco.getParkingSpot());
    }

//    TobaccoStall tests

    @Test
    public void visitorAllowedIfMeetsRequirements() {
        visitor = new Visitor(18, 180, 100);
        assertEquals(true, tobacco.isAllowedTo(visitor));
    }

    @Test
    public void visitorNotAllowedIfDoesntMeetRequirements() {
        visitor = new Visitor(17, 180, 100);
        assertEquals(false, tobacco.isAllowedTo(visitor));
    }

}
