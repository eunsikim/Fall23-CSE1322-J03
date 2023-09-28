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

public class ExampleB {
    public static void main(String[] args) {
        Birds owl = new Owl("Athena");

        if(owl instanceof Penguin){
            System.out.println(owl.getName() + " is a penguin");
        }
        else if(owl instanceof Owl){
            System.out.println(owl.getName() + " is an owl");
        }
    }
}
