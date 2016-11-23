import java.util.Scanner;
//Thomas Pennington 
//Quiz 1
public class QBStats {


	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		String firstName; // Enter the first name of a player in String format (e.g. "Sam")
		System.out.print("Please enter a QB first name in String format: ");
		firstName = input.next();
		
		String lastName; //Enter the last name of a player in String format (e.g. "Bradford")
		System.out.print("Please enter a QB last name in String format: ");
		lastName = input.next();
		
		double TD; // The amount of touchdowns that the QB has in a season in a double amount (e.g. 19.0)
		System.out.print("Please enter an amount of touchdowns the QB has in double format: ");
		TD = input.nextDouble();
		
		double Yards; // The total amount of yards for the QB in a double amount (e.g. 3725.0)
		System.out.print("Please enter the total amount of yards that the QB has in double format: ");
		Yards = input.nextDouble();
		
		double Interceptions; // The number of interceptions that the QB has in a double amount (e.g. 14.0)
		System.out.print("Please enter the amount of interceptions that the QB has in double format: ");
		Interceptions = input.nextDouble();
		
		double comp; // The number of completions that the QB has in double format (e.g. 346.0)
		System.out.print("Please enter the amount of total completions the QB has in double format: ");
		comp = input.nextDouble();
		
		double ATT; // The number of attempts that the QB had in double format (e.g. 532.0)
		System.out.print("Please enter the amount of passes attempted in double format: ");
		ATT = input.nextDouble();
		
		// These four variables and formulas represent the breakdown of the QB rating 
		
		double calca = (((comp/ATT) - .3) * 5);
		double calcb = (((Yards/ATT) - 3) * .25);
		double calcc = ((TD/ATT) * 20);
		double calcd = (2.375 - ((Interceptions/ATT) * 25));
		
		// This is checking to see whether a QB has any of the above calculations 
		// to be higher than 2.375 or less than 0 and is setting it to 2.375 if any 
		// of the above conditions are true
		
		if(calca > 2.375)
			calca = 2.375;
		else if (calcb > 2.375)
			calcb = 2.375;
		else if (calcc > 2.375)
			calcc = 2.375;
		else if (calcd > 2.375)
			calcd = 2.375;
		else if (calca < 0)
			calca = 0;
		else if (calcb < 0)
			calcb = 0;
		else if (calcc < 0)
			calcc = 0;
		else if(calcd <0)
			calcd = 0;
		
		// This is Calculating the QB Rating using the above individual formulas
		
		double QbRate = (((calca + calcb + calcc + calcd)/6) * 100);
		
		System.out.printf("The QB rating of" + " " + firstName + " " + lastName + " " + "is %.2f", QbRate);
		
		input.close();
	}
}
