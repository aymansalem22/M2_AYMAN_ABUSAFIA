package practice3;

import java.io.File;

public class FileRecursionSize {

    public static void main(String[] args) {
        File file = new File("C:\\Test2\\ayman.txt");
        if (file.canRead()) {
            System.out.println("I can read this file " + file);
        }

        if (file.canWrite()) {
            System.out.println("I can Write this file " + file);
        } else {
            System.out.println("I can not Write this file" + file);
        }

        File file2 = new File("D:\\test123");
        try {
            file2.createNewFile();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("file " + file2 + " size= " + file2.length() / 1024);

        File file3 = new File("C:\\TEST10");
        file3.mkdir();

        File file4 = new File("C:\\TEST11\\A\\B");
        file4.mkdirs();

        System.out.println("***in short list of files***");
        String[] fileNames = file2.getParentFile().list();

        for (String fileName : fileNames) {
            System.out.println(fileName);
        }

        System.out.println("***show details more about files***");
        File[] files = file4.getParentFile().listFiles();
        for (File filees : files) {
            System.out.println(filees);
        }

        File file5 = new File("D:\\OneDrive - edy\\F\\coursejavaEgypt\\lectures");

        System.out.println(file5+" size= "+formatSize(getSize(file5)));
    }

    public static long getSize(File f) {
        if (f.isFile()) {
            return f.length();
        }

        File[] childrenFiles = f.listFiles();
        long size = 0;
        for (File childFile : childrenFiles) {
            size += getSize(childFile);
        }

        return size;

    }

    public static String formatSize(long size){
    final long GB=1024*1024*1024;
    final long MB=1024*1024;
    final long KB=1024;
    
    return (size>GB)?(size/GB)+" GB"
            :(size>MB)?size/MB+" MB"
            :(size>KB)?(size/KB)+" KB"
            :size+" Bytes";
        
        
    }
}
