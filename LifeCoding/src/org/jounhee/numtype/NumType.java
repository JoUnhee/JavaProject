package org.jounhee.numtype;

public class NumType {
/*
    This Class is for studying how java express data type of Number

    1. JAVA recognize the number without apostrophe as data type of number, not the String
    2. When try to multiply number, use asterisk
    3. When try to divide number, use slash
 */
    public static void main(String[] args) {

        int a = 2;
        int b = 1;
        int c;

        System.out.println("Hello World for unhee!");

        c = a * b;
        System.out.println("the value of a * b = " + c);

        c = c / a;
        System.out.println("the value of c (2) / a = " + c);
    }


}
