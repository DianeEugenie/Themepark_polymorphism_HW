package attractions;

import behaviours.ISecurity;
import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.*;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor tallVisitor;
    Visitor shortVisitor;
    Visitor tooShort;
    Visitor tooYoung;
    Visitor tooShortANDTooYoung;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        tallVisitor = new Visitor(25, 201, 100.00);
        shortVisitor = new Visitor(25, 150, 100.00);
        tooShort = new Visitor(20, 140, 50);
        tooYoung = new Visitor(11, 146, 50);
        tooShortANDTooYoung = new Visitor(11,140, 20);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void canChargePrice(){
        assertEquals(8.40, rollerCoaster.defaultPrice(), 0.01);
    }

    @Test
    public void canChargeDouble(){
        assertEquals(16.80, rollerCoaster.priceFor(tallVisitor), 0.01);
        assertEquals(8.40, rollerCoaster.priceFor(shortVisitor), 0.01);
    }

    @Test
    public void isAllowedTo__IfAgeAND_ORHeightIsOverOrUnderMax(){
        assertTrue(rollerCoaster.isAllowedTo(shortVisitor)); // age 25 and height 150
        assertFalse(rollerCoaster.isAllowedTo(tooShort)); // height 140
        assertFalse(rollerCoaster.isAllowedTo(tooYoung)); // age 11
        assertFalse(rollerCoaster.isAllowedTo(tooShortANDTooYoung)); //age 11 and height 140;
    }

}
