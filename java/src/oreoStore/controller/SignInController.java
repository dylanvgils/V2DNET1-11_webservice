package oreoStore.controller;

import oreoStore.Service.Service;
import oreoStore.model.CustomerModel;
import oreoStore.model.StoreModel;
import oreoStore.view.RegisterView;
import oreoStore.view.SignInView;
import oreoStore.view.StoreView;

import java.awt.event.ActionEvent;

/**
 * Created by dylan on 24-5-2017.
 */
public class SignInController {
    private CustomerModel model;
    private SignInView view;

    public SignInController(SignInView signInView, CustomerModel customerModel) {
        // Register view and model
        view = signInView;
        model = customerModel;

        // Event handlers
        view.addSignInListener(this::signIn);
        view.addRegisterListener(this::register);

        // Load the view
        view.init();
    }

    private void signIn(ActionEvent event) {
        model.setUsername(view.getUsernameFieldValue());
        model.setPassword(view.getPasswordFieldValue());

        if (Service.checkLogin(model)) {
            view.close();
            new StoreController(new StoreView(), new StoreModel(model));
            return;
        }

        view.clearPasswordField();
        view.showError("Aanmeldfout", "De ingevoerde gegevens zijn onjuist.");
    }

    private void register(ActionEvent event) {
        view.close();
        new RegisterController(new RegisterView(), new CustomerModel());
    }
}
