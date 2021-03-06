package java.controller;

import java.exception.ApplicationException;
import java.exception.InvalidPathExeption;
import java.exception.PlayerNotFoundExeption;
import java.model.Player;
import java.model.Session;
import java.model.User;

/**
 * Created by lost on 27.09.2016.
 */
public interface UserController {


    boolean login(String userName, String pass);

    void startSession(User user) throws ApplicationException;

    void stopSession(Session session) throws ApplicationException;

    void closeSession(Session session) throws ApplicationException;

    Player searchPlayer(String name) throws PlayerNotFoundExeption;

    boolean setFolderPath(String path) throws InvalidPathExeption;

}
