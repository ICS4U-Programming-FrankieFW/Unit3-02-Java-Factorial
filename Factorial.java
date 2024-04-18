
/**
This program uses recursion to call itself to do a factorial problem 
This also uses input and output files for the code 
* @author Frankie Fox
* @version 1.0
* @since   2024-17-04
*/
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Factorial {

    public static int factorial(int n) {
     //The base case for the recursion function
     if (n == 1)
        //This wll return 1    
        return 1;
        else
            return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        //This si the try statement for the main
        try {
            //This reads input from the input.txt file
           //This creates a bufferedreader to read the input file
           BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
            //This reads the output from the output.txt file
            //This creates the buffered writer that writes to the output file
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));

            String line;
           //The while loop for if there is a line read next line
           while ((line = reader.readLine()) != null) {
                //This parses the integer 
                int inputNumber = Integer.parseInt(line.trim());

                //This calculates factorial
                int result = factorial(inputNumber);

                //This writes output to output.txt
                writer.write(inputNumber + "! = " + result + "\n");
            }
            reader.close();
            writer.close();
        //This catches any errors in the code 
        } catch (IOException e) {
            System.out.println("Error: An IO exception occurred.");
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid input. Please provide a valid integer in the input file.");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
