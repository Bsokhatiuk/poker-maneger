package controller;

import exception.PlayerNotFoundExeption;
import model.Player;
import model.User;

/**
 * Created by lost on 27.09.2016.
 */
public interface UserController {
    boolean login(User user);

    boolean startSession(User user);

    boolean exitProgram(User user);

    boolean stopActiveSession();

    Player searchPlayer (String name) throws PlayerNotFoundExeption;

}
