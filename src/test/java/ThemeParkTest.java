import attractions.Attraction;
import org.junit.Before;
import org.junit.Test;
import stalls.Stall;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    ThemePark themePark;
    ArrayList<Attraction> attractions;
    ArrayList<Stall> stalls;


    @Before
    public void before(){
        attractions = new ArrayList<Attraction>();
        stalls = new ArrayList<Stall>();

        themePark = new ThemePark(attractions, stalls);
    }

    @Test
    public void startsEmpty(){
        assertEquals(0, themePark.stallCount());
        assertEquals(0, themePark.attractionCount());
    }

}
