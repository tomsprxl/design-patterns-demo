package com.example.designpatternsdemo.factorymethod;

import com.example.designpatternsdemo.simplefactory.Product;

public abstract class Factory {
    abstract public Product factoryMethod();

    public void doSomething() {
        Product product = factoryMethod();
        // do something with the product
    }
}
