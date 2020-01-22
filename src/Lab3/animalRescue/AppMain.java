package Lab3.animalRescue;

public class AppMain {

    public static void main(String[] args) {
        Dog rex = new Dog();
        rex.setName("Rex");
        System.out.println(rex.getName());
        rex.setAge(5);
        System.out.println(rex.getAge());
        rex.setRace("pug");
        System.out.println(rex.getRace());
        rex.setColour("black");
        System.out.println(rex.getColour());
        rex.setSize(35);
        System.out.println(rex.getSize());
        rex.setIsFriendly(true);
        System.out.println(rex.getIsFriendly());
        rex.run();
        rex.sleep();
        rex.eat();







        Animals baxter = new Animals();
        baxter.setName("Baxter");
        baxter.setAge(3);
        baxter.setHealth(7);
        baxter.setHunger(3);
        System.out.println("\nDog's name: " + baxter.getName());
        System.out.println("Dogs's age: " + baxter.getAge());
        System.out.println("Dog's level of health on a scale from 1 to 10: " + baxter.getHealth());
        System.out.println("Dog's level of huger on a scale from 1 to 10: " + baxter.getHunger());
        baxter.favouriteFood();
        System.out.println("Dog's favourite recreational activity is: ");
        baxter.favouriteRecreationalActivity();

        Animals lucky = new Animals();
        lucky.setName("Lucky");
        lucky.setAge(4);
        lucky.setHealth(9);
        lucky.setHunger(5);
        System.out.println("\nDog's name: " + lucky.getName());
        System.out.println("Dogs's age: " + lucky.getAge());
        System.out.println("Dog's level of health on a scale from 1 to 10: " + lucky.getHealth());
        System.out.println("Dog's level of huger on a scale from 1 to 10: " + lucky.getHunger());
        lucky.favouriteFood();
        System.out.println("Dog's favourite recreational activity is: ");
        lucky.favouriteRecreationalActivity();

        AnimalRescuers john = new AnimalRescuers();
        john.setName("John Snow");
        john.setAmountOfMoneyAvailable(1000);
        System.out.println("\nAnimal rescuer's name is: " + john.getName());
        System.out.println("Animal rescuer's amount of money available: " + john.getAmountOfMoneyAvailable());

        AnimalRescuers ben = new AnimalRescuers();
        ben.setName("Ben Adams");
        ben.setAmountOfMoneyAvailable(750.25f);
        System.out.println("\nAnimal rescuer's name is: " + ben.getAmountOfMoneyAvailable());
        System.out.println("Animal rescuer's amount of money available: " + ben.getAmountOfMoneyAvailable());

        Food itemA = new Food();
        itemA.setName("Pedigree Chopped ground dinner");
        itemA.setPrice(20.99f);
        itemA.setQuantity("250g");
        itemA.setInStock(true);
        System.out.println("\nProduct A in the food shop is: " + itemA.getName());
        System.out.println("Pedigree Chopped ground dinner's price is: " + itemA.getPrice());
        System.out.println("Pedigree Chopped ground dinner's quantity is: " + itemA.getQuantity());
        System.out.println("Pedigree Chopped ground dinner is available in the shop: " + itemA.getInStock());

        Food itemB = new Food();
        itemB.setName("Fresh bones");
        itemB.setPrice(3.99f);
        itemB.setQuantity("50g - 200g");
        itemB.setInStock(true);
        System.out.println("\nProduct B in the food shop is: " + itemB.getName());
        System.out.println("Pedigree Chopped ground dinner's price is: " + itemB.getPrice());
        System.out.println("Pedigree Chopped ground dinner's quantity is: " + itemB.getQuantity());
        System.out.println("Pedigree Chopped ground dinner is available in the shop: " + itemB.getInStock());

        MedicalStaff doctorA = new MedicalStaff();
        doctorA.setName("Charlie Carlton");
        doctorA.setSpeciality("Companion animals veterinarian");
        System.out.println("\nMedical staff's name: " + doctorA.getName());
        System.out.println("Medical staff's speciality: " + doctorA.getSpeciality());

        RecreationalActivitiesForAnimals activityA = new RecreationalActivitiesForAnimals();

        System.out.println("\nThe recreational activity for animals is:");
        activityA.name();



    }
}
