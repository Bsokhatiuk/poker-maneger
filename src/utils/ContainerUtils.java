package utils;

import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by lost on 27.09.2016.
 */
public class ContainerUtils<T> {
    private IOutils iOutils;
    private T t;
    public ContainerUtils() {
        iOutils=new IOutils();
    }
    public boolean saveContainertoFale(HashMap map,String path){
        if (!map.isEmpty()){
        Set<T> set=new HashSet<>();
        set=map.entrySet();
        for (T entry:set){
            try {
                iOutils.writeInto(path, entry.toString()+";");
                iOutils.writeInto(path,"\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return true;}

        return false;
    }


}
