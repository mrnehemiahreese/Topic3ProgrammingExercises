import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TimeConversionPart1 {
   public static void main(String [] args) throws Exception {
	   
	   
	   Scanner input = new Scanner(System.in);
       System.out.print("Enter a 24 hour time: ");
       final String time = input.nextLine(); 
       
       
	   try {
	       final SimpleDateFormat sdf = new SimpleDateFormat("H:mm");
	       final Date dateObj = sdf.parse(time);
	       System.out.println(new SimpleDateFormat("K:mm a").format(dateObj));
	   } catch (final ParseException e) {
	       e.printStackTrace();
	   }
   }
}