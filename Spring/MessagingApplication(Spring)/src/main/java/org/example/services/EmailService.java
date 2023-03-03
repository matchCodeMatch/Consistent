package org.example.services;

import org.springframework.stereotype.Component;

@Component
public class EmailService implements MessageService{
    @Override
    public boolean sendMessage(String address, String message) {

        String regex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";

        boolean messageStatus = false;

        if (address.matches(regex)){
            System.out.println("The message is '"+message+"' send to "+address);
            messageStatus = true;
        }
        return messageStatus;
    }
}
