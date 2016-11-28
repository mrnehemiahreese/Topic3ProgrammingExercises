

import java.util.Scanner;
public class Exercise18p25 {

    public static void main(String[] args) {

        System.out.print("Enter a string: ");
        String s = new Scanner(System.in).next();
        System.out.println("All possible permutations of " + s + " are: ");

        displayPermutation(s);
    }

    public static void displayPermutation(String s) {
    	displayPermutation("", s);
    }

    public static void displayPermutation(String string1, String string2) {

        if (string2.length() == 0) {
            System.out.println(string1);
        } else {
            for (int i = 0; i < string2.length(); i++) {
            	displayPermutation(string1 + string2.charAt(i), string2.substring(0, i) + string2.substring(i + 1));
            }
        }
    }

}