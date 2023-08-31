public class ExampleA {
    public static void main(String[] args) {
        Student s1 = new Student("John");

        System.out.println(s1);
        System.out.println("ID COUNTER: " + s1.idCount);

        Student s2 = new Student("Eun Sik");

        System.out.println(s2);
        System.out.println("ID COUNTER: " + s1.idCount);
    }
}

class Student{
    private String name;
    public static int idCount = 1;
    private int id;

    public Student(String name){
        this.name = name;
        this.id = idCount;
        idCount++;
    }

    public Student(){

    }

    public int getID(){
        return id;
    }

    @Override // Optional, but it is safety/precautionary line overriding a method.
    public String toString(){
        return "Student name: " + name + "\nStudent id: " + id;
    }
}
