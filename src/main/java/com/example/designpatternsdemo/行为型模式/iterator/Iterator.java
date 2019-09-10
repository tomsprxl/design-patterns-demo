package com.example.designpatternsdemo.行为型模式.iterator;

public interface Iterator<Item> {

    Item next();

    boolean hasNext();
}
