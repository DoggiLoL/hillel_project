package edu.hillel.lesson13.HomeWork13;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        FileNavigator navigator = new FileNavigator();

        FileData file1 = new FileData("file1.txt",100,"/path/to/file");
        FileData file2 = new FileData("file2.txt",200,"/path/to/file");
        FileData file3 = new FileData("file3.txt",150,"/another/path");

        navigator.add(file1);
        navigator.add(file2);
        navigator.add(file3);

        List<FileData> filesAtPath = navigator.find("/path/to/file");
        System.out.println("Files at /path/to/file");
        for(FileData file : filesAtPath){
            System.out.println(file.getName());
        }

        List<FileData> filteredFiles = navigator.filterBySize("/path/to/file", 175);
        System.out.println("Files at /path/to/file with size <= 175: ");
        for (FileData file : filteredFiles){
            System.out.println(file.getName());
        }

        navigator.remove("/path/to/file");
        List<FileData> removedFiles = navigator.find("/path/to/file");
        System.out.println("Files at /path/to/filter after removal:");
        for(FileData file: removedFiles){
            System.out.println(file.getName());
        }
    }
}
