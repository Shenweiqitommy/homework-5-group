package use_case.logout;

/**
 * The Logout Interactor.
 */
public class LogoutInteractor implements LogoutInputBoundary {
    private final LogoutUserDataAccessInterface userDataAccessObject;
    private final LogoutOutputBoundary logoutPresenter;

    /**
     * 123455.
     * @param userDataAccessInterface the DAO that tracks current user
     * @param logoutOutputBoundary    the presenter to call after logout
     */
    public LogoutInteractor(LogoutUserDataAccessInterface userDataAccessInterface,
                            LogoutOutputBoundary logoutOutputBoundary) {
        this.userDataAccessObject = userDataAccessInterface;
        this.logoutPresenter = logoutOutputBoundary;
    }

    @Override
    public void execute(LogoutInputData logoutInputData) {
        // 1. read who is logging out
        final String username = logoutInputData.getUsername();

        // 2. clear the “current user” in the DAO
        userDataAccessObject.setCurrentUsername(null);

        // 3. package up the output (username + success flag)
        final LogoutOutputData outputData = new LogoutOutputData(username, false);

        // 4. hand off to the presenter
        logoutPresenter.prepareSuccessView(outputData);
    }
}
