import java.util.Scanner;


public class Exercise18p9 {

    public static void main(String[] args) {

        System.out.print("Enter a string: ");
        String input = new Scanner(System.in).nextLine();
        reverseDisplay(input);

    }

    private static void reverseDisplay(String value) {
        if (value.length() == 0)
            return;
        System.out.print(value.substring(value.length() - 1));
        reverseDisplay(value.substring(0, value.length()-1));
    }
}