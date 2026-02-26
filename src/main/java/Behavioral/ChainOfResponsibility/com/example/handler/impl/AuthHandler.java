package Behavioral.ChainOfResponsibility.com.example.handler.impl;

import Behavioral.ChainOfResponsibility.com.example.handler.BaseHandler;
import Behavioral.ChainOfResponsibility.com.example.request.Request;


public class AuthHandler extends BaseHandler {

    @Override
    public void handle(Request request) {

        if (request.getUser() == null) {
            System.out.println("#AuthHandler :: User is not Authenticated");
            return;
        }

        System.out.println("#AuthHandler :: Authenticated");
        this.forward(request);
    }

}
