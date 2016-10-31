package java.db;

import java.utils.IOutils;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import java.exception.*;

/**
 * Created by lost on 27.09.2016.
 */
public class ImplDB implements Database {
    private IOutils iOutils;

    public ImplDB() {
        iOutils = new IOutils();
    }

    @Override
    public boolean insertfromDB(Map<String, List> map, String path) {
        return false;
    }

    @Override
    public Map<String, List> selectFromDB(String path) {
        return null;
    }

    @Override
    public boolean createDB(String path) throws DataBaseCreateException {
        try {
            iOutils.touch(path);
        } catch (IOException e) {
            throw new DataBaseCreateException("DB not created");

        }
        return false;
    }
}
