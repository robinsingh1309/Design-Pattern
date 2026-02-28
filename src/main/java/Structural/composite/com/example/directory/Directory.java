package Structural.composite.com.example.directory;

import java.util.ArrayList;
import java.util.List;

import Structural.composite.com.example.fileSystem.FileSystem;


public class Directory implements FileSystem {

    private List<FileSystem> files;
    private final String directoryName;

    public Directory(String directoryName) {
        this.directoryName = directoryName;
        this.files = new ArrayList<FileSystem>();
    }

    public void addFileComponent(FileSystem file) {
        files.add(file);
    }

    @Override
    public void ls() {
        String result = String.format("Directory Name[%s]", directoryName);

        for (FileSystem fileSystem : files) {
            System.out.print(result + " --> ");

            fileSystem.ls();
        }
    }

}
