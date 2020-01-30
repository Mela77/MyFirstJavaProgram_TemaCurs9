package Lab4.Lab3.animalRescue;

public class Dog extends Animals {


    private boolean isFriendly;


    public void setIsFriendly(boolean isFriendly){
        this.isFriendly = isFriendly;
    }
    public boolean getIsFriendly(){
        return isFriendly;
    }



    public void favouriteFood(){ System.out.println("Animal's favourite food is: small bones"); }
    public void favouriteRecreationalActivity(){ System.out.println("Running in the nature"); }


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
