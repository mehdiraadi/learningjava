package com.oop.java;

public class Zoo {

    public static void main(String[] args) {
        //Animal tiger = new Animal("tiger",4, "jack",5, "yellow");

        //tiger.speak();

        //tiger.eat();

        Bird bird1 = new Bird("jh" ,2 ,"birdy", 2, "white" );


        //bird1.fly();
        bird1.eat();
        bird1.speak();

       Fish fish1 = new Fish("seabream", 0, "bream", 1 , "silver");

       fish1.eat();
       fish1.speak();
       fish1.swim();

       Chicken chick1= new Chicken ("birdtypr",2, "chicky", 3, "yellow");

       //chick1.fly();

        Sparrow sparrow1 =new Sparrow("spar",2,"sp",4, "blue");
         sparrow1.fly();

         Fish fish2 = new Fish("",2,"tu",2,"golden");
         fish2.swim();
         fish2.move();
    }






}
