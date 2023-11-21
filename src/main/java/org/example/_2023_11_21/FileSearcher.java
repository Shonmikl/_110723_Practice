package org.example._2023_11_21;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileSearcher {
    public static void main(String[] args) {
        String suffix = "mp3";
        List<File> fileList = new ArrayList<>();
        getFiles(new File("E:\\"), fileList, suffix);

        for (File f : fileList) {
            System.out.println(f.getAbsolutePath());
        }
    }

    private static void getFiles(File rootFile, List<File> fileList, String suffix) {

    }
}
