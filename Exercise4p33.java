import java.util.Scanner;


public class Exercise4p33 {

	public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	System.out.println("Enter an interger 0-15: ");
    int x = input.nextInt();
    
    if (x < 0 || x > 15) {							//Check to see if it's in the right range
    	System.out.println("Invalid Character");
    	System.exit(1);
    	}
    
    if (x >= 15);
     {
    	 if(x == 15)
    		 System.out.println("The Hex value is F");
    	 else if(x == 14)
    		 System.out.println("The Hex value is E");
    	 else if(x == 13)
    		 System.out.println("The Hex value is D");
    	 else if(x == 12)
    		 System.out.println("The Hex value is C");
    	 else if(x == 11)
    		 System.out.println("The Hex value is B");
    	 else if(x == 10)
    		 System.out.println("The Hex value is A");
    	 else 
    	 	{
    		 System.out.println("The Hex value is " + x);
    	 	}
    	
     }
    
	}
}
