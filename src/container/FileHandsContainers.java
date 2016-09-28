package container;

import java.io.File;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;

/**
 * Created by lost on 28.09.2016.
 */
public class FileHandsContainers {
    private Map<String, Long> fileMap;

    public FileHandsContainers() {
        fileMap = new HashMap();
    }

    public FileHandsContainers(Map<String, Long> fileMap) {
        this.fileMap = fileMap;
    }

    public Map<String, Long> getFileMap() {
        return fileMap;
    }

    public void setFileMap(Map<String, Long> fileMap) {
        this.fileMap = fileMap;
    }

    public boolean add(File file) {
        if (file.exists()) {
            fileMap.put(file.getName(), file.length());
            return true;
        }
        return false;
    }

    public boolean remove(String fileName) {
        if (fileMap.containsKey(fileName)) {
            fileMap.remove(fileName);
            return true;
        }
        return false;
    }

    public Set<String> getAll() {
        if (!fileMap.isEmpty()) {
            Set<String> allFileName = new HashSet<>();
            return allFileName = fileMap.keySet();
        }
        return null;
    }

}
