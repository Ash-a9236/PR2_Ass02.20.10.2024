package ash_a9236.example;

import java.util.ArrayList;
import java.util.Scanner;

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
    public Driver findDriver(int userID) {
        for (Driver driver : drivers) {
            if (driver.getUserID() == userID) {
                return driver;
            }
        }
        return null;
    }

    /**
     * Shows the name associated with the driver's ID
     * @param userID the input driver's user ID
     * @return the name of the associated driver
     */
    public String displayDriverName(int userID) {
        for (Driver driver : drivers) {
            if (driver.getUserID() == userID) {
                return driver.getName();
            }
        }
        return "Driver not found";
    }

    /**
     * Adds a driver to the system
     * @param driver the new driver
     */
    public void addDriver(Driver driver) {
        drivers.add(driver);
    }

    /**
     * Asks the user to manually add a driver to the system
     */
    public void manuallyAddDriver() {
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
            drivers.add(new Driver(userID, name, location, isAvailable, vehicle));
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
    public Rider findRider(int userID) {
        for (Rider rider : riders) {
            if (rider.getUserID() == userID) {
              return rider;
            }
        }
        return null;
    }

    /**
     * Shows the name associated with the rider's ID
     * @param userID the input rider's user ID
     * @return the name of the associated rider
     */
    public String displayRiderName(int userID) {
        for (Rider rider : riders) {
            if (rider.getUserID() == userID) {
                return rider.getName();
            }
        }
        return "Rider not found";
    }

        /**
         * Asks the user to manually add a driver to the system
         */
    public void manuallyAddRider() {
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

    /**
     * adds a rider to the system
     * @param rider the new rider
     */
    public void addRider(Rider rider) {
        riders.add(rider);
    }

/*----------------------------------------------------------------------------------------------------------------------
    CLASS RELATED METHODS
----------------------------------------------------------------------------------------------------------------------*/
    /**
     * Requests a ride to all the drivers in the system. If one is near, asks the driver if they want to take the drive.
     * @param riderID the rider requesting the ride
     * @throws NoAvailableDriverException when no driver is available in the area
     * @throws RideRejectedException when a driver rejected the ride request
     */
    public void requestRide(int riderID) throws NoAvailableDriverException, RideRejectedException {
        Scanner console = new Scanner(System.in);
        System.out.println("\nAttempting to match " + findRider(riderID) + " with an available driver... \n");
        for (Driver driver : drivers) {
            if (driver.getLocation().equals(findRider(riderID).getPickupLocation())) {
                System.out.println("RIDER \nDo you want to accept the ride ? \n(Y/N)");
                String answer = console.next();

                if (answer.toUpperCase().equals("Y")) {
                    System.out.println();

                    driver.displayInfo(driver.getName(), driver.getUserID());
                    System.out.println("\n" + driver.getName() + " has accepted the ride !\n" + "Ride accepted by <"
                            + driver.getName() + ">...");
                    driver.setAvailable(false);
                    System.out.println("Driver status updated to <unavailable>\n\nHave a safe ride\nSee you soon !");

                    System.out.println("\n.\n.\n.\nRide completed ? \n(Y/N)");
                    String ans = console.next();
                    if (ans.toUpperCase().equals("Y")) {
                        driver.completedRide();
                    }
                    return;
                } else if (answer.toUpperCase().equals("N")) {
                    throw new RideRejectedException("\n\nRide request rejected by " + displayRiderName(riderID) + "\n\n");
                }
            } else {
                throw new NoAvailableDriverException("\n\nNo available drivers at your location for the moment...\n" +
                        "Try again later !\n\n");
            }
        }
    }
}

