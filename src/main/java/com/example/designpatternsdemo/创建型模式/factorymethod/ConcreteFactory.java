package com.example.designpatternsdemo.创建型模式.factorymethod;

import com.example.designpatternsdemo.创建型模式.simplefactory.ConcreteProduct;
import com.example.designpatternsdemo.创建型模式.simplefactory.Product;

public class ConcreteFactory extends Factory {
    public Product factoryMethod() {
        return new ConcreteProduct();
    }
}
