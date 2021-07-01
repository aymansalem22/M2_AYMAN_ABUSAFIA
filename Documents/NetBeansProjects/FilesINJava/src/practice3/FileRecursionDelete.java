package practice3;

import java.io.File;

/**
 *
 * practice package fileRecursionDeletetask
 */
public class FileRecursionDelete {

    public static void main(String[] args) {
        File file = new File("D:\\test123");
        deleteFile(file);
    }

    
    
    
    public static void deleteFile(File f) {
        if (f.isFile()) {
            f.delete();
        } else {
            File[] childrenFiles = f.listFiles();
            for (File childFile : childrenFiles) {
                deleteFile(childFile);
            }
            f.delete();
        }
    }
}
