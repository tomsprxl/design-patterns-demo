package com.example.designpatternsdemo.创建型模式.factorymethod;

import com.example.designpatternsdemo.创建型模式.simplefactory.ConcreteProduct2;
import com.example.designpatternsdemo.创建型模式.simplefactory.Product;

public class ConcreteFactory2 extends Factory {
    public Product factoryMethod() {
        return new ConcreteProduct2();
    }
}
