package rosario_p3;

import java.util.Scanner;

public class Polls {

	public static void main(String[] args) {
		
		final int ROW = 5;
		final int COLUMN = 10;
		
		int i;
		int j;
		int addUser = 1;
		int answer;
		int temp;
		int MIN = 0;
		int MAX = 0;
		int maxTopic = 0;
		int minTopic = 0;
		
		double addRows = 0;
		double average;
		
		String[] topics = new String [5];
		
		int[][] responses = new int[ROW][COLUMN];
		int[] topicTally = new int[ROW];
		
		Scanner scnr = new Scanner(System.in);
		
		topics[0] = "Animal Cruelty";
		topics[1] = "Gay Rights";
		topics[2] = "Police Action";
		topics[3] = "Polution";
		topics[4] = "President Trump";
		
		
		System.out.println("\t\t\t****************************");
		System.out.println("\t\t\t******** CATEGORIES ********");
		System.out.println("\t\t\t****************************\n");
		
		System.out.println("\t\t ----------------------------------------------------");
		System.out.println("\t\t|Please take your time to rate the following topics: |");
		System.out.println("\t\t ----------------------------------------------------\n");

		
		for (i = 0; i < topics.length; i++) {
			
			System.out.println("\t\t" + (i+1) + ".) " + topics[i] + "\n");
		}
		
		System.out.println("\nINSTRUCTIONS:\n Rate the topics using a scale of 1 to 10, 1 being least important and 10 being most important.\n");

		System.out.println("\t\t\t****************************");
		System.out.println("\t\t\t********** SURVEY **********");
		System.out.println("\t\t\t****************************\n");
		
		while(addUser == 1) {
			for (i = 0; i < ROW; i++) {
			
				System.out.print("\n" + (i+1) + ".) " + "How important is the topic of " + topics[i] + " to you? ");
				answer = scnr.nextInt();
				
				while (answer < 1 || answer > 10) {
					
					System.out.println("\nSelect from 1 to 10 please.");
					System.out.print("\n" + (i+1) + ".) " + "How important is the topic of " + topics[i] + " to you? ");
					answer = scnr.nextInt();
					
				}
				
				// tallies up the ratings
				responses[i][answer - 1] += 1;
				System.out.printf("%n");
				
			}	
			System.out.println("Would you like to add an additional user? \nPress 1 for YES \nPress 2 for NO");
			addUser = scnr.nextInt();

		}
		
		topics[0] = "Animal Cruelty ";
		topics[1] = "Gay Rights     ";
		topics[2] = "Police Action  ";
		topics[3] = "Polution       ";
		topics[4] = "President Trump";
		
		System.out.println("\t\t\t***************************");
		System.out.println("\t\t\t********* RESULTS *********");
		System.out.println("\t\t\t***************************\n");
		
		System.out.println("+----------------------------------------------------------------------------+----------------+");
		System.out.printf("|%20s%8d%5d%5d%5d%5d%5d%5d%5d%5d%5d%4c%10s%n", "Categories", 1,2,3,4,5,6,7,8,9,10,'|'," Average Rating |");
		System.out.println("+----------------------------------------------------------------------------+----------------+");
		
		
		// Prints out the counted categories for each rating
		for (i = 0; i < ROW; i++) {
			
			// Prints the box in between the lines with text; beginning and end
			System.out.printf("%c%77c%17c%n", '|','|','|');
			
			// Prints the categories to the left
			System.out.printf("%c%5d.) %5s",'|', (i+1), topics[i]);
				
			for (j = 0; j < COLUMN; j++) {
					
				System.out.format("%5d",responses[i][j]);
				addRows = addRows + (double)(responses[i][j] * (j+1)); 
	
			}

			average = ((double)(addRows)/10.0);
			
			addRows = 0;

			System.out.printf("%4c%10.2f%7c%n", '|', average,'|');

		}
			System.out.printf("%c%77c%17c", '|', '|','|');
			System.out.printf("%n");
			
			System.out.println("+----------------------------------------------------------------------------+----------------+");

			
			

//-----------------------------------------------------------------------
		// loops to add up each row

		for (i = 0; i < ROW; i++) {
			
			
				
			for (j = 0; j < COLUMN; j++){
					
				addRows = addRows + (double)(responses[i][j] * (j+1));
				topicTally[i] = (int)addRows;	
				
			}
			addRows = 0;

		}
		temp = topicTally[0];
		MIN =  topicTally[0];
		MAX = topicTally[0];
		
		//compares each category
		for (i = 0; i < ROW; i++) {
			
			for (j = 0; j < COLUMN; j++) {
				
				if (topicTally[i] > MAX) {		
					temp = MAX;
					MAX = topicTally[i];
					maxTopic = i;
				}
					
				if (temp < MIN ) {
					MIN = temp;
					minTopic = i;
				}
				
				if (topicTally[i] < MIN) {
					
					temp = topicTally[i+1];
					MIN = topicTally[i];
					minTopic = i;

				}
				
			}
		}
		
		System.out.println("\n\t\t\t********** TOTALS **********\n");	
		System.out.println(topics[0] + " = " + topicTally[0]);
		System.out.println(topics[1] + " = " + topicTally[1]);
		System.out.println(topics[2] + " = " + topicTally[2]);
		System.out.println(topics[3] + " = " + topicTally[3]);
		System.out.println(topics[4] + " = " + topicTally[4]);
	
		System.out.println("\n");	
		System.out.println(topics[maxTopic] + " had the most ratings at: \t" + MAX + "\n");
		System.out.println(topics[minTopic] + " had the least ratings at: \t" + MIN + "\n");

				
	scnr.close();		
	}
}


