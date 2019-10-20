package com.company;

        import java.util.Scanner;
        import java.lang.Math;
        import java.security.SecureRandom;

public class ComputerAssistedInstruction {

    // Generates random numbers ------------------------
    public static int randomNumGenerator() {
        SecureRandom randomNum = new SecureRandom();

        return randomNum.nextInt(10);
    }
    //--------------------------------------------------
    public static int difficultyLevel(int level) {
        SecureRandom randomNum = new SecureRandom();

        switch(level) {
            case 1:
                return randomNum.nextInt(10);

            case 2:
                return randomNum.nextInt(99-10)+10;

            case 3:
                return randomNum.nextInt(999-100)+100;

            case 4:
                return randomNum.nextInt(9999-1000)+1000;
        }
        return  -1;
    }
    //--------------------------------------------------
    public static char mathType (int mathOption) {

        switch(mathOption) {
            case 1:
                return '+';
            case 2:
                return '-';
            case 3:
                return '*';
            case 4:
                return '/';
        }

        return 0;

    }
    //--------------------------------------------------

    public static void randomGoodComments () {
        SecureRandom randomNum = new SecureRandom();
        int num = randomNum.nextInt(5);

        while (num == 0) {
            num = randomNum.nextInt(5);
        }

        switch (num) {

            case 1:
                System.out.println("\nVery good!");
                break;

            case 2:
                System.out.println("\nExcellent!");
                break;

            case 3:
                System.out.println("\nNice work!");
                break;

            case 4:
                System.out.println("\nKeep up the good work!");
                break;
        }
    }
    //--------------------------------------------------
    public static void randomBadComments () {
        SecureRandom randomNum = new SecureRandom();
        int num = randomNum.nextInt(5);

        System.out.println("\nNo. Please try again.>again.");

        while (num == 0) {
            num = randomNum.nextInt(5);
        }

        switch (num) {

            case 1:
                System.out.println("\nNo. Please try again.");
                break;

            case 2:
                System.out.println("\nWrong. Try once more.");
                break;

            case 3:
                System.out.println("\nDon’t give up!");
                break;

            case 4:
                System.out.println("\nNo. Keep trying.");
                break;
        }
    }
    //--------------------------------------------------
    public static double calculations ( double num1, double num2, int mathOption) {
        double division;
        if(mathOption == 1){
            return num1 + num2;
        }
        else if(mathOption == 2){
            return num1 - num2;
        }
        else if(mathOption == 3){
            return num1 * num2;
        }
        else if(mathOption == 4){
            if( num1 == 0 || num2 == 0){
                return 0;
            }
            return (Math.floor((num1 / num2)*1000)/1000);
        }

        return 0;
    }
    public static void main(String[] args) {
        // write your code here
        Scanner scnr = new Scanner (System.in);
        SecureRandom randomNum = new SecureRandom();

        int randomInt1;
        int randomInt2;
        double answer;
        int goodAnswer = 0;
        int badAnswer = 0;
        int tenCount = 0;
        char reset = 'y';
        int level;
        int mathOption;
        char arrithmetic;
        double comparing;


        while (reset == 'y') {
            System.out.println("\nWhat difficulty level would you like to multiply at?");
            System.out.println("\tSelect from levels 1-4\n");
            level = scnr.nextInt();

            while (level < 1 || level > 4){
                System.out.println("\tSelect from levels 1-4\n");
                level = scnr.nextInt();
            }

            System.out.println("\nWhat type of math would you like to calculate?");


            System.out.println("\n\t1 for ADDITION");
            System.out.println("\t2 for SUBTRACTION");
            System.out.println("\t3 for MULTIPLICATION");
            System.out.println("\t4 for DIVISION");
            System.out.println("\t5 for COMPUTER PICKS");

            mathOption = scnr.nextInt();

            while (mathOption < 1 || mathOption > 5) {

                System.out.println("\n\t1 for ADDITION");
                System.out.println("\t2 for SUBTRACTION");
                System.out.println("\t3 for MULTIPLICATION");
                System.out.println("\t4 for DIVISION");
                System.out.println("\t5 for COMPUTER PICKS");

                mathOption = scnr.nextInt();
            }

            if(mathOption == 5){
                mathOption = randomNum.nextInt(5-1)+1;
            }
            arrithmetic = mathType (mathOption);
            tenCount = 1;

            while (tenCount <= 10) {

                randomInt1 = difficultyLevel(level);
                randomInt2 = difficultyLevel(level);

                double calculatedAnswer = calculations(randomInt1, randomInt2, mathOption);

                System.out.println("\n|--------------- COUNTING......" + tenCount + " ---------------|");

                System.out.println("\nHow much is " + randomInt1 + " " + arrithmetic + " " + randomInt2 + "?");
                answer = scnr.nextDouble();


                System.out.println("\nYou entered " + answer + ".");
                tenCount += 1;

                if (answer > calculatedAnswer){
                     comparing = Math.abs(Math.abs(answer) - Math.abs(calculatedAnswer));
                }
                else {
                    comparing = Math.abs(Math.abs(calculatedAnswer) - Math.abs(answer));
                }
                if (comparing < .1){
                    goodAnswer += 1;
                    randomGoodComments();

                }
                else {
                    badAnswer += 1;
                    randomBadComments();
                }

                System.out.println("\nCORRECT: " + goodAnswer);
                System.out.println("INCORRECT: " + badAnswer);
                System.out.println("CORRECT ANSWER IS ------> " + calculatedAnswer);


            }

            if ((goodAnswer * 10) < 75) {
                System.out.println("\nYour correct score is: %" + (goodAnswer*10));
                System.out.println("\nPlease ask your teacher for extra help.");
            } else {
                System.out.println("\nYour correct score is: %" + (goodAnswer*10));
                System.out.println("\nCongratulations, you are ready to go to the next level!");
            }

            System.out.print("\nIs there another student? y/n ");
            reset = scnr.next().charAt(0);

            if (reset == 'n'){
                System.exit(0);
            }

            goodAnswer = 0;
            badAnswer = 0;
        }

    }
}
