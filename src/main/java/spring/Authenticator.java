package spring;

import spring.model.User;

/**
 * Created by Стрела on 17.01.2017.
 */
public interface Authenticator {
    boolean auth (User user, String password);
}
