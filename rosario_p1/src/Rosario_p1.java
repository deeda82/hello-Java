import java.util.Scanner;

public class Rosario_p1 {

	public static void main(String[] args) {
		
		int onesPlace;
		int tensPlace;
		int hundsPlace;
		int thousPlace;
		
		System.out.println("Enter the four-digit code you wish to be encrypted:");
		Scanner scnr = new Scanner(System.in);
		
		int fourDig = scnr.nextInt();
		
		//Checks if the entered number is 4 digits in length
		while(fourDig < 1000) {
			System.out.println("That number is not four digits long. Try again. \n");
			fourDig = scnr.nextInt();
		}

		
		
//		testing retrieval
		System.out.println("\nYou entered: " + fourDig + "\n");
		
		onesPlace = fourDig % 10;
		
//		testing places
		System.out.println(fourDig + "  -> Ones place is -> " + onesPlace + "\n");		
		fourDig = fourDig / 10;
		
		tensPlace = fourDig % 10;
		
//		test
		System.out.println(fourDig + " -> Tens place is -> " + tensPlace + "\n");
		
		fourDig = fourDig / 10;
		
		hundsPlace = fourDig % 10;
		
//		test
		System.out.println(fourDig + " -> Hundreds place is -> " + hundsPlace + "\n");
		
		fourDig = fourDig / 10;
		
		thousPlace = fourDig %10;
		
//		test
		System.out.println(fourDig + " -> Thousands place is -> " + thousPlace + "\n");
		
		System.out.println("\n---------------------------------------");
		System.out.println(" ...Let's begin the encryption...");
		System.out.println("---------------------------------------\n");
		
		//adds 7
		onesPlace = (onesPlace + 7);
		tensPlace = (tensPlace + 7);
		hundsPlace = (hundsPlace + 7);
		thousPlace = (thousPlace + 7);
		
		
		System.out.println("ADDS 7 =  " + thousPlace + "-" + hundsPlace + "-" + tensPlace + "-" + onesPlace + "\n");

		//Gets the remainder		
		onesPlace = onesPlace % 10;		//next -> swap with 3rd    (multiply by 100)
		tensPlace = tensPlace % 10;		//swap -> with fourth (multiply by 1000)
		hundsPlace = hundsPlace % 10;	//swap -> with 1rst   (stays the same)
		thousPlace = thousPlace % 10;	//swap -> with 2nd    (multiply by 10) 
		
		System.out.println("Gets the REMAINDER after Division =  " + thousPlace + "-" + hundsPlace + "-" + tensPlace + "-" + onesPlace + "\n");

		//swap the first digit with the third, and swap the second digit with the fourth.
		System.out.println("SWAPS =  " + tensPlace + "-" + onesPlace + "-" + thousPlace + "-" + hundsPlace + "\n");

		onesPlace = onesPlace * 100;	//swap with 3rd
		tensPlace = tensPlace * 1000;	//swap with fourth
		hundsPlace = hundsPlace * 1;	//I know, I'm just keeping my code consistent for my own eyes.
		thousPlace = thousPlace * 10;	//swap with 2nd
		
//test
		System.out.println("Puts them in place =  " + tensPlace + " + " + onesPlace + " + " + thousPlace + " + " + hundsPlace + "\n");

		
		//Then print the encrypted integer
		//DecimalFormat decimalFormat = new DecimalFormat("0000");

		int newDig = thousPlace + hundsPlace + tensPlace + onesPlace;
		System.out.println("Your encrypted number is: " + newDig);
		
		// Prints the leading zero if the 4 digits are less than 1000
		if(newDig < 1000) {
			String myStringRepOfInt = String.format("%04d", newDig);
			System.out.println("Using String.format, Your digits were encrypted: " + myStringRepOfInt);		
		}
		
		
//-------------------------------------------------------------------------------		  		  
		  //Decryption Process
//-------------------------------------------------------------------------------
		  
		  System.out.println("\n\nIs there a four-digit code you would like to decrypt? (1 for YES/ 0 for NO): ");
		  int answer = scnr.nextInt();
		  
		  while (answer > 1 || answer < 0) {
			  System.out.println("\nPlease type 1 for YES or 0 for NO: ");
			  answer = scnr.nextInt();
		  }
		  
		  if (answer < 1 && answer > -1) {
			  
		  		System.out.println("\nThank you!! Goodbye!\n");  
		  		
		  		System.exit(0);
		  }
		  	else if(answer > 0 && answer < 2){	
		   
		  		System.out.println("\nEnter it now: ");
		  		int deCrypt = scnr.nextInt();		  		
		  		
				while(deCrypt < 1000) {
					
					System.out.println("That number is not four digits long. Try again. \n");
					deCrypt = scnr.nextInt();
					
				}

				System.out.println("\n---------------------------------------");
				System.out.println(" ...Decryption Started...");
				System.out.println("---------------------------------------\n");
			
		  
///BEGIN DECRYPTION HERE - for the morning.
				
				onesPlace = deCrypt % 10;
				deCrypt = deCrypt / 10;
				
				tensPlace = deCrypt % 10;
				deCrypt = deCrypt / 10;
				
				hundsPlace = deCrypt % 10;
				deCrypt = deCrypt / 10;
				
				thousPlace = deCrypt % 10;
				deCrypt = deCrypt / 10;
				
				//test
				System.out.println("\nOnes place = " + onesPlace);
				System.out.println("Tens place = " + tensPlace);
				System.out.println("Hundreds place = " + hundsPlace);
				System.out.println("Thousands place = " + thousPlace);
				
				if(onesPlace > 6) {
					
					onesPlace = (onesPlace * 1) - 7;
					
				}
				else {
					
					onesPlace = ((onesPlace * 1) +10) - 7;
					System.out.println("\nDECRYPTED -> Ones place = " + onesPlace);
					
				}
				
				if(tensPlace > 6) {
					
					tensPlace = (tensPlace * 1) - 7;
					
				}
				else {
					
					tensPlace = ((tensPlace * 1) +10) - 7;
					
				}
				System.out.println("\nDECRYPTED -> Tens place = " + tensPlace);
				
				if(hundsPlace > 6) {
					
					hundsPlace = (hundsPlace * 1) - 7;
					
				}
				else {
					
					hundsPlace = ((hundsPlace * 1) +10) - 7;
										
				}
				System.out.println("\nDECRYPTED -> Hundreds place = " + hundsPlace);

//PROBLEM TO FIX
				if(thousPlace > 6) {
					
					thousPlace = (thousPlace * 1) - 7;
					
				}
				else {
					
					thousPlace = ((thousPlace * 1) +10) - 7;
					
				}
				System.out.println("\nDECRYPTED -> Thousands place = " + thousPlace);
				
				onesPlace = onesPlace * 100;	//swap with 3rd
				tensPlace = tensPlace * 1000;	//swap with fourth
				hundsPlace = hundsPlace * 1;	//I know, I'm just keeping my code consistent for my own eyes.
				thousPlace = thousPlace * 10;	//swap with 2nd
				
				System.out.println("\nPuts them in place =  " + tensPlace + " + " + onesPlace + " + " + thousPlace + " + " + hundsPlace + "\n");
				
				newDig = thousPlace + hundsPlace + tensPlace + onesPlace;
				System.out.println("Your Decrypted number is: " + newDig);
				
	scnr.close();
	
		  	}
	}
	
}
// adds 7			Remainder
//					   ^
//0 +7 -> 7 	%10 -> 7 ->	 [7 * 1] - 7
//1 +7 -> 8 	%10 -> 8 ->  [8 * 1] - 7
//2 +7 -> 9 	%10 -> 9 ->  [9 * 1] - 7
//3 +7 -> 10 	%10 -> 0 ->  [(0 * 1) + 10] - 7
//4 +7 -> 11 	%10 -> 1 ->  [(1 * 1) + 10] - 7
//5 +7 -> 12	%10 -> 2 ->  [(2 * 1) + 10] - 7
//6 +7 -> 13	%10 -> 3 ->  [(3 * 1) + 10] - 7
//7 +7 -> 14	%10 -> 4 ->  [(4 * 1) + 10] - 7
//8 +7 -> 15	%10 -> 5 ->  [(5 * 1) + 10] - 7
//9 +7 -> 16	%10 -> 6 ->  [(6 * 1) + 10] - 7

//enCrptyNum = (num + 7) % 10
//mod = r
//r = num/10 * .1

