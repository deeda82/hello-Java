import java.io.*;
import java.util.*;

/*
Create a utility class called DuplicateCounter.
Create an instance method called count that takes a single parameter called dataFile
(representing the path to a text file) and uses a Map of Strings to count how many times
each word occurs in dataFile.

The counts should be stored in an instance variable called wordCounter.

Create an instance method called write that takes a single parameter called outputFile
(representing the path to a text file) and writes the contents of wordCounter to the file
pointed to by outputFile.

The output file should be overwritten if it already exists, and created if it does not exist.
*/

public class DuplicateCounter {
    public static HashMap <String, Integer> wordCounter = new HashMap <String, Integer>();



//    public void wordCounter(){ // The counts should be stored in an instance variable called wordCounter.
//        String duplicateWord = "";
//        int wordCount = 0;
//    }

    public static void count (String dataFile) throws IOException{
        // uses a Map of Strings to count how many times
        // each word occurs in dataFile

        File inputFile = null;
        int count = 0;
        int i = 0;
        int counter = 0;
        ArrayList<String> inputArray = new ArrayList<String>();
        inputFile = new File (dataFile);
        Scanner scnrIF = new Scanner (inputFile);
        System.out.println("Accessing contents from FILE: " + dataFile);


        if (inputFile != null) {

            while (scnrIF.hasNext()) {
                String word = scnrIF.next();
                String newWord;
                String letter = "";

                for(i = 0; i < word.length(); i++ ) {
                    newWord = word;

                    if (Character.isLetter(newWord.charAt(i)) == false){
                        letter = Character.toString(newWord.charAt(i));

                        newWord = newWord.substring(0,i) + newWord.substring(i + 1);
                        word = newWord;
                    }
                }

                inputArray.add(word);

                if(letter.length() != 0) {
                    inputArray.add(letter);
                    letter = "";
                }

            }

            i = 0;

        }

        i = 0;

        for (String buffer : inputArray) {

            for (String compToBuff : inputArray) {

                if (buffer.compareToIgnoreCase(compToBuff) == 0 && Character.isLetter(buffer.charAt(0)) == true) {
                    counter += 1;
                }
            }
            if (counter > 1) {
                wordCounter.put(buffer, counter);
            }
            counter = 0;
        }
        scnrIF.close();

    }

    //--------------------------------------------------------------------------------------------------------------
    public static void write (String outputFile) throws IOException{
        // writes the contents of wordCounter to the file
        // pointed to by outputFile.

        FileWriter uniqueTextFile = null;
        int i = 0;

        try {
            uniqueTextFile = new FileWriter(outputFile);
            System.out.println();

//            while(i < uniqueWords.size()){
//                // writes words from the array to the text file
//
//                uniqueTextFile.write(uniqueWords.get(i));
//                if (i+1 < (uniqueWords.size()) && Character.isLetter(uniqueWords.get(i+1).charAt(0)) == true) {
//                    uniqueTextFile.write(" ");
//                }
//                i++;
//            }
//            i = 0;
            Set<String> keys = wordCounter.keySet();
            uniqueTextFile.write(String.valueOf(keys));
            uniqueTextFile.write(System.lineSeparator());
            uniqueTextFile.write(System.lineSeparator());
            Collection<Integer> values = wordCounter.values();
            uniqueTextFile.write(String.valueOf(values));

        } catch (IOException excpt) {
            System.out.println("Caught IOException: " + excpt.getMessage());

        } finally {
            System.out.println("Closing..... FILE: " + outputFile);
            uniqueTextFile.close(); // Ensure file is closed!
        }

    }

}
