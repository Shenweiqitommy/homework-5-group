package use_case.logout;

/**
 * Output Data for the Logout Use Case.
 */
public class LogoutOutputData {

    private final String username;
    private final boolean useCaseFailed;

    /**
     * 1234556.
     * @param username      the user who just logged out
     * @param useCaseFailed true if logout failed (unused here), false otherwise
     */
    public LogoutOutputData(String username, boolean useCaseFailed) {
        this.username = username;
        this.useCaseFailed = useCaseFailed;
    }

    /**
     * 123455.
     * @return the username that was logged out
     */
    public String getUsername() {
        return username;
    }

    /**
     * 1234455.
     * @return true if the logout use case failed; false means success
     */
    public boolean isUseCaseFailed() {
        return useCaseFailed;
    }
}
