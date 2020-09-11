package jave_basics;

import java.lang.reflect.Array;

public class Arrays {

    public static void main(String[] args){

        // this array is able to hold 100 values
        int [] values = new int[100];

        // remember that array is ZERO indexed so there's 99 slots
        values[0] = 1000;
        values[99] = 93432;

        // any array slot that isn't assigned prints 0;
        System.out.println(values[0]);


//        String [] words = new String[] {"My", "name", "is"};
//
//        System.out.println(words[2]);
//
//        Words can also be defined as below

        String [] words = new String[3];

        words[1] = "My";
        words[2] = "Name";
        words[3] = "is";

        System.out.println(words[1]);


    }
}
