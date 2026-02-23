package Behavioral.Command.com.example.invoker;

import java.util.Stack;

import Behavioral.Command.com.example.command.Command;


public class CommandInvoker {

    // Fields

    private Stack<Command> commandStack = new Stack<Command>();
    private Stack<Command> redoStack = new Stack<Command>();


    // Constructors


    // Methods
    // -------------------------------------------

    public void undo() {
        if (!commandStack.isEmpty()) {
            Command lastCommand = commandStack.pop();
            lastCommand.undo();
            redoStack.push(lastCommand);
        }
    }

    public void redo() {
        if (!redoStack.isEmpty()) {
            Command lastCommand = redoStack.pop();
            lastCommand.execute();
            commandStack.push(lastCommand);
        }
    }

    public void executeCommand(Command command) {
        command.execute();
        commandStack.push(command);
        redoStack.clear();
    }


}
