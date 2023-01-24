package com.springBoot.demo;

import org.springframework.stereotype.Component;

@Component("class1")
public class Class1 implements Connection{
    @Override
    public void interConnect() {
        System.out.println("Inside Class1");
    }
}
