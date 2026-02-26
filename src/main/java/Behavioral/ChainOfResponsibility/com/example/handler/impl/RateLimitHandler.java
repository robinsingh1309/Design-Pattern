package Behavioral.ChainOfResponsibility.com.example.handler.impl;

import Behavioral.ChainOfResponsibility.com.example.handler.BaseHandler;
import Behavioral.ChainOfResponsibility.com.example.request.Request;


public class RateLimitHandler extends BaseHandler {

    @Override
    public void handle(Request request) {

        if (request.getRequestCount() > 100) {
            System.out.println("#RateLimitHandler :: Rate Limit exceed");
            return;
        }

        System.out.println("#RateLimitHandler :: Within rate limit");
        this.forward(request);
    }

}
