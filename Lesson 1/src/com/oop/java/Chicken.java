package com.oop.java;

public class Chicken extends Bird {

    public Chicken(String type, int noOfLegs, String name, int age, String color) {
        super(type, noOfLegs, name, age, color);
    }
/*//overriding the method in bird
    @Override
    public void fly() {
        System.out.println("Can't fly");

    }*/
}
