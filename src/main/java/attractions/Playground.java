package attractions;

import behaviours.ISecurity;
import people.Visitor;

public class Playground extends Attraction implements ISecurity {

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
