package ash_a9236.example;

import java.util.ArrayList;

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

    /**
     * Finds a rider in the system through their unique ID
     * @param userID the user ID
     * @return the rider if there is already one with the ID or null if there is none
     */
    private Rider findRider(String userID) {
        for (Rider rider : riders) {
            if (rider.getUserID() == userID) {
              return rider;
            }
        }
        return null;
    }



}
