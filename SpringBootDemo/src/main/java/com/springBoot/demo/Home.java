package com.springBoot.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope(value="prototype")

public class Home {
    @Autowired // Direct Class object injection.
    private Internet internet;
    @Autowired // Injection using the interface. (That , implements two classes.)
    @Qualifier("class1")
    private Connection connection;
    Home(){
        System.out.println("Inside the Home Constructor.");
    }
    public void runHome(){
        internet.connect();
        connection.interConnect();
    }
}
