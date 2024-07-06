package lld.designPatterns.composite.solution;

import java.util.List;

public class Directory implements FileSystem{
    String directoryName;
    List<FileSystem> fileSystemList;

    public Directory(String directoryName, List<FileSystem> fileSystemList) {
        this.directoryName = directoryName;
        this.fileSystemList = fileSystemList;
    }

    public void add(FileSystem fileSystem){
        fileSystemList.add(fileSystem);
    }

    @Override
    public void ls() {
        System.out.println("Directory Name "+ directoryName);
        for(FileSystem fileSystem: fileSystemList){
            fileSystem.ls();
        }
    }
}
