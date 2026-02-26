package Behavioral.ChainOfResponsibility.com.example.handler;

import Behavioral.ChainOfResponsibility.com.example.request.Request;


public abstract class BaseHandler {

    // Fields
    protected BaseHandler nextHandler;


    // Methods
    // --------------------------------------------------

    public abstract void handle(Request request);

    protected void forward(Request request) {
        if (nextHandler != null) {
            nextHandler.handle(request);
        }
    }


    // Setters
    // --------------------------------------------------

    public void setNextHandler(BaseHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

}
