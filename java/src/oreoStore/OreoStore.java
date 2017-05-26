package oreoStore;

import oreoStore.Controller.SignInController;
import oreoStore.view.SignInView;

/**
 * Created by dylan on 23-5-2017.
 */
public class OreoStore {
    public static void main(String[] args) {
        new SignInController(new SignInView());
    }
}
