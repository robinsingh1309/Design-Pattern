package Behavioral.Command.com.example.main;

import Behavioral.Command.com.example.command.impl.AddTextCommand;
import Behavioral.Command.com.example.command.impl.DisplayTextCommand;
import Behavioral.Command.com.example.document.WordDocument;
import Behavioral.Command.com.example.invoker.CommandInvoker;


public class CommandPatternDemo {

    public static void main(String args[]) {

        // Create Word Document
        WordDocument wordDocument = WordDocument.getInstance();

        // Create Invoker
        CommandInvoker commandInvoker = new CommandInvoker();

        // Add text to Word Document
        AddTextCommand text1 = new AddTextCommand("Statement 1 :: Learn", wordDocument);
        AddTextCommand text2 = new AddTextCommand("Statement 2 :: with me", wordDocument);
        AddTextCommand text3 = new AddTextCommand("Statement 3 :: Command Design Pattern", wordDocument);

        // Execute the commands
        commandInvoker.executeCommand(text1);
        commandInvoker.executeCommand(text2);
        commandInvoker.executeCommand(text3);

        // Display the content present in Word Document
        DisplayTextCommand displayTextCommand = new DisplayTextCommand(wordDocument);
        commandInvoker.executeCommand(displayTextCommand);

        // --------------------UNDO-----------------------
        commandInvoker.undo(); // to remove the displayTextCommand from stack
        commandInvoker.undo();

        wordDocument.display();

        // --------------------REDO-----------------------
        commandInvoker.redo();

        wordDocument.display();

    }

}
