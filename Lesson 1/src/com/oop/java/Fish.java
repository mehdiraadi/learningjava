package com.oop.java;

public class Fish extends Animal{
    public Fish(String type, int noOfLegs, String name, int age, String color) {
        super(type, noOfLegs, name, age, color);
    }

    public void swim() {

        System.out.println("I can swim");
    }
}
