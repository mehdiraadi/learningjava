package com.practice.strings.assignments;

public class ForLoopAssignment {

    public static void main(String[] args) {

        String str ="abcdefghijklmnopq";

        for (int i=str.length()-1; i>=0; i--){

            System.out.println(str.charAt(i));

        }
    }
}
