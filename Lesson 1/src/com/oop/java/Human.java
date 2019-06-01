package com.oop.java;

public class Human {

    int age ;
    String eye_color;
    String name ;
    int tall;



    public Human (int age ,String eye_color, String name, int tall){

        super();
        this.age =age;
        this.eye_color= eye_color;
        this.name =name;
        this.tall=tall;

    }

    public void speak() {
        System.out.println("My name is "+ name);
        System.out.println("I am" + age + "years old");
        System.out.println("I am " + tall + "cm long");
        System.out.println("My eye color is "+ eye_color);
    }

    public void walk(){
        System.out.println("I can walk");

    }

    public void swim(){
        System.out.println("I can swim");

    }
}

