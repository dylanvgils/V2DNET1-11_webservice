package oreoStore.Controller;

import oreoStore.view.RegisterView;
import oreoStore.view.SignInView;
import oreoStore.view.StoreView;

import java.awt.event.ActionEvent;

/**
 * Created by dylan on 24-5-2017.
 */
public class SignInController {
    private SignInView view;

    public SignInController(SignInView signInView) {
        view = signInView;

        // Event handlers
        view.addSignInListener(this::signIn);
        view.addRegisterListener(this::register);

        // Load the view
        view.init();
    }

    private void signIn(ActionEvent event) {
        view.close();
        new StoreController(new StoreView());
    }

    private void register(ActionEvent event) {
        view.close();
        new RegisterController(new RegisterView());
    }
}
