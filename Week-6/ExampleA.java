class Boss{
    private int hp;
    private String type;
    private int damage;

    public Boss(){}

    public Boss(int hp, String type, int damage){
        this.hp = hp;
        this.type = type;
        this.damage = damage;
    }

    public int getHp(){
        return hp;
    }

    public String getType(){
        return type;
    }

    public int getDamage(){
        System.out.println("Boss slashes player dealing " + damage + " damage.");
        return damage;
    }

    public void takeDamage(int damage){
        hp -= damage;
        System.out.println("Boss has " + hp + " left");
    }
}

class Boss_early extends Boss{
    public Boss_early(){
        super(100, "normal", 40);
    }
}

class Boss_late extends Boss{
    public Boss_late(){
        super(50, "fire", 80);
    }
}

class Player{
    private int hp;
    private int damage;

    public Player(){}

    public Player(int hp, int damage){
        this.hp = hp;
        this.damage = damage;
    }

    public int getHp(){
        return hp;
    }

    public int getDamage(){
        System.out.println("Player punches boss dealing " + damage + " damage.");
        return damage;
    }

    public void takeDamage(int damage){
        hp -= damage;
        System.out.println("Player has " + hp + " left");
    }
}

public class ExampleA {
    public static void main(String[] args) {
        Player p1 = new Player(500, 20);

        Boss b = new Boss_early();

        boolean late_Boss_activated = false;

        while(b.getHp() > 0){
            System.out.println("[----------------------------------------]");
            b.takeDamage(p1.getDamage());

            if(b.getHp() < 0){
                System.out.println("Boss is dead");
            }
            else{
                if(b.getHp() < 30 && !late_Boss_activated){
                    b = new Boss_late();
                    late_Boss_activated = true;
                    System.out.println("Boss is infuriated and becomes of type " + b.getType() + " and takes a potion to regain health back to " + b.getHp());
                }
    
                p1.takeDamage(b.getDamage());
            }
        }
    }
}
