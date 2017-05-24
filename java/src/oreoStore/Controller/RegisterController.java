package oreoStore.Controller;

import oreoStore.view.RegisterView;
import oreoStore.view.SignInView;

import java.awt.event.ActionEvent;

/**
 * Created by dylan on 24-5-2017.
 */
public class RegisterController {
    private RegisterView view;

    public RegisterController(RegisterView registerView) {
        view = registerView;

        // Event listeners
        view.addRegisterListener(this::register);

        // Show view
        view.init();
    }

    private void register(ActionEvent event) {
        view.confirmRegistration();
        view.close();
        new SignInController(new SignInView());
    }
}
