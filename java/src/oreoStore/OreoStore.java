package oreoStore;

import oreoStore.controller.SignInController;
import oreoStore.model.CustomerModel;
import oreoStore.view.SignInView;

/**
 * Created by dylan on 23-5-2017.
 */
public class OreoStore {
    public static void main(String[] args) {
        new SignInController(new SignInView(), new CustomerModel());
    }
}
