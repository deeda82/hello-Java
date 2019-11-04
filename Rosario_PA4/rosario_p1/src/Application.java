import java.io.IOException;
import java.util.Scanner;

public class Application {
    /*
    Create a separate class called Application that contains a main method
    which illustrates the use of DuplicateRemover by calling both the remove and write methods.
    Your input file must be called problem1.txt and your output file must be called unique_words.txt.
    */

    public static void main(String[] args) throws IOException {
        Scanner scnr = new Scanner(System.in);
        String readingFrom;
        String writingTo;

        DuplicateRemover duplicateRemover = new DuplicateRemover();

        System.out.println("Please enter file path to READ from: ");
        readingFrom = scnr.nextLine();

        System.out.println("Please enter the file path to WRITE to: ");
        writingTo = scnr.nextLine();

        duplicateRemover.remove(readingFrom);
        duplicateRemover.write(writingTo);

        // TESTER
        //        duplicateRemover.remove(/Users/drosario/IdeaProjects/rosario_p1/src/problem1.txt);
        //        duplicateRemover.write(/Users/drosario/IdeaProjects/rosario_p1/src/unique_words.txt);

    }
}
