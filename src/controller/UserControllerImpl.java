package controller;
import exception.PlayerNotFoundExeption;
import model.Player;
import model.User;
/**
 * Created by lost on 27.09.2016.
 */
public class UserControllerImpl implements UserController {

    @Override
    public boolean login(User user) {
        return false;
    }

    @Override
    public boolean startSession(User user) {
        return false;
    }

    @Override
    public boolean exitProgram(User user) {
        return false;
    }

    @Override
    public boolean stopActiveSession() {
        return false;
    }

    @Override
    public Player searchPlayer(String name) throws PlayerNotFoundExeption {

        return null;
    }
}
