import java.util.Scanner;

public class Exercise6p3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a integer: ");
        int num = input.nextInt();

        if (isPalindrome(num)) {
            System.out.println(num + " is a palindrome.");
        } else {
            System.out.println(num + " is NOT a palindrome.");

        }

    }

    public static int reverse(int number) {

        int reverse = 0;
        while (number != 0) {

            reverse *= 10; 
            reverse += number % 10;
            number /= 10;
        }

        return reverse;
    }

    public static boolean isPalindrome(int number) {

        return (number == reverse(number));
    }
}