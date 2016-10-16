package dao;

import model.User;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by lost on 16.10.2016.
 */
public class UserContainers {
    private Set<User> userSet;

    public UserContainers() {
        userSet = new HashSet();
    }

    public Set<User> getUserSet() {
        return userSet;
    }

    public void setUserSet(Set<User> userSet) {
        this.userSet = userSet;
    }

    public UserContainers(Set<User> userSet) {
        this.userSet = userSet;
    }

    public boolean containsUser(String name, String pass) {
        User user = new User(name, pass);
        return userSet.contains(user);
    }

    public boolean addUser(String name, String pass) {
        User user = new User(name, pass);
        if (!containsUser(name, pass)) {
            userSet.add(user);
            return true;
        } else return false;
    }

}
