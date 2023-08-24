public class ExampleA {
    public static void main(String[] args) {
        char[] charArr = new char[1];

        charArr[0] = 'a';

        for(int i = 0; i < charArr.length; i++){
            System.out.println(charArr[i]);
        }

        //  Create a new temp array to store the original values or charArr
        char[] temp = new char[charArr.length];
        for(int i = 0; i < charArr.length; i++){
            temp[i] = charArr[i];
        }

        //  Re-create charArr with double of its original size
        charArr = new char[charArr.length * 2];

        //  Re-insert old values (temp) into charArr
        for(int i = 0; i < temp.length; i++){
            charArr[i] = temp[i];
        }

        charArr[1] = 'b';

        for(int i = 0; i < charArr.length; i++){
            System.out.println(charArr[i]);
        }
    }    
}
