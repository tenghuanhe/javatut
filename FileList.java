package javaapplication3;

import java.io.*;

public class FileList {
    public static void main(String args[]) throws IOException{
        String dirname = "/Music";
        listDir(dirname);
    }
    
    public static void listDir(String dirname) {
        File f = new File(dirname);
        String s[] = f.list();
        int len = s.length;
        
        if (len == 0) {
            return;
        } else {
            for (int i = 0; i < s.length; i++) {
                File f1 = new File(dirname + "/" + s[i]);
                if (f1.isDirectory()) {
                    System.out.println(dirname + "/" + s[i] + " is a directory.");
                    listDir(dirname + "/" + s[i]);
                } else {
                    System.out.println(dirname + "/" + s[i] + " is a file.");
                }
            }
        }
        
    }
}
