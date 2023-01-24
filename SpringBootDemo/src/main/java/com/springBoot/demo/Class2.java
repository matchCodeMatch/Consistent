package com.springBoot.demo;

import org.springframework.stereotype.Component;

@Component
public class Class2 implements Connection{
    @Override
    public void interConnect() {
        System.out.println("Inside Class2");
    }
}
