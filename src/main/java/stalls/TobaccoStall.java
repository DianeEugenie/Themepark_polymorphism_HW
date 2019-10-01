package stalls;

import behaviours.IReviewed;
import behaviours.ISecurity;
import people.Visitor;

public class TobaccoStall extends Stall implements ISecurity, IReviewed {

    private int minAge;

    public TobaccoStall(String name, String ownerName, ParkingSpot parkingSpot, int rating) {
        super(name, ownerName, parkingSpot, rating);
        this.minAge = 18;
    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        return visitor.getAge() >= this.minAge;
    }

}
