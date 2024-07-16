package FactoryModels;

import model.User;

public class UserFactory {

    public User createUser(String name, String email, String password) {
        User user = new User(email, password);
        user.setName(name);
        return user;
    }
}
