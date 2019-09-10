package com.example.designpatternsdemo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DesignPatternsDemoApplicationTests {

    @Test
    public void contextLoads() {
        ArrayList<String> oldList = new ArrayList<>();
        oldList.add("0");
        oldList.add("1");
        oldList.add("2");
        oldList.add("3");
        oldList.add("4");
        oldList.add("5");
        oldList.add("6");
        oldList.add("7");
        oldList.add("8");
        oldList.add("9");
        ArrayList<String> newList = new ArrayList<>();
        newList.add("22");
        newList.add("33");
        newList.add("44");
        newList.add("55");
        newList.add("66");

        boolean b = oldList.addAll(2, newList);

        oldList.stream().forEach(System.out::println);

    }

}
