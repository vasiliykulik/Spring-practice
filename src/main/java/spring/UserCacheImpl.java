package spring;

import spring.model.User;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Стрела on 17.01.2017.
 */
public class UserCacheImpl implements UserCache {
    private Map<String, User> cache = new HashMap<>();
    private UserService service;

    public void setCache(Map<String, User> cache) {
        this.cache = cache;
    }

    public User get(String name) {
        User user = cache.get(name);
        if (user == null) {

            user = service.load(name);
            cache.put(name, user);

        }
        return user;
    }

    public void setService(UserService service) {
        this.service = service;
    }
}
