package Behavioral.Command.com.example.main;

import Behavioral.Command.com.example.command.impl.AddTextCommand;
import Behavioral.Command.com.example.command.impl.DisplayTextCommand;
import Behavioral.Command.com.example.document.WordDocument;

public class CommandPatternDemo {

    public static void main(String args[]) {

        WordDocument wordDocument = WordDocument.getInstance();
        
        AddTextCommand text1 = new AddTextCommand("Robin", wordDocument);
        text1.execute();

        AddTextCommand text2 = new AddTextCommand("Singh", wordDocument);
        text2.execute();

        AddTextCommand text3 = new AddTextCommand(" is learning System Design Patterns.", wordDocument);
        text3.execute();

        DisplayTextCommand displayTextCommand = new DisplayTextCommand(wordDocument);
        displayTextCommand.execute();

    }

}
