package com.example.designpatternsdemo.simplefactory;

/**
 * 描述:
 *
 * @author xuliang
 * @create 2019-09-09 16:48
 */
public class Client002 {
    public static void main(String[] args) {
        SimpleFactory simpleFactory = new SimpleFactory();
        Product product = simpleFactory.createProduct(1);
        // do something with the product
    }

}