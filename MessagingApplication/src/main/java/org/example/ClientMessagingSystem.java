package org.example;

import org.example.services.EmailService;
import org.example.services.MessageService;
import org.example.services.SmsService;
import org.example.services.TwitterService;

public class ClientMessagingSystem {
    private MessageService messageService ;

    public ClientMessagingSystem(MessageService messageService) {
        this.messageService = messageService;
    }

    public void send (String address, String message){
        boolean messageStatus = messageService.sendMessage(address,message);

        if (messageStatus == false)
            System.out.println("Sorry! Invalid Address. Please enter a correct address!");
    }
}
