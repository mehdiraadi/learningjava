package com.oop.java;

public class Bird extends Animal {

    public Bird(String type, int noOfLegs, String name, int age, String color) {
        super(type, noOfLegs, name, age, color);
    }

    public void fly(){
        System.out.println("I fly");
    }
}
