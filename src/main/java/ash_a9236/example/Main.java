package ash_a9236.example;

/*______________________________________________________________________________________________________________________

Assignment 02
Written by Helene Rousseau, 6229734
For Programming 2 Section 00002 - Fall 2024

_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _
Explanation :

    This project is a ride-sharing system that links Riders and Drivers together. It checks if there are Drivers around
    the area of a rider when they request a ride and proposes the ride to the driver.

    The program also checks if the rider and the driver are in the system and throws the appropriate exception when
    something goes wrong.
______________________________________________________________________________________________________________________*/


import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws RideRejectedException, NoAvailableDriverException {

        RideSharingSystem system = new RideSharingSystem();
        Scanner console = new Scanner(System.in);

        //default Riders and Drivers to not have to add them each time

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

        //Actual main
        String userAns = "";
        do {
            System.out.println("_________________________________________________________________");
            System.out.println("            Welcome to the Ride-Sharing System !");
            System.out.println("                Thank you for trusting us");
            System.out.println("              ______________________________");
            System.out.println("                      1. Add Rider");
            System.out.println("                      2. Add Driver");
            System.out.println("                      3. Request a ride");
            System.out.println("                      4. Exit");
            System.out.println("_________________________________________________________________\n");

            userAns = console.nextLine();

            switch (userAns) {
                case "1":
                    system.manuallyAddRider();
                    break;

                case "2":
                    system.manuallyAddDriver();
                    break;

                case "3":
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
                    break;

                case "4":
                    System.out.println("Exiting program. Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

            // Prompt to continue or exit
            if (!userAns.equals("4")) {
                System.out.println("\nDo you want to continue? \nPress 0 to continue, 4 to exit: ");
                userAns = scanner.nextLine();
                if (userAns.equals("4")) {
                    System.out.println("Thank you for using the library Management System! " +
                            "\nWe hope to see you again soon!");
                    break;
                }
            }

        } while (!userAns.equals("4"));
    }
}
