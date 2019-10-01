package attractions;

import behaviours.IReviewed;
import behaviours.ISecurity;
import people.Visitor;

public class Playground extends Attraction implements ISecurity, IReviewed {

    private int maxAge;

    public Playground(String name, int rating) {
        super(name, rating);
        this.maxAge = 15;
    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        return visitor.getAge() <= this.maxAge;
    }
}
