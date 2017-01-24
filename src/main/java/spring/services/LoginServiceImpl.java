package spring.services;

import spring.model.User;

/**
 * Created by Стрела on 17.01.2017.
 */
public class LoginServiceImpl implements LoginService {
private UserCache userCache;
    private Authenticator authenticator;

    @Override
    public boolean login(String name, String password) {
        User user = userCache.get(name);
        if(user == null){
            return false;
        }
        return authenticator.auth(user,password);
    }

    public void setUserCache(UserCache userCache) {
        this.userCache = userCache;
    }

    public void setAuthenticator(Authenticator authenticator) {
        this.authenticator = authenticator;
    }
}
