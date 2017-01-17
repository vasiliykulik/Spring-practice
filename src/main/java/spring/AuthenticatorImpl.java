package spring;

import spring.model.User;

/**
 * Created by Стрела on 17.01.2017.
 */
public class AuthenticatorImpl implements Authenticator {
    @Override
    public boolean auth(User user, String password) {
        return user.getPassword().equals(password);
    }
}
