package edu.hillel.lesson13.HomeWork13;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FileNavigator {

    private final Map<String, List<FileData>> fileMap;

    protected   FileNavigator(){
        fileMap = new HashMap<>();
    }

    protected void add(FileData file){
        if (!fileMap.containsKey(file.getPath())){
            fileMap.put(file.getPath(), new ArrayList<>());

        } else {System.out.println("Error: Path not found in FileNavigator.");}
        fileMap.get(file.getPath()).add(file);

    }

    protected List<FileData> find(String path){
        return  fileMap.getOrDefault(path, new ArrayList<>());
    }

    protected List<FileData> filterBySize(String path, long maxSize){
        List<FileData> result = new ArrayList<>();
        if(fileMap.containsKey(path)){
            for(FileData file : fileMap.get(path)){
                if(file.getSize() <= maxSize){
                    result.add(file);
                }
            }
        }
        return result;
    }

    protected void  remove(String path){
        fileMap.remove(path);
    }

    protected List<FileData> sortBySize(String path){
        List<FileData> files = fileMap.getOrDefault(path, new ArrayList<>());
        files.sort((a, b) -> Long.compare(a.getSize(), b.getSize()));
        return files;
    }
}
