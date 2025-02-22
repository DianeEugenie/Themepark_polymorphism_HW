package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class DodgemTest {

    Dodgems dodgems;
    Visitor oldVisitor;
    Visitor youngVisitor;

    @Before
    public void setUp() throws Exception {
        dodgems = new Dodgems("Bumper Cars", 5);
        oldVisitor = new Visitor(80, 201, 100.00);
        youngVisitor = new Visitor(10, 150, 100.00);
    }


    @Test
    public void hasName() {
        assertEquals("Bumper Cars", dodgems.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(5, dodgems.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, dodgems.getVisitCount());
    }

    @Test
    public void canChargePrice(){
        assertEquals(4.50, dodgems.defaultPrice(), 0.01);
    }

    @Test
    public void canChargeHalf(){
        assertEquals(2.25, dodgems.priceFor(youngVisitor), 0.01);
        assertEquals(4.50, dodgems.priceFor(oldVisitor), 0.01);
    }


}
