
/*********************************************************************************
* (Encrypt files) Encode the file by adding 5 to every byte in the file. Write a *
* program that prompts the user to enter an input file name and an output file   *
* name and saves the encrypted version of the input file to the output file.     *
*********************************************************************************/
import java.util.Scanner;
import java.io.*;

public class Exercise_17_14 {
    public static void main(String[] args) throws IOException {
        // Create a scanner
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter an input file name and an output flie name
        System.out.print("Enter input flie name: ");
        String inFile = input.next();
        System.out.print("Enter output flie name: ");
        String outFile = input.next();

        try ( // Create two random access files
                RandomAccessFile source = new RandomAccessFile(inFile, "r");
                RandomAccessFile target = new RandomAccessFile(outFile, "rw");) {
            // Add 5 to every byte read from source file
            // then write it to the target file
            int r = 0;
            source.seek(0); // Move the file pointer to the beginning
            while ((r = source.read()) != -1) {
                target.write(((byte) r) + 5);
            }
        }

    }
}