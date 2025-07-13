package interface_adapter.logout;

import use_case.logout.LogoutInputBoundary;
import use_case.logout.LogoutInputData;

/**
 * The controller for the Logout Use Case.
 */
public class LogoutController {

    /** The logout interactor to invoke. */
    private final LogoutInputBoundary logoutUseCaseInteractor;

    /**
     * Constructs the controller.
     * @param logoutUseCaseInteractor the use-case interactor to call
     */
    public LogoutController(LogoutInputBoundary logoutUseCaseInteractor) {
        // Save the interactor in the instance variable
        this.logoutUseCaseInteractor = logoutUseCaseInteractor;
    }

    /**
     * Executes the Logout Use Case.
     * @param username the username of the user logging out
     */
    public void execute(String username) {
        // 1. Create the input data with the username
        final LogoutInputData inputData = new LogoutInputData(username);
        // 2. Invoke the interactor
        logoutUseCaseInteractor.execute(inputData);
    }
}
