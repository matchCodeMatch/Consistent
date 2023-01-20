package org.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {
    public static void main(String[] args) {
        String jsonString = "{\"name\":\"Mahesh\", \"age\":21}";

        GsonBuilder builder = new GsonBuilder();
        builder.setPrettyPrinting();

        Gson gson = builder.create();
//        Gson gson = new Gson();
        Student student = gson.fromJson(jsonString, Student.class);
        System.out.println("\nJSON to JAVA Object --");
        System.out.println("Name : "+student.getName() +"\nAge : "+ student.getAge());

        Student student1 = new Student();
        student1.setAge(21);
        student1.setName("Hope");

        String jsonStringFromClass  = gson.toJson(student1);
        System.out.println("\nJAVA Object to JSON --");
        System.out.println(jsonStringFromClass);

    }
}

class Student {
    private String name;
    private int age;
    public Student(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Student [ name: "+name+", age: "+ age+ " ]";
    }
}