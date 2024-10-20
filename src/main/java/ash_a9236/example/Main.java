package ash_a9236.example;



/*______________________________________________________________________________________________________________________

Assignment 02
Written by Helene Rousseau, 6229734
For Programming 2 Section 00002 - Fall 2024

_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _
Explanation :

    [
        .
        .
        .
    ]
______________________________________________________________________________________________________________________*/


import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws RideRejectedException, NoAvailableDriverException {

/*
TO DO
 CASES
    - add driver
    - add rider
    - request a ride (which rider, ask if pickup location is good, attempt to match)
    _____________________________________________________________
    | Welcome to the Ride-Sharing System!                       |
    | Thank you for trusting us.                                |
    | ------------------------------------                      |
    |                                                           |
    | Driver Details :                                          |
    |     Name : Alex                                           |
    |     Location : Downtown                                   |
    |     Vehicle : Toyota RAV4                                 |
    |     Availability : Available                              |
    |                                                           |
    | Rider Details :                                           |
    |     Name : John                                           |
    |     Pickup Location : Downtown                            |
    |     Drop-off Location : Airport YUL                       |
    |                                                           |
    | Attempting to match John with an available driver...      |
    |                                                           |
    | Alex has accepted the ride!                               |
    | Ride accepted by <Alex>...                                |
    | Driver status updated to <unavailable>                    |
    |                                                           |
    | Have a safe ride!                                         |
    | See you soon!                                             |
    |___________________________________________________________|

------------------------------------------------------------------------------------------------------------
 */
        RideSharingSystem system = new RideSharingSystem();
        Scanner console = new Scanner(System.in);
        system.addRider(new Rider(101, "John", "Downtown", "Airport YUL"));
        system.addRider(new Rider(102, "Sarah", "NDG", "Downtown"));
        system.addRider(new Rider(103, "Michael", "Plateau", "Westmount"));
        system.addRider(new Rider(104, "Emily", "Anjou", "Downtown"));
        system.addRider(new Rider(105, "David", "Downtown", "NDG"));
        system.addRider(new Rider(106, "Mia", "Plateau", "Anjou"));
        system.addRider(new Rider(107, "Ethan", "Westmount", "NDG"));
        system.addRider(new Rider(108, "Grace", "NDG", "Plateau"));
        system.addRider(new Rider(109, "Aiden", "Downtown", "Westmount"));
        system.addRider(new Rider(110, "Chloe", "Anjou", "Plateau"));

        system.addDriver(new Driver(201,"Alex", "Downtown", true, "Toyota RAV4"));
        system.addDriver(new Driver(202, "Sam", "NDG", false, "Honda Civic"));
        system.addDriver(new Driver(203, "Maria", "Plateau", true, "Ford Focus"));
        system.addDriver(new Driver(204, "James", "Westmount", true, "Nissan Altima"));
        system.addDriver(new Driver(205, "Sophia", "Anjou", false, "Chevrolet Malibu"));
        system.addDriver(new Driver(206, "Chris", "Downtown", true, "Subaru Impreza"));
        system.addDriver(new Driver(207, "Ella", "NDG", true, "Kia Soul"));
        system.addDriver(new Driver(208, "Liam", "Plateau", false, "Mazda3"));


        System.out.println("_________________________________________________________________");
        System.out.println("            Welcome to the Ride-Sharing System !");
        System.out.println("                Thank you for trusting us");
        System.out.println("              ______________________________");
        System.out.println("  Please enter your userID");
        int riderID = console.nextInt();

        try {
            if (!system.findRider(riderID).equals(null)) {
                system.findRider(riderID).displayInfo(system.findRider(riderID).getName(), riderID);
                System.out.println();
                system.requestRide(riderID);
            }
        }
        catch (NullPointerException npe) {
            System.out.println("No user ID matches");
        }

    }
}