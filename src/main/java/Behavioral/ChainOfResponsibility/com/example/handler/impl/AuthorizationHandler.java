package Behavioral.ChainOfResponsibility.com.example.handler.impl;

import Behavioral.ChainOfResponsibility.com.example.handler.BaseHandler;
import Behavioral.ChainOfResponsibility.com.example.request.Request;


public class AuthorizationHandler extends BaseHandler {

    @Override
    public void handle(Request request) {

        if (!"ADMIN".equals(request.getUserRole())) {
            System.out.println("#AuthorizationHandler :: Access Denied");
            return;
        }

        System.out.println("#AuthorizationHandler :: Authorized");
        this.forward(request);
    }

}
