package attractions;

import behaviours.ISecurity;
import behaviours.ITicketed;
import people.Visitor;

public class RollerCoaster  extends Attraction implements ITicketed, ISecurity {

    private double price;
    private int minAge;
    private int minHeight;

    public RollerCoaster(String name, int rating) {
        super(name, rating);
        this.price = 8.40;
        this.minAge = 12;
        this.minHeight = 145;
    }


    @Override
    public double defaultPrice() {
        return this.price;
    }

    @Override
    public double priceFor(Visitor visitor) {
        if (visitor.getHeight() > 200) {
            return this.price * 2;
        } else {
            return this.defaultPrice();
        }
    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        return (visitor.getAge() >= this.minAge && visitor.getHeight() > this.minHeight);
    }
}
