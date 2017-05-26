package oreoStore.controller;

import oreoStore.model.CustomerModel;
import oreoStore.view.RegisterView;
import oreoStore.view.SignInView;
import oreoStore.view.StoreView;
import org.tempuri.IStoreService;
import org.tempuri.StoreService;

import java.awt.event.ActionEvent;

/**
 * Created by dylan on 24-5-2017.
 */
public class SignInController {
    private CustomerModel model;
    private SignInView view;

    public SignInController(CustomerModel customerModel, SignInView signInView) {
        model = customerModel;
        view = signInView;

        // Event handlers
        view.addSignInListener(this::signIn);
        view.addRegisterListener(this::register);

        // Load the view
        view.init();
    }

    private void signIn(ActionEvent event) {
        System.out.println(model.getUsername());
        view.close();
        new StoreController(new StoreView());
    }

    private void register(ActionEvent event) {
        view.close();
        new RegisterController(new RegisterView());
    }
}
