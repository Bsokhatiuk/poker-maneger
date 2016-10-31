package java.controller;

import java.dao.FileHandsContainers;
import java.dao.HandContainers;
import java.dao.PlayerContainers;
import java.dao.UserContainers;
import java.exception.ApplicationException;
import java.exception.InvalidPathExeption;
import java.exception.PlayerNotFoundExeption;
import java.model.Constants;
import java.model.Player;
import java.model.Session;
import java.model.User;

import java.io.*;

/**
 * Created by lost on 27.09.2016.
 */
public class UserControllerImpl implements UserController {
    private FileHandsContainers fileHandsContainers;
    private HandContainers handContainers;
    private PlayerContainers playerContainers;
    private UserContainers userContainers;


    public UserControllerImpl(FileHandsContainers fileHandsContainers, HandContainers handContainers, PlayerContainers playerContainers) {
        this.fileHandsContainers = fileHandsContainers;
        this.handContainers = handContainers;
        this.playerContainers = playerContainers;
    }

    @Override
    public boolean login(String userName, String pass) {
        return userContainers.containsUser(userName, pass);
    }

    @Override
    public void startSession(User user) throws ApplicationException {
        Session session = new Session(user);
        session.run();
    }

    @Override
    public void stopSession(Session session) throws ApplicationException {
        session.pause();
    }

    @Override
    public void closeSession(Session session) throws ApplicationException {
        session.close();
    }

    @Override
    public Player searchPlayer(String name) throws PlayerNotFoundExeption {
        Player player;
        player = playerContainers.getPlayer(name);
        if (player != null) {
            return player;
        } else {
            throw new PlayerNotFoundExeption("Player" + name + " not found!");
        }
    }

    @Override
    public boolean setFolderPath(String path) throws InvalidPathExeption {
        File file = new File(path);
        if (!file.isDirectory()) {
            Constants.FOLDER_PATH = path;
            return true;
        } else throw new InvalidPathExeption("Invalid path Folder");
    }
}
