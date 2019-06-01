package com.basics;



public class ControlFlow {

    public static void main(String[] args) {

        boolean hungry = false;
        if (hungry == true) {

            System.out.println("go and eat");

        } else {
            System.out.println("go and sleep");
        }

        boolean pass = true;

        if (!pass) {

            System.out.println("I failed");

        } else {
            System.out.println("I passed");
        }

        int math = 4;

        if (math < 5) {
            System.out.println("I failed in math");
        } else if (math > 5) {

            System.out.println("passed with distinction");
        } else
            System.out.println("Just pass");

        int hugryrating = 7;
        if (!(hugryrating == 7)) {
            System.out.println("not valid");
        } else
            System.out.println("hungry valid");


        int month1 = 2;

        String theMonthIs;

        switch (month1) {

            case 1:
                theMonthIs = "january";
                break;

            case 2:
                theMonthIs = "feb";
                break;

            default:
                theMonthIs = "something";
        }
        System.out.println("The month is " +theMonthIs );
    }
}









