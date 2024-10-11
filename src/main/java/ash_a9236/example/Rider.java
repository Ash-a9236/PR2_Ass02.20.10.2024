package ash_a9236.example;

public class Rider extends User {


    protected Rider(String userID, String name) {
        super(userID, name);
    }

    @Override
    void displayInfo(String name, String userID) {
        System.out.printf("RIDER\n    User ID : %d\n    Name : %d", userID, name);
    }
}
