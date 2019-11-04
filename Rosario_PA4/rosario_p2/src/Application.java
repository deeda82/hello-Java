import java.io.IOException;
import java.util.Scanner;

public class Application {

    /*
    Create a separate class called Application that contains
    a main method which illustrates the use of DuplicateCounter
    by calling both the count and write methods.

    Your input file must be called problem2.txt and your output file
    must be called unique_word_counts.txt.
    */

    public static void main(String[] args) throws IOException {
        Scanner scnr = new Scanner(System.in);
        String readingFrom;
        String writingTo;
        DuplicateCounter duplicateCounter = new DuplicateCounter();

        System.out.println("Please enter file path to READ from: ");
        readingFrom = scnr.nextLine();

        System.out.println("Please enter the file path to WRITE to: ");
        writingTo = scnr.nextLine();

        DuplicateCounter.count(readingFrom);
        DuplicateCounter.write(writingTo);

        // TESTER
//                duplicateCounter.count("/Users/drosario/IdeaProjects/rosario_p2/src/problem2.txt");
//                duplicateCounter.write("/Users/drosario/IdeaProjects/rosario_p2/src/unique_word_counts.txt");


    }
}
