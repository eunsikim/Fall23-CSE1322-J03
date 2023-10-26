import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ExampleA {
    public static void main(String[] args) {
        String input = "input.txt";
        String output = "output.txt";

        try{
            File inputFile = new File(input);
            Scanner inputScan = new Scanner(inputFile);

            FileWriter outputFile = new FileWriter(output);

            while(inputScan.hasNextLine()){
                String line = inputScan.nextLine();
                String lineAllCaps = line.toUpperCase();

                outputFile.write(lineAllCaps + "\n");
            }

            outputFile.close();
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
