package Lab2.animalRescue;

public class AppMain {

    public static void main(String[] args) {
        Dog rex = new Dog();
        System.out.println(rex.age);
        System.out.println(rex.name);

        rex.age = 5;
        System.out.println(rex.age);


        Animals baxter = new Animals();
        baxter.name = "Baxter";
        baxter.age = 3;
        baxter.health = 7;
        baxter.hunger = 3;
        System.out.println("\nDog's name: " + baxter.name);
        System.out.println("Dogs's age: " + baxter.age);
        System.out.println("Dog's level of health on a scale from 1 to 10: " + baxter.health);
        System.out.println("Dog's level of huger on a scale from 1 to 10: " + baxter.hunger);
        baxter.favouriteFood();
        System.out.println("Dog's favourite recreational activity is: ");
        baxter.favouriteRecreationalActivity();

        Animals lucky = new Animals();
        lucky.name = "Lucky";
        lucky.age = 4;
        lucky.health = 9;
        lucky.hunger = 5;
        System.out.println("\nDog's name: " + lucky.name);
        System.out.println("Dogs's age: " + lucky.age);
        System.out.println("Dog's level of health on a scale from 1 to 10: " + lucky.health);
        System.out.println("Dog's level of huger on a scale from 1 to 10: " + lucky.hunger);
        lucky.favouriteFood();
        System.out.println("Dog's favourite recreational activity is: ");
        lucky.favouriteRecreationalActivity();

        AnimalRescuers john = new AnimalRescuers();
        john.name = "John Snow";
        john.amountOfMoneyAvailable = 1000;
        System.out.println("\nAnimal rescuer's name is: " + john.name);
        System.out.println("Animal rescuer's amount of money available: " + john.amountOfMoneyAvailable);

        AnimalRescuers ben = new AnimalRescuers();
        ben.name = "Ben Adams";
        ben.amountOfMoneyAvailable = 750.25f;
        System.out.println("\nAnimal rescuer's name is: " + ben.name);
        System.out.println("Animal rescuer's amount of money available: " + ben.amountOfMoneyAvailable);

        Food itemA = new Food();
        itemA.name = "Pedigree Chopped ground dinner";
        itemA.price = 20.99f;
        itemA.quantity = "250g";
        itemA.inStock = true;
        System.out.println("\nProduct A in the food shop is: " + itemA.name);
        System.out.println("Pedigree Chopped ground dinner's price is: " + itemA.price);
        System.out.println("Pedigree Chopped ground dinner's quantity is: " + itemA.quantity);
        System.out.println("Pedigree Chopped ground dinner is available in the shop: " + itemA.inStock);

        Food itemB = new Food();
        itemB.name = "Fresh bones";
        itemB.price = 3.99f;
        itemB.quantity = "50g - 200g";
        itemB.inStock = true;
        System.out.println("\nProduct B in the food shop is: " + itemB.name);
        System.out.println("Pedigree Chopped ground dinner's price is: " + itemB.price);
        System.out.println("Pedigree Chopped ground dinner's quantity is: " + itemB.quantity);
        System.out.println("Pedigree Chopped ground dinner is available in the shop: " + itemB.inStock);

        MedicalStaff doctorA = new MedicalStaff();
        doctorA.name = "Charlie Carlton";
        doctorA.speciality = "Companion animals veterinarian";
        System.out.println("\nMedical staff's name: " + doctorA.name);
        System.out.println("Medical staff's speciality: " + doctorA.speciality);

        RecreationalActivitiesForAnimals activityA = new RecreationalActivitiesForAnimals();

        System.out.println("\nThe recreational activity for animals is:");
        activityA.name();











    }
}
