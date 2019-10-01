import attractions.Attraction;
import stalls.Stall;

import java.util.ArrayList;

public class ThemePark {

    private ArrayList<Attraction> attractions;
    private ArrayList<Stall> stalls;

    public ThemePark(ArrayList<Attraction> attractions, ArrayList<Stall> stalls){
        this.attractions = new ArrayList<Attraction>();
        this.stalls = new ArrayList<Stall>();
    }

    public int attractionCount() {
        return this.attractions.size();
    }

    public int stallCount() {
        return this.stalls.size();
    }

    public void addAttraction(Attraction attraction){
        this.attractions.add(attraction);
    }

    public void addStall(Stall stall){
        this.stalls.add(stall);
    }
}
