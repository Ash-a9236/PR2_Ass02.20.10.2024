package ash_a9236.example;

public class Driver extends User {
    private String location;
    private boolean isAvailable;
    private String vehicle;


    protected Driver(int userID, String name, String location, boolean isAvailable, String vehicle) {
        super(userID, name);
        this.location = location;
        this.isAvailable = isAvailable;
        this.vehicle = vehicle;
    }

/*----------------------------------------------------------------------------------------------------------------------
    @OVERRIDE FROM <USER>
----------------------------------------------------------------------------------------------------------------------*/
    /**
     * Displays on the console the Driver information
     * @param name the driver's name
     * @param userID the driver's ID
     */
    @Override
    public void displayInfo(String name, int userID) {
        System.out.println("DRIVER" +
                "\n    User ID : " + userID +
                "\n    Name : " + name +
                "\n    Vehicle : " + vehicle +
                "\n    Availability : " + (isAvailable ? "Available" : "Unavailable"));
    }

/*----------------------------------------------------------------------------------------------------------------------
    CLASS METHODS
----------------------------------------------------------------------------------------------------------------------*/

    /**
     * When a driver accepts a ride, his availability changes to false
     */
    public void acceptedRide() {
        isAvailable = false;
    }

    /**
     * puts a driver back into available when the ride is done
     * @return sets his availability back to false
     */
    public boolean completedRide() {
        return isAvailable = true;
    }


/*----------------------------------------------------------------------------------------------------------------------
    GETTERS AND SETTERS
----------------------------------------------------------------------------------------------------------------------*/
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public String getVehicle() {
        return vehicle;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }
}
