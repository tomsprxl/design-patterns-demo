package com.example.designpatternsdemo.行为型模式.chainofresponsibility;


public abstract class Handler {

    protected Handler successor;


    public Handler(Handler successor) {
        this.successor = successor;
    }


    protected abstract void handleRequest(Request request);
}
