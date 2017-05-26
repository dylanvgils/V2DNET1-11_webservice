package oreoStore.model;

import org.tempuri.IStoreService;
import org.tempuri.StoreService;

/**
 * Created by dylan on 24-5-2017.
 */
public abstract class Model {
    protected IStoreService storeService;

    public Model() {
        storeService = (new StoreService()).getBasicHttpBindingIStoreService();
    }
}
