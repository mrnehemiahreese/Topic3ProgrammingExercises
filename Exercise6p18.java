

public class Exercise6p18 {
  public static void main(String[] args) {
    // Prompt the user to enter a password
    java.util.Scanner input = new java.util.Scanner(System.in);
    System.out.print("Enter a string for password: ");
    String password = input.nextLine();

    if (isValidPassword(password)) {
      System.out.println("Valid password");
    }
    else {
      System.out.println("Invalid password");
    }
  }

 
  public static boolean isValidPassword(String password) {
    
    for (int i = 0; i < password.length(); i++) {
      if (!Character.isLetter(password.charAt(i)) && 
          !Character.isDigit(password.charAt(i)))
        return false;
    }
    
   
    if (password.length() < 8)
      return false;
    
    
    int count = 0;
    for (int i = 0; i < password.length(); i++) {
      if (Character.isDigit(password.charAt(i)))
        count++;
    }
    
    if (count >= 2)
      return true;
    else 
      return false;
  }
}
