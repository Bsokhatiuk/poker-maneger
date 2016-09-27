package view;

import db.Database;
import db.ImplDB;
import Exception.*;
import model.Player;
import utils.IOutils;

/**
 * Created by lost on 27.09.2016.
 */
public class main {
    public static void main(String[] args) {
        Database database= new ImplDB();
        IOutils iOutils=new IOutils();
        Player player =new Player("Вася");
        Player player1 =new Player("Вася1");
        Player player2 =new Player("Вася2");
        Player player3 =new Player("Вася3");
        iOutils.saveObjToFile(player,"C:\\Users\\lost\\Desktop\\exp\\newdatabasse.txt");

        try {
            database.createDB("C:\\Users\\lost\\Desktop\\exp\\newdatabasse.txt");
        } catch (DataBaseCreateException e) {
            e.printStackTrace();
        }

    }



}
