import java.util.Scanner;

public class Encrypt {

	public static void main(String[] args) {
		
		int onesPlace;
		int tensPlace;
		int hundsPlace;
		int thousPlace;
		int fourDig;
		
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Enter the four-digit code you wish to be encrypted:");
		fourDig = scnr.nextInt();
		
		//Checks if the entered number is 4 digits in length
		while(fourDig < 1000) {
			System.out.println("That number is not four digits long. Try again. \n");
			fourDig = scnr.nextInt();
		}
		
//		testing retrieval
		System.out.println("\nYou entered: " + fourDig + "\n");		

		onesPlace = fourDig % 10;
		
		// Prints the places
		System.out.println(fourDig + "  -> Ones place is -> " + onesPlace + "\n");		
		fourDig = fourDig / 10;		
		tensPlace = fourDig % 10;
		
		System.out.println(fourDig + " -> Tens place is -> " + tensPlace + "\n");		
		fourDig = fourDig / 10;		
		hundsPlace = fourDig % 10;
		
		System.out.println(fourDig + " -> Hundreds place is -> " + hundsPlace + "\n");		
		fourDig = fourDig / 10;		
		thousPlace = fourDig %10;
		
		System.out.println(fourDig + " -> Thousands place is -> " + thousPlace + "\n");
		
		System.out.println("\n---------------------------------------");
		System.out.println(" ...Let's begin the encryption...");
		System.out.println("---------------------------------------\n");
		
		//Adds 7
		onesPlace = (onesPlace + 7);
		tensPlace = (tensPlace + 7);
		hundsPlace = (hundsPlace + 7);
		thousPlace = (thousPlace + 7);
				
		System.out.println("ADDS 7 =  " + thousPlace + "-" + hundsPlace + "-" + tensPlace + "-" + onesPlace + "\n");

		//Gets the remainder		
		onesPlace = onesPlace % 10;		//next -> swap with 3rd    (multiply by 100)
		tensPlace = tensPlace % 10;		//next -> swap with fourth (multiply by 1000)
		hundsPlace = hundsPlace % 10;	//next -> swap with 1rst   (stays the same)
		thousPlace = thousPlace % 10;	//next -> swap with 2nd    (multiply by 10) 
		
		System.out.println("Gets the REMAINDER after Division =  " + thousPlace + "-" + hundsPlace + "-" + tensPlace + "-" + onesPlace + "\n");

		//swap the first digit with the third, and swap the second digit with the fourth.
		System.out.println("SWAPS =  " + tensPlace + "-" + onesPlace + "-" + thousPlace + "-" + hundsPlace + "\n");

		onesPlace = onesPlace * 100;	//swap with 3rd
		tensPlace = tensPlace * 1000;	//swap with fourth
		hundsPlace = hundsPlace * 1;	//I know, I'm just keeping my code consistent for my own eyes.
		thousPlace = thousPlace * 10;	//swap with 2nd
		
		//Prints integers where they would be once the swap is complete.
		System.out.println("Puts them in place =  " + tensPlace + " + " + onesPlace + " + " + thousPlace + " + " + hundsPlace + "\n");
		
		//Then print the encrypted integer
		int newDig = thousPlace + hundsPlace + tensPlace + onesPlace;
		System.out.println("\n---------------------------------------");
		System.out.println("Your encrypted number is: " + newDig);
		System.out.println("\n---------------------------------------");
		
		// Prints the leading zero if the 4 digits are less than 1000
		if(newDig < 1000) {
			String myStringRepOfInt = String.format("%04d", newDig);
			System.out.println("\n---------------------------------------");
			System.out.println("Your digits were encrypted: " + myStringRepOfInt);	
			System.out.println("\n---------------------------------------");
		}
						
	scnr.close();
	
	}
}
	


