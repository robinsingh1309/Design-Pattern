package Structural.composite.com.example.file;

import Structural.composite.com.example.fileSystem.FileSystem;


public class FileComponent implements FileSystem {

    private final String fileName;

    public FileComponent(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void ls() {
        System.out.println("File Name: " + this.fileName);
    }

}
