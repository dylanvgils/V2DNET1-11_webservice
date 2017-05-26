package oreoStore;

import oreoStore.controller.SignInController;
import oreoStore.model.CustomerModel;
import oreoStore.view.SignInView;

/**
 * Created by dylan on 23-5-2017.
 */
public class OreoStore {
    public static void main(String[] args) {
        CustomerModel model = new CustomerModel();
        SignInView view = new SignInView(model);

        new SignInController(model, view);
    }
}
