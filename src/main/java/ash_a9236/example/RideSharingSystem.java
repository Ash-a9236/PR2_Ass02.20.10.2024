package ash_a9236.example;

import java.util.ArrayList;
import java.util.Scanner;

/*
 Class RideSharingSystem:
             Manages lists of drivers and riders, and handles ride requests.
             Contains attributes:
                 drivers: A list of Driver objects registered with the system.
                 riders: A list of Rider objects registered with the system.

             Methods:
                 addDriver(Driver driver): Adds a driver to the system.
                 addRider(Rider rider): Adds a rider to the system.
                 requestRide(String riderID): Finds the rider by ID and initiates a ride request, attempting
                    to match them with an available driver nearby.
                    Note: Your class should have a reasonable set of accessor and mutator methods, constructors,
                    equals method, and toString method, whether or not your program uses them. You can add other
                    methods if you wish.
3. Exception Handling:
     NoAvailableDriverException:
         Custom exception thrown when no available drivers can fulfill a ride request.
     RideRejectedException:
         Custom exception thrown when a driver rejects a ride request, and no other drivers are available.


 */
public class RideSharingSystem {
    private ArrayList<Rider> riders;
    private ArrayList<Driver> drivers;

    public RideSharingSystem() {
        riders = new ArrayList<>();
        drivers = new ArrayList<>();
    }

/*----------------------------------------------------------------------------------------------------------------------
    DRIVER-CLASS RELATED METHODS
----------------------------------------------------------------------------------------------------------------------*/
    /**
     * Finds a driver in the system through their unique ID
     * @param userID the user ID
     * @return the driver if there is one with the ID or null if there is none
     */
    private Driver findDriver(int userID) {
        for (Driver driver : drivers) {
            if (driver.getUserID() == userID) {
                return driver;
            }
        }
        return null;
    }

    private String displayDriverName(int userID) {
        for (Driver driver : drivers) {
            if (driver.getUserID() == userID) {
                return driver.getName();
            }
        }
        return "Driver not found";
    }

    public void addDriver() {
        Scanner console = new Scanner(System.in);
        System.out.println("Please input the new driver's ID : ");
        int userID = console.nextInt();
        String junkLine = console.nextLine();

        if (findDriver(userID) == null) {
            System.out.println("Please input the driver's full name : ");
            String name = console.nextLine();
            System.out.println("Please input your location : ");
            String location = console.nextLine();
            System.out.println("Please input your vehicle : ");
            String vehicle = console.nextLine();
            System.out.println("Are you available at the moment ? \n(Y/N)");
            String answer = console.next();
            Boolean isAvailable = false;

            if (answer.toUpperCase().equals("Y")) {
                isAvailable = true;
            }

            drivers.add(new Driver(userID, name, location, isAvailable, false, vehicle));
            System.out.println("Driver added successfully.");
        } else {
            System.out.println("Driver userID " + userID + "is already in the system.");
        }
    }
/*----------------------------------------------------------------------------------------------------------------------
    RIDER-CLASS RELATED METHODS
----------------------------------------------------------------------------------------------------------------------*/
    /**
     * Finds a rider in the system through their unique ID
     * @param userID the user ID
     * @return the rider if there is already one with the ID or null if there is none
     */
    private Rider findRider(int userID) {
        for (Rider rider : riders) {
            if (rider.getUserID() == userID) {
              return rider;
            }
        }
        return null;
    }

    private String displayRiderName(int userID) {
        for (Rider rider : riders) {
            if (rider.getUserID() == userID) {
                return rider.getName();
            }
        }
        return "Rider not found";
    }

    public void addRider() {
        Scanner console = new Scanner(System.in);
        System.out.println("Please input the new Rider's ID : ");
        int userID = console.nextInt();
        String junkLine = console.nextLine();

        if (findRider(userID) == null) {
            System.out.println("Please input the rider's full name : ");
            String name = console.nextLine();
            System.out.println("Please input the pickup location : ");
            String pickupLoc = console.nextLine();
            System.out.println("Please input the dropoff location : ");
            String dropoffLoc = console.nextLine();

            riders.add(new Rider(userID, name, pickupLoc, dropoffLoc));
            System.out.println("Rider added successfully.");
        } else {
            System.out.println("Rider userID " + userID + "is already in the system.");
        }
    }

/*----------------------------------------------------------------------------------------------------------------------
    CLASS RELATED METHODS
----------------------------------------------------------------------------------------------------------------------*/

  /*
    requestRide(String riderID): Finds the rider by ID and initiates a ride request, attempting to match them with an
    available driver nearby.

    Note: Your class should have a reasonable set of accessor and mutator methods, constructors,
    equals method, and toString method, whether or not your program uses them. You can add other
    methods if you wish.
   */

    public void requestRide(int riderID) {
        Scanner console = new Scanner(System.in);
        System.out.println("Attempting to match " + riderID + " with an available driver... ");
        for (Driver driver : drivers) {
            if (driver.getLocation().equals(findRider(riderID).getPickupLocation())) {
                //ask the driver if they want to take the ride
            }
        }
    }
}
