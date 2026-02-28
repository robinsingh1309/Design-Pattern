package Structural.Composite.com.example.main;

import Structural.Composite.com.example.directory.Directory;
import Structural.Composite.com.example.file.FileComponent;

public class CompositePatternDemo {

    public static void main(String[] args) {
        
        // Created files
        FileComponent file1 = new FileComponent("Doc1.txt");
        FileComponent file2 = new FileComponent("Doc2.txt");
        FileComponent file3 = new FileComponent("Doc3.txt");
        
        // Created a directory
        Directory directory = new Directory("My Documents");
        
        // Added files in directory
        directory.addFileComponent(file1);
        directory.addFileComponent(file2);
        directory.addFileComponent(file3);
        
        // Created a subDirectory
        Directory subDirectory = new Directory("School Documents");
        
        // created subFiles
        FileComponent subFile1 = new FileComponent("subDoc1.txt");
        FileComponent subFile2 = new FileComponent("subDoc2.txt");
        FileComponent subFile3 = new FileComponent("subDoc3.txt");
        
        // Added subFiles in subDirectory
        subDirectory.addFileComponent(subFile1);
        subDirectory.addFileComponent(subFile2);
        subDirectory.addFileComponent(subFile3);

        // Added subDirectory inside 'My Documents' folder
        directory.addFileComponent(subDirectory);
        
        // Executing the command to list out the files
        directory.ls();
        
    }

}
