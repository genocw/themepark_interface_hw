import Attractions.Rollercoaster;
import Interfaces.IReviewed;
import Main.ThemePark;
import Stalls.TobaccoStall;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    ThemePark themePark;
    Rollercoaster rollercoaster;
    TobaccoStall tobaccoStall;

    @Before
    public void setup() {
        themePark = new ThemePark();
        rollercoaster = new Rollercoaster("Rolly");
        tobaccoStall = new TobaccoStall("Toby", "Miss Puff", "A5");
    }

    @Test
    public void canGetAllReviewed() {
        assertEquals(0, themePark.getAllReviewed().size());
    }

    @Test
    public void canAddNewReviewed() {
        themePark.addReviewed(rollercoaster);
        assertEquals(1, themePark.getAllReviewed().size());
    }

    @Test
    public void tobaccoStallIsAlsoOfTypeIReviewed() {
        themePark.addReviewed(tobaccoStall);
        assertEquals(1, themePark.getAllReviewed().size());
    }

}
