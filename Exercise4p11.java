import java.util.Scanner;
public class Exercise4p11 {

    public static void main(String[] args) {

       
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a decimal value (0 to 15): ");
        int number = input.nextInt();
        input.close();


        String hex = getHexValue(number);

        if (hex != null) {
            System.out.println("The hex value is: " + hex);
        } else {
            System.out.println("Invalid input");
        }

    }


    public static String getHexValue(int number) {

       
        if (number < 0 || number > 15) return null;

        if (number <= 9) {
            return Character.toString((char)(number + '0'));
        } else {
            return Character.toString((char) (number - 10 + 'A'));
        }

    }
}