package Lab3.animalRescue;

public class Dog {

    private String name ;
    private String race;
    private float age;
    private String colour;
    private int size ;
    private boolean isFriendly;


    public void setName(String name){
         this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setRace(String race){
        this.race = race;
    }
    public String getRace(){
        return race;
    }

    public void setAge(float age){
        this.age = age;
    }
    public float getAge(){
        return age;
    }

    public void setColour(String colour){
        this.colour = colour;
    }
    public String getColour(){
        return colour;
    }

    public void setSize(int size){
        this.size = size;
    }
    public int getSize(){
        return size;
    }

    public void setIsFriendly(boolean isFriendly){
        this.isFriendly = isFriendly;
    }
    public boolean getIsFriendly(){
        return isFriendly;
    }



    public void run(){
        System.out.println("(tries to) Run all day");
    }
    public void sleep(){
        System.out.println("zzzZzzzZZzz snores...");
    }
    public void eat(){
        System.out.println("Eating a bone");
    }

}
