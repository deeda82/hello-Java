import java.util.Scanner;

public class Decrypt {

	public static void main(String[] args) {
		
		int answer;
		int deCrypt;
		int onesPlace;
		int tensPlace;
		int hundsPlace;
		int thousPlace;
		int newDig;
		
		Scanner scnr = new Scanner(System.in);
		
		
//-------------------------------------------------------------------------------		  		  
		  //Decryption Process
//-------------------------------------------------------------------------------
		  
		  System.out.println("\n\nIs there a four-digit code you would like to decrypt? (1 for YES/ 0 for NO): ");
		  answer = scnr.nextInt();
		  
		  while (answer > 1 || answer < 0) {
			  System.out.println("\nPlease type 1 for YES or 0 for NO: ");
			  answer = scnr.nextInt();
		  }
		  
		  //Checks what you entered
		  if (answer < 1 && answer > -1) {
			  
		  		System.out.println("\nThank you!! Goodbye!\n");  
		  		
		  		System.exit(0);
		  }
		  	else if(answer > 0 && answer < 2){	
		   
		  		System.out.println("\nEnter it now: ");
		  		deCrypt = scnr.nextInt();		  		
		  		
				while(deCrypt < 1000) {
					
					System.out.println("That number is not four digits long. Try again. \n");
					deCrypt = scnr.nextInt();
					
				}

				System.out.println("\n---------------------------------------");
				System.out.println(" ...Decryption Started...");
				System.out.println("---------------------------------------\n");
			
		  
				//DECRYPTION STARTS HERE
				
				
				// Strips each number from its placement
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
				
				// Checks the range for suitable calculations and prints.
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
				System.out.println("\n---------------------------------------");
				System.out.println("Your Decrypted number is: " + newDig);
				System.out.println("\n---------------------------------------");
				
	scnr.close();
	
		  	}
	
	


//Decryption Notes:
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


	}

}
