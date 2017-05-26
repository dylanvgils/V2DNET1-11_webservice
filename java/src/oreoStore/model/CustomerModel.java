package oreoStore.model;

/**
 * Created by dylan on 24-5-2017.
 */
public class CustomerModel extends Model {
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean checkLogin() {
        return storeService.checkLogin(username, password);
    }
}
