import attractions.*;
import org.junit.Before;
import org.junit.Test;
import stalls.*;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    ThemePark themePark;
    ArrayList<Attraction> attractions;
    ArrayList<Stall> stalls;
    Dodgems dodgems;
    Park park;
    Playground playground;
    RollerCoaster rollerCoaster;
    Stall candyflossStall;
    Stall iceCreamStall;
    Stall tobaccoStall;


    @Before
    public void before(){
        attractions = new ArrayList<Attraction>();
        stalls = new ArrayList<Stall>();
        dodgems = new Dodgems("Bumper Cars", 5);
        park = new Park("Leafy Meadows", 9);
        playground = new Playground("Fun Zone", 7);
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        candyflossStall = new CandyflossStall("Candy Land", "Harry Belafonte", ParkingSpot.A1, 8);
        iceCreamStall = new IceCreamStall("Dream Cones", "Vanilla Ice", ParkingSpot.A4, 8);
        tobaccoStall = new TobaccoStall("Jacks Drum", "Jack Jarvis", ParkingSpot.B1, 8);
        themePark = new ThemePark(attractions, stalls);
    }

    @Test
    public void startsEmpty(){
        assertEquals(0, themePark.stallCount());
        assertEquals(0, themePark.attractionCount());
    }

    @Test
    public void canAddAttraction(){
        themePark.addAttraction(dodgems);
        themePark.addAttraction(rollerCoaster);
        themePark.addAttraction(park);
        assertEquals(3, themePark.attractionCount());
    }

    @Test
    public void canAddStall(){
        themePark.addStall(candyflossStall);
        themePark.addStall(iceCreamStall);
        themePark.addStall(tobaccoStall);
        assertEquals(3, themePark.stallCount());
    }

}
