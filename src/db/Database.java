package db;

import java.util.List;
import java.util.Map;

import Exception.*;

/**
 * Created by lost on 27.09.2016.
 */
public interface Database {
    boolean insertfromDB(Map<String, List> map, String path);

    Map<String, List> selectFromDB(String path);

    boolean createDB(String path) throws DataBaseCreateException;
}
