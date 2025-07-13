package use_case.logout;

/**
 * The Input Data for the Logout Use Case.
 */
public class LogoutInputData {
    /** The username of the user who is logging out. */
    private final String username;

    /**
     * 1234566sefs.
     * @param username the current user’s name
     */
    public LogoutInputData(String username) {
        this.username = username;
    }

    /**
     * 123456.
     * @return the username that should be logged out
     */
    public String getUsername() {
        return username;
    }
}
