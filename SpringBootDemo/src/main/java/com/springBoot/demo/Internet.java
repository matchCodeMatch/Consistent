package com.springBoot.demo;

import org.springframework.stereotype.Component;

@Component
public class Internet {
    public void connect(){
      System.out.println("Connection Established.");
    }
}
