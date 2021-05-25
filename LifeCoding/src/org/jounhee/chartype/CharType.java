package org.jounhee.chartype;

public class CharType {

    /*
        This class is only for studying how java express data type of char, string

        1. Java distinguishes Character and String. The Character means only one character,
           The String type means the combine of several characters. so we need to enclose
           characters with single quotes.

        2. Strings should be enclosed in double quotes.
            -> If Strings be enclosed in single quotes, the error occurred
            -> But, if only one characters be enclosed in single quotes, it could be string

        3. What if we want to put some double quotes to the string enclosed in double quotes?
           In that case, we need to use escape character, ' \ '

        4. If we want to print out several strings, we can use operation '+" instead of writing several print statements

     */
    public static void main (String[] args) {

        // 1. The character should be enclosed in single quotes
        System.out.println('C');

        // 2. String should be enclosed in double quotes.
        System.out.println("String");

        // 3. If I want to put some special characters like double quotes to string which is enclosed in double quotes,
        //    we need to use escape character.
        System.out.println("It is \"Working\" ");

        // 4. We can use operation to print several string in one print statement.
        System.out.println("That" + " " + "is" + " " + "cool");

    }
}
