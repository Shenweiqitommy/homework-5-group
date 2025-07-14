package app;

import javax.swing.JFrame;

/**
 * The Main class
 */
public class Main {
    /**
     * Builds and runs the CA architecture of the application.
     * @param args
     */
    public static void main(String[] args) {
        final AppBuilder appBuilder = new AppBuilder();

        // Now including the Logout use case in the builder chain:
        final JFrame application = appBuilder
                .addLoginView()
                .addSignupView()
                .addLoggedInView()
                .addSignupUseCase()
                .addLoginUseCase()
                .addChangePasswordUseCase()
                .addLogoutUseCase()
                .build();

        application.pack();
        application.setVisible(true);
    }
}
