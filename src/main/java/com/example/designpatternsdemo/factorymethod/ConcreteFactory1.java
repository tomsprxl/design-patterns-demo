package com.example.designpatternsdemo.factorymethod;

import com.example.designpatternsdemo.simplefactory.ConcreteProduct1;
import com.example.designpatternsdemo.simplefactory.Product;

public class ConcreteFactory1 extends Factory {
    public Product factoryMethod() {
        return new ConcreteProduct1();
    }
}
