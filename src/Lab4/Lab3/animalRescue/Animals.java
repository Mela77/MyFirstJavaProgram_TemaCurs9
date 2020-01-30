package Lab4.Lab3.animalRescue;

public class Animals {

    private String name;
    private int age ;
    private String race;
    private String colour;
    private float weight;
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

    public void setRace(String race){this.race = race;}
    public String getRace(){return race;}

    public void setColour(String colour){this.colour = colour;}
    public String getColour(){return colour;}

    public void setWeight(float size){
        this.weight = size;
    }
    public float getWeight(){
        return weight;
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



}
