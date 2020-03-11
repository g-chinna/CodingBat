package com.chinnag;

/**
 * @author Chinnag
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

        /** Call comboString() */
        System.out.println(new String1().comboString("he", "hi"));

        /** Call nonStart() */
        System.out.println(new String1().nonStart("a", "vd"));

        /** Call left2() */
        System.out.println(new String1().left2("H"));

        /** Call right2() */
        System.out.println(new String1().right2("Hello"));

        /** Call theEnd() */
        System.out.println(new String1().theEnd("Hi", true));

        /** Call middleTwo() */
        System.out.println(new String1().middleTwo("Hellos"));

        /** Call endsLy() */
        System.out.println(new String1().endsLy("oddy"));

        /** Call nTwice() */
        System.out.println(new String1().nTwice("Hi", 1));

        /** Call twoChar() */
        System.out.println(new String1().twoChar("java", 3));

        /** Call middleThree() */
        System.out.println(new String1().middleThree("abcdef"));

        /** Call hasBad() */
        System.out.println(new String1().hasBad("xxbad") );
    }
}
