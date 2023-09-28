interface ICanFly{
    public abstract void fly();
}

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

    public boolean canFly(){
        return flier;
    }  
}

class Owl extends Birds implements ICanFly{
    public Owl(String name){
        super(name, true);
    }

    public void makeNoise(){
        System.out.println("hoot");
    }

    public void fly(){
        System.out.println("Silent Flutter");
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

public class ExampleA {
    public static void main(String[] args) {
        Owl owl = new Owl("Athena");

        owl.fly();
    }
}
