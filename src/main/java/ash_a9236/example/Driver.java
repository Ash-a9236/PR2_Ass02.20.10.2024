package ash_a9236.example;

public class Driver extends User {


    protected Driver(String userID, String name) {
        super(userID, name);
    }

    @Override
    void displayInfo(String name, String userID) {
        System.out.printf("DRIVER\n    User ID : %d\n    Name : %d", userID, name);
    }
}
