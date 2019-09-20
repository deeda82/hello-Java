package rosario_p2;

import java.util.Scanner;

public class BMI_Calculator {

	public static void main(String[] args) {
		
		int option;
		double height;
		double weight;
		double calcBMI = 0;
		
		Scanner scnr = new Scanner(System.in);
		
		System.out.println(" \t\t -------------------------------------------------");
		System.out.println(" \t\t| Welcome to your Body Mass Index Calculator (BMI)|");
		System.out.println(" \t\t -------------------------------------------------\n");

		System.out.println("Which conversion calculator would you like to use?");
		System.out.println("Press 1 and ENTER, to calculate your BMI using your height in inches (in) and weight in pounds (lbs) or; ");
		System.out.println("Press 2 and ENTER, to calculate your BMI using your height in meters (m) and weight in kilograms (kg): ");
		option = scnr.nextInt();
		
		System.out.println("\nEnter your weight: ");
		weight = scnr.nextDouble();
		
		System.out.println("\nEnter your height: ");
		height = scnr.nextDouble();
		
		
		if (option == 1) {
			
			calcBMI = (703 * weight) / (Math.pow(height, 2));
			
		} 
		else if (option == 2) {
			
			calcBMI = weight / (Math.pow(height, 2));
			
		}
		else {
				
				System.out.println("Your option was invalid.");
				System.out.println("\t\tGoodbye!");
				System.exit(0);
		}
		
		System.out.println("\n\t    **** Your BMI is " + String.format("%.2f", calcBMI) + " ****");
		System.out.println("\nSee the BMI categories below for more information.\n");
		
		System.out.println("\t****************************************");
		System.out.println("\t*         BMI Categories:              *");
		System.out.println("\t*         ---------------              *");
		System.out.println("\t* Underweight   = <18.5                *");
		System.out.println("\t* Normal weight = 18.5–24.9            *");
		System.out.println("\t* Overweight    = 25–29.9              *");
		System.out.println("\t* Obesity       = BMI of 30 or greater *");
		System.out.println("\t*                                      *");
		System.out.println("\t****************************************\n");
		
		
		
		
		
		
		scnr.close();
		
	}

}
