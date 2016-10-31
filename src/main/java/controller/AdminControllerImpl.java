package java.controller;

import java.dao.UserContainers;
import java.model.User;

import java.lang.reflect.Field;

/**
 * Created by lost on 23.10.2016.
 */
public class AdminControllerImpl implements AdminController {
    private UserContainers userContainers;

    public AdminControllerImpl(UserContainers userContainers) {
        this.userContainers = userContainers;
    }


    @Override
    public boolean createNewUser(User user) {

        return false;
    }

    @Override
    public boolean deleteNewUser(User user) {
        return false;
    }

    @Override
    public boolean changeNewUser(User user, Field field, String newValue) {
        return false;
    }
}
