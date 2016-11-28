import java.util.Scanner;

public class TimeConversionPart2 {

	 public static void main(String [] args) {
	  Scanner input = new Scanner(System.in);
      System.out.print("Enter a time in decimal format: ");
      double time = input.nextDouble(); 
      
      int hours = (int) time;
      int minutes = (int) (time * 60) % 60;
      int seconds = (int) (time * (60*60)) % 60;

      System.out.println(String.format("%s(h) %s(m) %s(s)", hours, minutes, seconds));
}
}