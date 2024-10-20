package ash_a9236.example;

public class Rider extends User {
    private String pickupLocation;
    private String dropoffLocation;

    protected Rider(int userID, String name, String pickupLocation, String dropoffLocation) {
        super(userID, name);
        this.pickupLocation = pickupLocation;
        this.dropoffLocation = dropoffLocation;
    }

/*----------------------------------------------------------------------------------------------------------------------
    @OVERRIDE FROM <USER>
----------------------------------------------------------------------------------------------------------------------*/
    /**
     * Displays on the console the riders information
     * @param name the rider's name
     * @param userID the rider's ID
     */
    @Override
    public void displayInfo(String name, int userID) {
        System.out.printf("RIDER\n    User ID : %d\n    Name : %s\n    Pickup : %s\n    Dropoff : %s",
                userID, name, pickupLocation, dropoffLocation);
    }

/*----------------------------------------------------------------------------------------------------------------------
    GETTERS AND SETTERS
----------------------------------------------------------------------------------------------------------------------*/
    public String getPickupLocation() {
        return pickupLocation;
    }

    public void setPickupLocation(String pickupLocation) {
        this.pickupLocation = pickupLocation;
    }

    public String getDropoffLocation() {
        return dropoffLocation;
    }

    public void setDropoffLocation(String dropoffLocation) {
        this.dropoffLocation = dropoffLocation;
    }

}
