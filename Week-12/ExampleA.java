//  The program will initialize two large arrays of integers and perform an addition
//  operation for each number of the two arrays. 

class additionMachine implements Runnable{
    private int[] array1;
    private int[] array2;
    private static int Counter = 0;
    private int ID;

    public additionMachine(int[] array1, int[] array2){
        this.array1 = array1;
        this.array2 = array2;
        this.ID = Counter++;
    }

    @Override
    public void run(){
        for(int i = 0; i < array1.length; i++){
            System.out.print("Machine " + ID + " ");
            System.out.println("Operation: " + array1[i] + " + " + array2[i] + " = " + (array1[i] + array2[i]));
        }
    }
}

public class ExampleA {
    private final static int SIZE = 100;
    private final static int START = 0;
    private final static int HALF = SIZE / 2;
    public static void main(String[] args) {
        int[] array1 = new int[SIZE];
        int[] array2 = new int[SIZE];

        for(int i = 0; i < array1.length; i++){
            array1[i] = i; 
        }
        for(int i = 0; i < array2.length; i++){
            array2[i] = i; 
        }

        Thread machine0 = new Thread(new additionMachine(
                                        subArray(array1, START, HALF), 
                                        subArray(array2, START, HALF) 
                                        )
                                    );
        Thread machine1 = new Thread(new additionMachine(
                                        subArray(array1, HALF, HALF), 
                                        subArray(array2, HALF, HALF)
                                        )
                                    );
         
        machine0.start();
        machine1.start();
    }

    //  This function returns a subarray of the array passed as an argument
    //  given a starting point and a size
    public static int[] subArray(int[] array, int start, int size){
        int[] newArr = new int[size];

        for(int i = 0; i < size; i++){
            newArr[i] = array[start];
            start++;
        }

        return newArr;
    }
}
