abstract class Animal{
    private String name;
    private boolean alive;

    public Animal(String name){
        this.name = name;
        alive = true;
    }
    
    public abstract void makeNoise();

    public String getName(){
        return name;
    }

    public boolean isAlive(){
        return alive;
    }
}

abstract class Birds extends Animal{
    private boolean flier;

    public Birds(String name, boolean flier){
        super(name);
        this.flier = flier;
    }

    public void makeNoise(){
        System.out.println("");
    }

    public boolean canFly(){
        return flier;
    }
}

class Owl extends Birds{
    public Owl(String name){
        super(name, true);
    }

    @Override
    public void makeNoise(){
        System.out.print("Hoot Hoot ");
    }
}

class Penguin extends Birds{
    public Penguin(String name){
        super(name, false);
    }

    @Override
    public void makeNoise(){
        System.out.print("Noot Noot ");
    }
}

public class ExampleB {
    public static void main(String[] args) {
        Birds[] listOfBirds = new Birds[2];

        listOfBirds[0] = new Owl("Athena");
        listOfBirds[1] = new Penguin("Pingu");

        for(Birds b : listOfBirds){
            b.makeNoise();
            System.out.println("my name is " + b.getName() + (b.canFly() ? " and I can fly." : " and I cannot fly."));
        }
    }
}
