package com.example.designpatternsdemo.factorymethod;

import com.example.designpatternsdemo.simplefactory.ConcreteProduct2;
import com.example.designpatternsdemo.simplefactory.Product;

public class ConcreteFactory2 extends Factory {
    public Product factoryMethod() {
        return new ConcreteProduct2();
    }
}
