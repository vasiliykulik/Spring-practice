package spring.services;

import spring.model.User;

/**
 * Created by Стрела on 17.01.2017.
 */
public interface UserCache {
    User get(String name);
}
