package spring.services;

import spring.model.User;
import spring.services.Authenticator;

/**
 * Created by Стрела on 17.01.2017.
 */
public class SimpleAuthenticator implements Authenticator {
    @Override
    public boolean auth(User user, String password) {
        return user.getPassword().equals(password);
    }
}
