package com.oop.java;

public class Animal {

    String type;
    int noOfLegs ;
    String name ;
    int age;
    String color;

    public Animal(String type, int noOfLegs, String name, int age, String color){
        super();
        this.type =type;
        this.noOfLegs= noOfLegs;
        this.name=name;
        this.age =age;
        this.color =color;
    }

    public void speak (){
        System.out.println("I am a  "+ type);
        System.out.println("I have" + noOfLegs +" number of legs");
        System.out.println("I am "+ age +" years");
        System.out.println("My color is "+ color);
        System.out.println("My name is "+name);
    }


}
