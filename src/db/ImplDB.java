package db;

import java.util.List;
import java.util.Map;

/**
 * Created by lost on 27.09.2016.
 */
public class ImplDB implements Database {
    @Override
    public boolean addtoDB(Map<String, List> map, String path) {
        return false;
    }

    @Override
    public Map<String, List> selectFromDB(String path) {
        return null;
    }

    @Override
    public boolean createDB() {
        return false;
    }
}
