package ash_a9236.example;

public abstract class User {
    private final int userID;
    private final String name;


    protected User(int userID, String name) {
        this.name = name;
        this.userID = userID;
    }

    /**
     * Displays on the console the information of the user
     * @param name the input name
     * @param userID the input ID
     */
    abstract void displayInfo(String name, int userID);

    public String getName() {
        return name;
    }

    public int getUserID() {
        return userID;
    }

}
