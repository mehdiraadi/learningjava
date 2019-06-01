package com.basics;

import com.example.methoduse.MethodUtilsExample;

public class LearningMethods {
    public static void main(String[] args) {

        System.out.println("yes");
        System.out.println("sjfsk");

        printsomething("do something", "I love you", 5);
        printsomething(9);

        System.out.println(MyUtils.sumTwoNumbers(10,15));

        System.out.println(MethodUtilsExample.multiply(3,4));

        MyUtils myNonStatMethod= new MyUtils();
        System.out.println(myNonStatMethod.divide(16,4));

    }


    public static void printsomething(String a, String b, int c){

        System.out.println("bla bla bla");

        System.out.println(a.charAt(5));
        System.out.println(b.concat(a));
        System.out.println(b.compareTo(a));

    }

    public static void printsomething(int d) {
        System.out.println(d);

    }

}
