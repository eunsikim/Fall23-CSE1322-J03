import java.util.InputMismatchException;
import java.util.Scanner;

class InvalidOption extends Exception {
    public InvalidOption(String message) {
        super(message);
    }
}

public class ExampleC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = { 0, 0, 0, 0, 0 };

        int input;

        while (true) {
            try {
                System.out.println("1. Enter a number");
                System.out.println("2. Print array");
                System.out.println("0. Exit");
                input = sc.nextInt();

                if (input == 1) {
                    System.out.print("Enter an integer: ");
                    int number = sc.nextInt();
                    System.out.print("Enter an index: ");
                    int index = sc.nextInt();

                    numbers[index] = number;

                    System.out.println("You entered: " + number + " to index: " + index);
                } else if (input == 2) {
                    for (int i = 0; i < numbers.length; i++) {
                        System.out.print(numbers[i] + (i == numbers.length - 1 ? "\n" : ", "));
                    }
                } else if (input == 0) {
                    break;
                } else {
                    throw new InvalidOption(input + " is not an option.");
                }
            } 
            catch (InvalidOption e) {
                System.out.println("\nERROR: " + e.getMessage());
            } 
            catch (InputMismatchException e) {
                System.out.println("\nERROR: Wrong input data type!");
                sc.nextLine(); // Remeber to flush the buffer!
            } 
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("\nERROR: Index out of bounds!");
            } 
            catch (Exception e) {
                System.out.println("\nERROR: Something went wrong");
            }
            finally{
                System.out.println();
            }
        }
        System.out.println("[Stoping the program]\n");
    }
}
