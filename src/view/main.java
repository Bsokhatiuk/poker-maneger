package view;

import db.Database;
import db.ImplDB;
import Exception.*;
/**
 * Created by lost on 27.09.2016.
 */
public class main {
    public static void main(String[] args) {
        Database database= new ImplDB();

        try {
            database.createDB("C:\\Users\\lost\\Desktop\\exp\\newdatabasse.txt");
        } catch (DataBaseCreateException e) {
            e.printStackTrace();
        }

    }
}
