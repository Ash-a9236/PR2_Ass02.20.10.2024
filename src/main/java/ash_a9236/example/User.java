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
    public static int count = 1;
    private final String userID;
    private final String name;


    protected User(String userID, String name) {
        this.name = name;
        this.userID = name.substring(0, 3).toUpperCase() + count++;
    }

    abstract void displayInfo(String name, String userID);

    public String getName() {
        return name;
    }

    public String getUserID() {
        return userID;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        User.count = count;
    }
}
