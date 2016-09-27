package utils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by lost on 27.09.2016.
 */
public class IOutils {
    public IOutils() {
    }

    public byte[] toByteArr(Object obj) {
        ByteArrayOutputStream byteArr = new ByteArrayOutputStream();
        ObjectOutput out = null;

        try {
            out = new ObjectOutputStream(byteArr);
            out.writeObject(obj);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                out.close();
                byteArr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            byte[] resultBytes = byteArr.toByteArray();
            return resultBytes;
        }


    }

    public Object fromByteArr(byte[] arr) {
        ByteArrayInputStream byteArr = new ByteArrayInputStream(arr);
        ObjectInput in = null;
        Object object = null;
        try {
            in = new ObjectInputStream(byteArr);

            try {
                object = in.readObject();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                byteArr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return object;
    }
    public List<String> find(File dir, String keyWord) {
        File dirs = new File(dir.getAbsolutePath());
        List<String> list = new ArrayList<String>();
        File[] folderEntries = dirs.listFiles();

        for (File entry : folderEntries) {
            if (entry.isDirectory()==true){
                list.addAll(find(entry,keyWord));
            }
            if (entry.getName().contains(keyWord)==true){
                list.add(entry.getName());}
        }
        System.out.println(list);
        return list;
    }
    public void saveObjToFile(Object obj, String filePath) {
        ObjectOutputStream objectOutputStream;

        try {
            objectOutputStream= new ObjectOutputStream(new FileOutputStream(new File(filePath)));
            objectOutputStream.writeObject(obj);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public Object[] fromFile(String path){
        return null;
    }

    public boolean touch(String path) throws IOException {
        File file = new File(path);
        try {
            if (file.exists() == false) {
                file.createNewFile();
            } else {
                return false;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(file.exists());
        return file.exists();
    }


}
