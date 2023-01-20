package org.example.services;

import org.springframework.stereotype.Component;

@Component
public class SmsService implements MessageService{
    @Override
    public boolean sendMessage(String address, String message) {

        String regex = "\\d{10}";
        boolean messageStatus = false;

        if (address.matches(regex)){
            System.out.println("The message is '"+message+"' send to "+address);
            messageStatus = true;
        }
        return messageStatus;
    }
}
