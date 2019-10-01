package stalls;


public abstract class Stall {

    private String name;
    private String ownerName;
    private ParkingSpot parkingSpot;
    private int rating;

    public Stall(String name, String ownerName, ParkingSpot parkingSpot, int rating) {
        this.name = name;
        this.ownerName = ownerName;
        this.parkingSpot = parkingSpot;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    //added rating as IReviewed is implemented by all Stalls and Attractions
    //It doesn't give an error even though Stall does not have getRating()
    //I have just added it below - just in case;
    public int getRating() { return rating;}

    public String getOwnerName() {
        return ownerName;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }
}
