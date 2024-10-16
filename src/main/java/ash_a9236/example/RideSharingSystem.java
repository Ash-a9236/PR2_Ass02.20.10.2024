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
    private ArrayList<Rider> Rider;
    private ArrayList<Driver> Driver;

    public RideSharingSystem() {
        Rider = new ArrayList<>();
        Driver = new ArrayList<>();
    }

//    private Rider findRider(String userID) {
//        for (Rider rider : riders) {
//            if (rider.get)
//        }
//    }

    /*
        private Student findStudent(int rollNumber) {
        for (Student student : students) {
            if (student.getRollNumber() == rollNumber) {
                return student;
            }
        }
        return null;
    }

    /**
     * Finds a book in the system through their unique ID
     * @param bookID the book's ID
     * @return the book if there is already a book with that ID in the system or null if there aren't
     */
   /* private Book findBook(String bookID) {
        for (Book book : books) {
            if (bookID.equalsIgnoreCase(book.getBookID())) {
                return book;
            }
        }
        return null;
    }
     */



}
