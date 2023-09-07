import java.util.ArrayList;
import java.util.Scanner;

public class ExampleA {
    public static void main(String[] args) {
        //  Initial data (for demonstration)
        // Student 1 - Name: Alice, ID: 1000
        // Student 2 - Name: Bob, ID: 1001
        // Student 3 - Name: Charlie, ID: 1002
        // Student 4 - Name: David, ID: 1003
        // Student 5 - Name: Eve, ID: 1004
        // Student 6 - Name: Frank, ID: 1005
        // Student 7 - Name: Grace, ID: 1006
        // Student 8 - Name: Hannah, ID: 1007
        // Student 9 - Name: Ivy, ID: 1008
        // Student 10 - Name: Jack, ID: 1009

        //  Create an arraylist of students
    

        //  Add students into studentList

        printStudentList();

        //  Find a student

        //  Modify a student

        //  Remove a student
        //      Remove by Index
        //      Remove by object

        printStudentList();
    }

    public static void printStudentList(ArrayList<student> list){
        System.out.println("\n[Printing studentlist]");
        for(student s : list){
            System.out.println(s.getName() + "\t" + s.getId());
        }
        System.out.println();
    }
}

class student{
    private String name;
    private int id;

    public student(String name, int id){
        this.name = name;
        this.id = id;
    }
    
    public String getName(){
        return name;
    }

    public int getId(){
        return id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setId(int id){
        this.id = id;
    }
}
