package org.example._2023_11_21;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class FileSearcher {
    private ExecutorService executorService;

    public FileSearcher(int tc) {
        this.executorService = Executors.newFixedThreadPool(tc);
    }

    public void shutDown() throws InterruptedException {
        executorService.shutdown();
        executorService.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
    }

    public static void main(String[] args) throws InterruptedException {
        long start = System.currentTimeMillis();
        FileSearcher fileSearcher = new FileSearcher(4);
        String suffix = "mp3";
        List<File> fileList = new ArrayList<>();
        fileSearcher.getFiles(new File("E:\\"), fileList, suffix);
        fileSearcher.shutDown();


        for (File f : fileList) {
            System.out.println(f.getAbsolutePath());
        }

        System.out.println("COUNT: " + (System.currentTimeMillis() - start) + " time(ms)");
    }

    private void getFiles(File rootFile, List<File> fileList, String suffix) {
        if (rootFile.isDirectory()) {
            System.out.println("searching........ ---> " + rootFile.getAbsolutePath());
            File[] files = rootFile.listFiles();
            if (files != null) {
                for (File f : files) {
                    if (f.isDirectory()) {
                        executorService.submit(() -> getFiles(f, fileList, suffix));
                    } else {
                        if (f.getName().toLowerCase().endsWith(suffix)) {
                            synchronized (fileList) {
                                fileList.add(f);
                            }
                        }
                    }
                }
            }
        }
    }
}