import java.util.Scanner;
public class Exercise4p23 {
	public static void main(String[] args) {
		
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter employee's name: ");
		String name = input.nextLine();
		System.out.println("Enter number of hours worked in a week: ");
		double hours = input.nextDouble();
		System.out.println("Enter hourly pay rate: ");
		double payrate = input.nextDouble();
		System.out.println("Enter federal tax withholding rate: ");
		double fedtax = input.nextDouble();
		System.out.println("Enter state tax withholding rate: ");
		double statetax = input.nextDouble();
		
		
		
		double grossPay, federal, state, totalDeduction;
		System.out.printf(
			"Employee Name: " + name + 
			"\nHours Worked: " + hours +
			"\nPay Rate: $" + payrate +
			"\nGross Pay: $" + (grossPay = hours * payrate) +
			"\nDeductions:\n   Federal Witholding (20.0%): $" +
			(federal = grossPay * fedtax) +
			"\n   State Witholding (9.0%): $" + (state = grossPay * statetax) +
			"\n   Total Deduction: $" + (totalDeduction = federal + state) +
			"\nNet Pay: $" + (grossPay - totalDeduction)
			);
	}
		 
	}
