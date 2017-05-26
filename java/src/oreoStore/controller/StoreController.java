package oreoStore.controller;

import oreoStore.view.StoreView;

import java.awt.event.ActionEvent;

/**
 * Created by dylan on 24-5-2017.
 */
public class StoreController {
    private StoreView view;

    public StoreController(StoreView storeView) {
        view = storeView;

        // Event Listeners
        view.addOrderListener(this::createOrder);
        view.addRefreshListener(this::refresh);

        // show view
        view.init();
    }

    private void refresh(ActionEvent event) {

    }

    private void createOrder(ActionEvent event) {

    }
}
