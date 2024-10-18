package ash_a9236.example;

public class Project_Information {
/*
    Create a Java application that models a Ride-Sharing System.

------------------------------------------------------------------------------------------------------------
    EXPECTED OUTPUT :
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
    This application should manage
        - drivers
        - riders
        - ride requests
    using OOP concepts, including inheritance, abstract classes, polymorphism, and both built-in and custom exceptions.
    The application should be designed to handle
        - driver availability
        - match riders with drivers
        - manage ride statuses.

    In this system, drivers and riders interact to arrange rides. Drivers have attributes like their current location,
    vehicle type, and availability status, while Riders can request rides, specifying their pickup and drop-off
    locations. The system should match a rider with an available driver in the vicinity.

    The system should:
         Allow drivers to accept or reject rides based on availability.
         Match riders with available drivers nearby or inform them if no drivers are available.
         Use exceptions to handle cases such as no available drivers and ride request rejections.

    Requirements
        1. Class Structure and Relationships:
             You will design two main user types: Drivers and Riders, both of which are subclasses of an abstract
                User class.
             The RideSharingSystem class will act as the main system that manages drivers, riders, and ride requests.

        2. Classes and Methods:
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
             Class Rider:
                     Represents a rider in the system.
                     Contains additional attributes:
                         pickupLocation: Location where the rider requests to be picked up.
                         dropoffLocation: Desired drop-off location.

                     Methods:
                     requestRide(List<Driver> drivers): Attempts to match the rider with an available driver based on
                       location. Throws:
                         NoAvailableDriverException: Thrown if no drivers are available for the requested ride.
                         RideRejectedException: Thrown if the driver rejects the ride request.
                     Override displayInfo(): Displays detailed rider information, including pickup and drop-off locations.
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

        4. Main method to test the code:
            a) Create an object of the Ride-Sharing System to manage all drivers, riders, and ride requests throughout
                the test

            b) Create two driver objects and add them to the System.
                 Define each driver with a unique ID, name, location, and vehicle.
                 Set one driver’s availability to true (available) and the other to false (unavailable). This setup
                    will allow you to test how the system handles drivers with different availability statuses.
                 Use the system’s method for adding drivers to register them. This will make each driver accessible for
                    ride requests within the system.

            c) Create a rider object and add it to the system.
                 Define the rider with a unique ID, name, pickup location, and drop-off location. This rider will use
                    the system to request a ride.
                 Use the system’s method for adding riders to register the rider, enabling them to request a ride.

            d) Display each driver’s and rider’s information.
                 Use the display method provided in each class to print the details of the driver and rider objects.
                    Confirm that each driver’s availability and location are set correctly, and that the rider’s pickup
                    and drop-off locations are displayed accurately.

            e) Request a ride for the rider.
                 Use the rider’s unique ID to request a ride through the system. The system will check the location and
                    availability of drivers to match the rider with a suitable driver.
                 Verify that the system successfully matches the rider with an available driver located nearby, updating
                    the driver’s availability status once they accept the ride.

            f) Create a second rider object for additional testing (for Testing No Available Driver Scenario) and add it
                to the system.
                 Define another rider with a unique ID, pickup location, and drop-off location. Ensure this rider’s
                    pickup location matches the location of an unavailable driver.
                 Register this second rider in the system to allow them to make a ride request.

            g) Request a ride for the second rider.
                 Use the second rider’s unique ID to initiate a ride request. Since the driver at the specified pickup
                    location is unavailable, the system should throw an exception indicating that no drivers are available.




                Figuring out the TO DO list :
                - Figure out location (if locations = are the same = location close, we can accept the ride)
                - RequestRide()
                    - ask the driver to accept or not the ride..?
                    - put rider unavailable



*/
}
