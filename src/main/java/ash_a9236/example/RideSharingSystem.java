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

    public String displayDriverName(int userID) {
        for (Driver driver : drivers) {
            if (driver.getUserID() == userID) {
                return driver.getName();
            }
        }
        return "Driver not found";
    }

    public void addDriver(Driver driver) {
        drivers.add(driver);
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

    public String displayRiderName(int userID) {
        for (Rider rider : riders) {
            if (rider.getUserID() == userID) {
                return rider.getName();
            }
        }
        return "Rider not found";
    }

    public void addRider(Rider rider) {
        riders.add(rider);
    }

/*----------------------------------------------------------------------------------------------------------------------
    CLASS RELATED METHODS
----------------------------------------------------------------------------------------------------------------------*/

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
