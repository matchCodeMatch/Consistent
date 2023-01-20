package org.example;

import org.example.services.MessageService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the address.");
        String address = scanner.nextLine();

        System.out.println("Enter the message");
        String message = scanner.nextLine();



        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

//         For bean type dependency injection.  Give the id name of the bean.
//        MessageService messageService = (MessageService) context.getBean("messageService");

//         For annotation type dependency injection.  Give the class name as decapitalized. (First Letter alone).
        MessageService messageService = (MessageService) context.getBean("smsService");


        ClientMessagingSystem cms = new ClientMessagingSystem(messageService);
        cms.send(address,message);

//        System.out.println(context);

    }
}