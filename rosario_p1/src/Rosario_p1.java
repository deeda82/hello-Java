import java.util.Scanner;

public class Rosario_p1 
{

	public static void main(String[] args) 
	{
		
		System.out.println("Enter the four-digit code you wish to be encrypted:");
		Scanner scnr = new Scanner(System.in);
		
		int fourDig = scnr.nextInt();
		int length = String.valueOf(fourDig).length();
		
		while(length < 4 || length > 4) 
		{
			System.out.println("That number is not four digits long. Try again. \n");
			fourDig = scnr.nextInt();
			length = String.valueOf(fourDig).length();
		}
		
		int onesPlace;
		int tensPlace;
		int hundsPlace;
		int thousPlace;
		
		
		
	//testing retrieval
		System.out.println("You entered: " + fourDig + "\n");
		
		onesPlace = fourDig % 10;
		
	//testing places
		System.out.println(fourDig + "  -> Ones place is -> " + onesPlace + "\n");
		
		fourDig = fourDig / 10;
		
		tensPlace = fourDig % 10;
		
	//test
		System.out.println(fourDig + " -> Tens place is -> " + tensPlace + "\n");
		
		fourDig = fourDig / 10;
		
		hundsPlace = fourDig % 10;
		
	//test
		System.out.println(fourDig + " -> Hundreds place is -> " + hundsPlace + "\n");
		
		fourDig = fourDig / 10;
		
		thousPlace = fourDig %10;
		
	//test
		System.out.println(fourDig + " -> Thousands place is -> " + thousPlace + "\n");
		
		System.out.println("\n\n ...Let's begin the encryption...\n");
		
		//adds 7
		onesPlace = (onesPlace + 7);
		tensPlace = (tensPlace + 7);
		hundsPlace = (hundsPlace + 7);
		thousPlace = (thousPlace + 7);
		
		
		System.out.println("ADDS 7 =  " + thousPlace + "-" + hundsPlace + "-" + tensPlace + "-" + onesPlace + "\n");
		
		onesPlace = onesPlace % 10;		//swap with 3rd    (multiply by 100)
		tensPlace = tensPlace % 10;		//swap with fourth (multiply by 1000)
		hundsPlace = hundsPlace % 10;	//swap with 1rst   (stays the same)
		thousPlace = thousPlace % 10;	//swap with 2nd    (multiply by 10) 
		
		System.out.println("Gets the REMAINDER after Division =  " + thousPlace + "-" + hundsPlace + "-" + tensPlace + "-" + onesPlace + "\n");

//swap the first digit with the third, and swap the second digit with the fourth.
		System.out.println("SWAPS =  " + tensPlace + "-" + onesPlace + "-" + thousPlace + "-" + hundsPlace + "\n");

		onesPlace = onesPlace * 100;
		tensPlace = tensPlace * 1000;
		hundsPlace = hundsPlace;		//I know, I'm just keeping my code consistent for my own eyes.
		thousPlace = thousPlace * 10;
		
	//test
		System.out.println("Puts them in place =  " + tensPlace + "-" + onesPlace + "-" + thousPlace + "-" + hundsPlace + "\n");

		
//Then print the encrypted integer
		//DecimalFormat decimalFormat = new DecimalFormat("00000");

		int newDig = thousPlace + hundsPlace + tensPlace + onesPlace;
		
		String myStringRepOfInt = String.format("%04d", newDig);
		System.out.println("Using String.format, Your digits were encrypted:: " + myStringRepOfInt);

//-------------------------------------------------------------------------------		  		  
		  //Decryption Process
//-------------------------------------------------------------------------------
		  
		  System.out.println("\n\nIs there a four-digit code you would like to decrypt? (1 for YES/ 0 for NO): ");
		  int answer = scnr.nextInt();
		  
		  while (answer > 1 || answer < 0) 
		  {
			  System.out.println("\nPlease type 1 for YES or 0 for NO: ");
			  answer = scnr.nextInt();
		  }
		  
		  if (answer < 1 && answer > -1) 
		  {
		  		System.out.println("\nThank you!! Goodbye!\n");  
		  		
		  		System.exit(0);
		  }
		  	else if(answer > 0 && answer < 2)
		  	{	
		   
		  		System.out.println("Enter it now: ");
		  		int deCrypt = scnr.nextInt();		  		
		  		int deCryptLength = 0;
		  		long temp = 1;
		  		
		  		while (temp <= deCrypt) 
		  		{
		  		    deCryptLength++;
		  		    temp *= 10;
		  		}
		  		
		  		System.out.println("deCryptLength = " + deCryptLength);
		  			  					
				while(deCryptLength < 4 || deCryptLength > 4) 
		  		{
					System.out.println("That number is not four digits long. Try again. \n");
					deCrypt = scnr.nextInt();					
					deCryptLength = 0;
					temp = 1;
					
			  		while (temp <= deCrypt) 
			  		{
			  		    deCryptLength++;
			  		    temp *= 10;
			  		}
			  		
			  		System.out.println("deCryptLength = " + deCryptLength);
		  		}
		  

///BEGIN DECRYPTION HERE - for the morning.
				
				thousPlace = deCrypt / 1000;
				
				//test
				System.out.println("Thousands place = " + thousPlace);
		  	}
	}
}
