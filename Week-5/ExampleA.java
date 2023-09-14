class Animal{
    private String name;
    private boolean alive;

    public Animal(String name){
        this.name = name;
        alive = true;
    }
    
    public void makeNoise(){
        System.out.println("This animal is making a noise");
    }

    public String getName(){
        return name;
    }
}

class Dog extends Animal{
    private int numberOfLegs;
    
    public Dog(String name, int numberOfLegs){
        super(name);
        this.numberOfLegs = numberOfLegs;
    }

    @Override
    public void makeNoise(){
        System.out.println("Bark");
    }
}

public class ExampleA {
    public static void main(String[] args) {
        Dog d1 = new Dog("Spots", 4);

        d1.makeNoise();

        System.out.println(d1.getName());
    }
}
