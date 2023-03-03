package org.example;

import java.lang.reflect.Field;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
//        ExampleClass example = new ExampleClass();
//
//        Class<?> clazz = example.getClass();
//        for (Field field : clazz.getDeclaredFields()) {
//            field.setAccessible(true);
//            if (field.get(example) == null) {
//                System.out.println("The field " + field.getName() + " is null");
//            }
//        }
        fun1();
    }
    public static void fun1() throws InterruptedException {
        System.out.println("Enter the name");
        scan.next();
        fun2();
    }
    public static void fun2() throws InterruptedException {
        TimeUnit.SECONDS.sleep(5);
        fun1();

    }
}

