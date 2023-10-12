
public class ExampleA {
    public static int factorial(int number){
        if(number == 1){
            return 1;
        }
        
        return factorial(number-1) * number;
    }

    public static boolean palindrome (String word){
        if(word.length() <= 1){
            return true;
        }
        else if(word.charAt(0) != word.charAt(word.length() - 1)){
            return false;
        }

        return palindrome(word.substring(1, word.length() - 1));
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));

        String word = "civyc";

        if(palindrome(word)){
            System.out.println(word + " is a palindrome");
        }
        else{
            System.out.println(word + " is not a palindrome");
        }
    }
}
