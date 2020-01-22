package Lab3.animalRescue;

public class Animals {

    private String name;
    private int age ;
    private int health ;
    private int hunger ;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setAge(int age){
         this.age = age;
    }
    public int getAge(){
        return age;
    }

    public void setHealth(int health){
        this.health = health;
    }
    public int getHealth(){
        return health;
    }

    public void setHunger(int hunger){
        this.hunger = hunger;
    }
    public int getHunger(){
        return hunger;
    }


    public void favouriteFood(){ System.out.println("Dog's favourite food is: small bones"); }
    public void favouriteRecreationalActivity(){ System.out.println("Running in the nature"); }
}
