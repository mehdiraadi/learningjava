package com.practice.strings.assignments;

public class Assignment1 {
    public static void main(String[] args) {

        String str= "We have a large inventory of things in our warehouse falling in"
                    + "The category:apparel and the more slightly"
                    +"more in demand category:makeup along with the category:furniture and ....";
     printCategories(str);
    }

    public static void printCategories(String str){
        int i=0;

        while(true) {

            int cat1 = str.indexOf("category:", i);

            if(cat1 == -1) {
                break;
            }

            int start = cat1 + 9;


            int end = str.indexOf(" ", start);


            System.out.println(str.substring(start,end));

            i= end + 1;
            //System.out.println(cat1);

            /*String cat11 = str.substring(77, 84);
            System.out.println(cat11);

            int cat2 = str.indexOf("makeup");

            String cat22 = str.substring(131, 137);
            System.out.println(cat22);

            int cat3 = str.indexOf("furniture");

            String cat33 = str.substring(163, 172);
            System.out.println(cat33);*/
            //count ++;

        }


    }
}
