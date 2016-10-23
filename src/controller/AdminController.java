package controller;

import model.User;

import java.lang.reflect.Field;

/**
 * Created by lost on 23.10.2016.
 */
public interface AdminController {
    boolean createNewUser (User user);
    boolean deleteNewUser (User user);
    boolean changeNewUser (User user, Field field, String newValue);


}
