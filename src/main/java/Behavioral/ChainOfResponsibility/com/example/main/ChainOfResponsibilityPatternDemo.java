package Behavioral.ChainOfResponsibility.com.example.main;

import Behavioral.ChainOfResponsibility.com.example.handler.BaseHandler;
import Behavioral.ChainOfResponsibility.com.example.handler.impl.AuthHandler;
import Behavioral.ChainOfResponsibility.com.example.handler.impl.AuthorizationHandler;
import Behavioral.ChainOfResponsibility.com.example.handler.impl.DataValidationHandler;
import Behavioral.ChainOfResponsibility.com.example.handler.impl.RateLimitHandler;
import Behavioral.ChainOfResponsibility.com.example.request.Request;


public class ChainOfResponsibilityPatternDemo {

    public static void main(String[] args) {

        Request request = new Request("user1234", "ADMIN", 95, "CoR Design pattern demo");

        BaseHandler authHandler = new AuthHandler();
        BaseHandler authorizationHandler = new AuthorizationHandler();
        BaseHandler rateLimitHandler = new RateLimitHandler();
        BaseHandler payloadHandler = new DataValidationHandler();

        authHandler.setNextHandler(authorizationHandler);
        authorizationHandler.setNextHandler(rateLimitHandler);
        rateLimitHandler.setNextHandler(payloadHandler);
        payloadHandler.setNextHandler(null);
        
        authHandler.handle(request);
    }

}
