package ash_a9236.example;
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

import java.util.Scanner;

public class Driver extends User {
    private String location;
    private boolean isAvailable;
    private boolean isDriving;
    private String vehicle;


    protected Driver(int userID, String name, String location, boolean isAvailable, boolean isDriving, String vehicle) {
        super(userID, name);
        this.location = location;
        this.isAvailable = isAvailable;
        this.isDriving = isDriving;
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
    void displayInfo(String name, int userID) {
        System.out.printf("DRIVER\n    User ID : %d\n    Name : %s\n    Vehicle : %s\n     Availability : %s",
                userID, name, vehicle, isAvailable);
    }



/*----------------------------------------------------------------------------------------------------------------------
    CLASS METHODS
----------------------------------------------------------------------------------------------------------------------*/
    public boolean acceptRide() {
        Scanner console = new Scanner(System.in);
        System.out.println("Do you want to accept the ride ? \n(Y/N)");
        String answer = console.next();
        if (answer.toUpperCase().equals("Y")) {
            isAvailable = false;
            return true;
        }
        return false;
    }

    public boolean Driving(){

        return true;
    }


    public boolean completedRide() {
        //TODO : if (ride == "completed") {}

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
