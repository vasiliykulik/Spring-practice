package spring;

import spring.model.User;

/**
 * Created by Стрела on 17.01.2017.
 */
public class UserService {
    public User load(String name){
        System.out.println("Create new user: " + name);
        return new User(name,"test");
    }
}
