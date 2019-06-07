package com.oop.java;

public class Bird extends Animal {

    public Bird(String type, int noOfLegs, String name, int age, String color) {
        super(type, noOfLegs, name, age, color);
    }

    @Override
    public void move() {
        System.out.println("I can move");
    }
}
