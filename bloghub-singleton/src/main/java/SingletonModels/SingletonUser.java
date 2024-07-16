package SingletonModels;

import model.User;

public class SingletonUser {

    private static SingletonUser instance;
    private User user;

    private SingletonUser() {
        user = new User();
        user.setName("Hakan Ayaz");
        user.setEmail("hakanayaz9844@outlook.com");
    }

    public static SingletonUser getInstance() {
        if (instance == null) {
            instance = new SingletonUser();
        }
        return instance;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
