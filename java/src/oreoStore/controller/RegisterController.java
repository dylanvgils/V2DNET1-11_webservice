package oreoStore.controller;

import oreoStore.service.Service;
import oreoStore.model.CustomerModel;
import oreoStore.view.RegisterView;
import oreoStore.view.SignInView;

import java.awt.event.ActionEvent;

/**
 * Created by dylan on 24-5-2017.
 */
public class RegisterController {
    private CustomerModel model;
    private RegisterView view;

    public RegisterController(RegisterView registerView, CustomerModel customerModel) {
        // Register view and model
        view = registerView;
        model = customerModel;

        // Event listeners
        view.addRegisterListener(this::register);
        view.addCancelListener(this::cancel);

        // Show view
        view.init();
    }

    private void register(ActionEvent event) {
        model.setUsername(view.getUsernameFieldValue());

        if (model.getUsername().isEmpty()) {
            view.showError("Registratiefout", "Het gebruikersnaam veld mag niet leeg zijn.");
            return;
        }

        if (Service.registerCustomer(model) != null) {
            view.confirmRegistration(model.getUsername(), model.getPassword());
            view.close();
            new SignInController(new SignInView(), new CustomerModel());
            return;
        }

        view.resetUsernameField();
        view.showError("Registratiefout", "Helaas is deze gebruikersnaam is al in gebruik.");
    }

    private void cancel(ActionEvent event) {
        view.close();
        new SignInController(new SignInView(), new CustomerModel());
    }
}
