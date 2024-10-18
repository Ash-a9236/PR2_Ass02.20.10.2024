package ash_a9236.example;
/*
 Class User:
         Represents a generic user in the system.
         Contains attributes:
             userID: Unique identifier for the user.
             name: Name of the user.

         Abstract method:
             displayInfo(): Displays information specific to each user type.
 */
public abstract class User {
    private final int userID;
    private final String name;


    protected User(int userID, String name) {
        this.name = name;
        this.userID = userID;
    }

    abstract void displayInfo(String name, int userID);

    public String getName() {
        return name;
    }

    public int getUserID() {
        return userID;
    }

    public String getNameViaID(int userID) {
        return getName();
    }
}
