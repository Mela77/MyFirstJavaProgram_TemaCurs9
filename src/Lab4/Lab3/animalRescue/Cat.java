package Lab4.Lab3.animalRescue;

public class Cat extends Animals {

    private boolean isFriendly;



    public boolean isFriendly() {
        return isFriendly;
    }

    public void setFriendly(boolean friendly) {
        isFriendly = friendly;
    }

    public void favouriteFood(){ System.out.println("Cat's favourite food is: milk"); }
    public void favouriteRecreationalActivity(){ System.out.println("Chasing mice"); }
}
