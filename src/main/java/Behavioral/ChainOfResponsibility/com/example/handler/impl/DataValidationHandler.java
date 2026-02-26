package Behavioral.ChainOfResponsibility.com.example.handler.impl;

import Behavioral.ChainOfResponsibility.com.example.handler.BaseHandler;
import Behavioral.ChainOfResponsibility.com.example.request.Request;


public class DataValidationHandler extends BaseHandler {

    @Override
    public void handle(Request request) {

        if (request.getPayload() == null || request.getPayload().isBlank()) {
            System.out.println("#DataValidationHandler :: Invalid Payload");
            return;
        }

        System.out.println("#DataValidationHandler :: Payload valid");
        this.forward(request);
    }

}
