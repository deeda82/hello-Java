import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/*
Create an instance method called remove that
takes a single parameter called dataFile
(representing the path to a text file) and
uses a Set of Strings to eliminate duplicate words from dataFile.

The unique words should be stored in an instance variable called uniqueWords.
 */

public class DuplicateRemover {
    public static ArrayList<String> uniqueWords = new ArrayList<String>();

    public static void remove (String dataFile) throws IOException {

        File fileStream = null;
        int i = 0;
        int counter = 0;
        ArrayList<String> inputArray = new ArrayList<String>();

        try {
            fileStream = new File(dataFile);
            Scanner inFS = new Scanner(fileStream);
            System.out.println("Accessing contents from FILE: " + dataFile);

            if (fileStream != null) {

                while (inFS.hasNext()) {
                    String word = inFS.next();
                    String newWord;
                    String letter = "";

                    for (i = 0; i < word.length(); i++) {
                        newWord = word;

                        if (Character.isLetter(newWord.charAt(i)) == false) {
                            letter = Character.toString(newWord.charAt(i));

                            newWord = newWord.substring(0, i) + newWord.substring(i + 1);
                            word = newWord;
                        }
                    }

                    inputArray.add(word);

                    if (letter.length() != 0) {
                        inputArray.add(letter);
                        letter = "";
                    }

                }
                inFS.close();

                i = 0;

            }

            i = 0;

            for (String buffer : inputArray) {

                for (String compToBuff : inputArray) {

                    if (buffer.compareToIgnoreCase(compToBuff) == 0 && Character.isLetter(buffer.charAt(0)) == true) {
                        counter += 1;
                    }
                }
                if (counter < 2) {
                    uniqueWords.add(buffer);
                }
                counter = 0;
            }
        }catch (IOException excpt) {
            System.out.println("Oops!! there's a problem with the file...");
            System.out.println("Caught IOException: " + excpt.getMessage());
        }

    }



    public static void write (String outputFile) throws IOException {
        FileWriter uniqueTextFile = null;
        int i = 0;

        try {
            uniqueTextFile = new FileWriter(outputFile);
            System.out.println();

            while(i < uniqueWords.size()){
                // writes words from the array to the text file

                uniqueTextFile.write(uniqueWords.get(i));
                if (i+1 < (uniqueWords.size()) && Character.isLetter(uniqueWords.get(i+1).charAt(0)) == true) {
                    uniqueTextFile.write(" ");
                }
                i++;
            }
            i = 0;

        } catch (IOException excpt) {
            System.out.println("Oops!! there's a problem with the file...");
            System.out.println("Caught IOException: " + excpt.getMessage());

        } finally {
            System.out.println("Closing..... FILE: " + outputFile);
            uniqueTextFile.close(); // Ensure file is closed!
        }

/*
        Create an instance method called write that takes a
        single parameter called outputFile (representing the
        path to a text file)
        and writes the words contained in
        uniqueWords to the file pointed to by outputFile.

        The output file should be overwritten if it already exists,
        and created if it does not exist.
 */
    }
}

