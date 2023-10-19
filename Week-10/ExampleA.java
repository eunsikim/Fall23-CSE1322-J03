import java.util.Scanner;

public class ExampleA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number;

        try{
            System.out.print("Enter an integer: ");
            number = sc.nextInt();
            System.out.println("You entered: " + number);
        }
        catch(Exception e){
            System.out.println("Something went wrong");
        }
        finally{
            System.out.println("\n[Stoping the program]\n");
        }
    }
}
