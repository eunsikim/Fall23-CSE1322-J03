import java.util.InputMismatchException;
import java.util.Scanner;

class InvalidOption extends Exception {
    public InvalidOption(String message) {
        super(message);
    }
}

public class ExampleD {
    public static Scanner sc = new Scanner(System.in);

    public static int MenuOption() throws InvalidOption{
        int input;

        System.out.println("1. Enter a number");
        System.out.println("2. Print array");
        System.out.println("0. Exit");
        input = sc.nextInt();

        if(0 > input || input > 2){
            throw new InvalidOption(input + " is not an option.");
        }

        return input;
    }

    public static int[] addNumber(int[] numbers){
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();
        System.out.print("Enter an index: ");
        int index = sc.nextInt();

        numbers[index] = number;

        int[] res = {index, number};
        return res;
    }

    public static void print(int[] numbers){
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + (i == numbers.length - 1 ? "\n" : ", "));
        }
    }

    public static void main(String[] args) {

        int[] numbers = { 0, 0, 0, 0, 0 };

        boolean loop = true;

        while (loop) {
            try {
                switch(MenuOption()){
                    case 1:
                        int[] res = addNumber(numbers);
                        System.out.println("You entered: " + res[1] + " to index: " + res[0]);
                        break;
                    case 2:
                        print(numbers);
                        break;
                    case 0:
                        loop = false;
                        break;                       
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
