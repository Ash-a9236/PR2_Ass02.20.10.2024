package ash_a9236.example;

public class Driver extends User {
/*
 Class Driver:
         Represents a driver in the system.
         Contains additional attributes:
             location: Current location of the driver.
             isAvailable: Boolean that tracks driver availability.
             vehicle: Type of vehicle the driver is using.

         Methods:
             acceptRide(): Changes isAvailable to false when the driver accepts a ride.
             completeRide(): Changes isAvailable back to true once the ride is completed.
             Override displayInfo(): Displays detailed driver information, including vehicle and
                availability.
 */

    protected Driver(String userID, String name) {
        super(userID, name);
    }

    @Override
    void displayInfo(String name, String userID) {
        System.out.printf("DRIVER\n    User ID : %d\n    Name : %d", userID, name);
    }
}
