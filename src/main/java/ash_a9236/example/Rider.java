package ash_a9236.example;

import java.util.List;
import java.util.Scanner;

/*
 Class Rider:
         Represents a rider in the system.
         Contains additional attributes:
             pickupLocation: Location where the rider requests to be picked up.
             dropOffLocation: Desired drop-off location.

         Methods:
         requestRide(List<Driver> drivers): Attempts to match the rider with an available driver based on
           location. Throws:
             NoAvailableDriverException: Thrown if no drivers are available for the requested ride.
             RideRejectedException: Thrown if the driver rejects the ride request.
         Override displayInfo(): Displays detailed rider information, including pickup and drop-off locations.
 */
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
    CLASS METHODS
----------------------------------------------------------------------------------------------------------------------*/

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
