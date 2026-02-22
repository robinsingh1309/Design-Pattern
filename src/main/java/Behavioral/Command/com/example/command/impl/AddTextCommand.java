package Behavioral.Command.com.example.command.impl;

import Behavioral.Command.com.example.command.Command;
import Behavioral.Command.com.example.document.WordDocument;


public class AddTextCommand extends Command {

    // Fields

    private String textElement;
    private WordDocument wordDocument;


    // Constructors
    public AddTextCommand(String text, WordDocument document) {
        this.textElement = text;
        this.wordDocument = document;
    }


    // Abstract Methods
    // -------------------------------------------

    @Override
    public void execute() {
        wordDocument.add(textElement);
    }

}
