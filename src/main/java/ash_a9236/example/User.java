package ash_a9236.example;

public abstract class User {
    private final int userID;
    private final String name;


    protected User(int userID, String name) {
        this.name = name;
        this.userID = userID;
    }


/*----------------------------------------------------------------------------------------------------------------------
    CLASS METHODS
----------------------------------------------------------------------------------------------------------------------*/

    abstract void displayInfo(String name, int userID);

/*----------------------------------------------------------------------------------------------------------------------
    GETTERS AND SETTERS
----------------------------------------------------------------------------------------------------------------------*/

    public String getName() {
        return name;
    }

    public int getUserID() {
        return userID;
    }

}
