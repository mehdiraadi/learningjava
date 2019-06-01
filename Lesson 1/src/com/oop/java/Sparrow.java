package com.oop.java;

public class Sparrow extends Bird implements Flyable{
    public Sparrow(String type, int noOfLegs, String name, int age, String color) {
        super(type, noOfLegs, name, age, color);
    }

    @Override
    public void fly() {
        System.out.println("sparrow flies");
    }
}
