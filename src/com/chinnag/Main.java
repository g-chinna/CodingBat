package com.chinnag;

/**
 * @author Chinnaiah Gopineni
 */

public class Main {

    public static void main(String[] args) {

	    /** Call helloName() */
        System.out.println(new String1().helloName("James"));

        /** Call makeAbba() */
        System.out.println(new String1().makeAbba("Hi", "Hello"));

        /** Call makeTags() */
        System.out.println(new String1().makeTags("div", "footer"));

        /** Call makeOutWord() */
        System.out.println(new String1().makeOutWord("<<>>", "java"));

        /** Call extraEnd() */
        System.out.println(new String1().extraEnd("Hil"));

        /** Call fistTwo() */
        System.out.println(new String1().firstTwo("abc"));

        /** Call firstHalf() */
        System.out.println(new String1().firstHalf("HelloWord"));

        /** Call withoutEnd() */
        System.out.println(new String1().withoutEnd("hell"));

    }
}
