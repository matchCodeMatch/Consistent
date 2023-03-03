package org.example.services;

public class TwitterService implements MessageService{
    @Override
    public boolean sendMessage(String address, String message) {

        boolean messageStatus = false;

        if (address.contains("@") && message.length()<=50){
            System.out.println("The message is '"+message+"' send to "+address);
            messageStatus = true;
        }
        return messageStatus;
    }
}
