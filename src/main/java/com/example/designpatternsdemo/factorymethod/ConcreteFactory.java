package com.example.designpatternsdemo.factorymethod;

import com.example.designpatternsdemo.simplefactory.ConcreteProduct;
import com.example.designpatternsdemo.simplefactory.Product;

public class ConcreteFactory extends Factory {
    public Product factoryMethod() {
        return new ConcreteProduct();
    }
}
