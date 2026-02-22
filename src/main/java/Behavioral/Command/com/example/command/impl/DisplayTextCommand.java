package Behavioral.Command.com.example.command.impl;

import Behavioral.Command.com.example.command.Command;
import Behavioral.Command.com.example.document.WordDocument;


public class DisplayTextCommand extends Command {

    // Fields

    private WordDocument wordDocument;


    // Constructors
    public DisplayTextCommand(WordDocument document) {
        this.wordDocument = document;
    }


    // Abstract Methods
    // -------------------------------------------

    @Override
    public void execute() {
        wordDocument.display();
    }

}
