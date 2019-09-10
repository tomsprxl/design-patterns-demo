package com.example.designpatternsdemo.创建型模式.factorymethod;

import com.example.designpatternsdemo.创建型模式.simplefactory.Product;

public abstract class Factory {
    abstract public Product factoryMethod();

    public void doSomething() {
        Product product = factoryMethod();
        // do something with the product
    }
}
