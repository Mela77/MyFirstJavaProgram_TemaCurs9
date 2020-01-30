package Lab4.Lab3.animalRescue;

public class AppMain {

    public static void main(String[] args) {
        Dog baxter = new Dog();
        baxter.setName("Baxter");
        baxter.setAge(3);
        baxter.setRace("German Sheperd");
        baxter.setColour("Brown");
        baxter.setHealth(7);
        baxter.setHunger(3);
        System.out.println("\nDog's name: " + baxter.getName());
        System.out.println("Dogs's age: " + baxter.getAge());
        System.out.println("Dog's race: " + baxter.getRace());
        System.out.println("Dog's colour: " + baxter.getColour());
        System.out.println("Dog's level of health on a scale from 1 to 10: " + baxter.getHealth());
        System.out.println("Dog's level of huger on a scale from 1 to 10: " + baxter.getHunger());
        baxter.favouriteFood();
        System.out.println("Dog's favourite recreational activity is: ");
        baxter.favouriteRecreationalActivity();

        Dog lucky = new Dog();
        lucky.setName("Lucky");
        lucky.setAge(4);
        lucky.setColour("Brown");
        lucky.setRace("Husky");
        lucky.setHealth(9);
        lucky.setHunger(5);
        System.out.println("\nDog's name: " + lucky.getName());
        System.out.println("Dogs's age: " + lucky.getAge());
        System.out.println("Dog's race: " + lucky.getRace());
        System.out.println("Dog's colour: " + lucky.getColour());
        System.out.println("Dog's level of health on a scale from 1 to 10: " + lucky.getHealth());
        System.out.println("Dog's level of huger on a scale from 1 to 10: " + lucky.getHunger());
        lucky.favouriteFood();
        System.out.println("Dog's favourite recreational activity is: ");
        lucky.favouriteRecreationalActivity();

        Duck ducky = new Duck();
        ducky.setName("Ducky");
        ducky.setAge(2);
        ducky.setColour("Dark brown");
        ducky.setHealth(8);
        ducky.setHunger(9);
        System.out.println("\nDuck's name: " + ducky.getName());
        System.out.println("Duck's age " + ducky.getAge());
        System.out.println("Duck's colour "+ ducky.getColour());
        System.out.println("Duck's level of health on a scale from 1 to 10: " + ducky.getHealth());
        System.out.println("Duck's level of hunger on a scale from 1 to 10: " + ducky.getHunger());
        ducky.favouriteFood();
        System.out.println("Duck's favourite recreational activity is: ");
        ducky.favouriteRecreationalActivity();

        Rabbit bunny = new Rabbit();
        bunny.setName("Bunny");
        bunny.setAge(1);
        bunny.setColour("White with black ears");
        bunny.setHealth(7);
        bunny.setHunger(5);
        System.out.println("\nRabbit's name: " + bunny.getName());
        System.out.println("Rabbit's age " + bunny.getAge());
        System.out.println("Rabbit's colour "+ bunny.getColour());
        System.out.println("Rabbit's level of health on a scale from 1 to 10: " + bunny.getHealth());
        System.out.println("Rabbit's level of hunger on a scale from 1 to 10: " + bunny.getHunger());
        bunny.favouriteFood();
        System.out.println("Rabbit's favourite recreational activity is: ");
        bunny.favouriteRecreationalActivity();

        Cat tom = new Cat();
        tom.setName("Tom");
        tom.setAge(5);
        tom.setColour("Brown with black stripes");
        tom.setRace("Toyger");
        tom.setHealth(9);
        tom.setHunger(8);
        System.out.println("\nCat's name: " + tom.getName());
        System.out.println("Cat's age: " + tom.getAge());
        System.out.println("Cat's race: " + tom.getRace());
        System.out.println("Cat's colour: " + tom.getColour());
        System.out.println("Cat's level of health on a scale from 1 to 10: " + tom.getHealth());
        System.out.println("Cat's level of huger on a scale from 1 to 10: " + tom.getHunger());
        tom.favouriteFood();
        System.out.println("Cat's favourite recreational activity is: ");
        tom.favouriteRecreationalActivity();

        Hamsters apple = new Hamsters();
        apple.setName("Apple");
        apple.setAge(1);
        apple.setColour("Black");
        apple.setHealth(9);
        apple.setHunger(2);
        System.out.println("\nRabbit's name: " + apple.getName());
        System.out.println("Rabbit's age " + apple.getAge());
        System.out.println("Rabbit's colour "+ apple.getColour());
        System.out.println("Rabbit's level of health on a scale from 1 to 10: " + apple.getHealth());
        System.out.println("Rabbit's level of hunger on a scale from 1 to 10: " + apple.getHunger());
        apple.favouriteFood();
        System.out.println("Rabbit's favourite recreational activity is: ");
        apple.favouriteRecreationalActivity();

        AnimalRescuers john = new AnimalRescuers();
        john.setName("John Snow");
        john.setAge(32);
        john.setSex("Male");
        john.setAmountOfMoneyAvailable(1000);
        System.out.println("\nAnimal rescuer's name is: " + john.getName());
        System.out.println("Animal rescuer's age is :" + john.getAge());
        System.out.println("Animal rescuer's sex is :" + john.getSex());
        System.out.println("Animal rescuer's amount of money available: " + john.getAmountOfMoneyAvailable());

        AnimalRescuers ben = new AnimalRescuers();
        ben.setName("Ben Adams");
        ben.setAge(43);
        ben.setSex("Male");
        ben.setAmountOfMoneyAvailable(750.25f);
        System.out.println("\nAnimal rescuer's name is: " + ben.getName());
        System.out.println("Animal rescuer's age is :" + ben.getAge());
        System.out.println("Animal rescuer's sex is :" + ben.getSex());
        System.out.println("Animal rescuer's amount of money available: " + ben.getAmountOfMoneyAvailable());

        AnimalRescuers amanda = new AnimalRescuers();
        amanda.setName("Amanda Bay");
        amanda.setAge(58);
        amanda.setSex("Female");
        amanda.setAmountOfMoneyAvailable(1230);
        System.out.println("\nAnimal rescuer's name is: " + amanda.getName());
        System.out.println("Animal rescuer's age is :" + amanda.getAge());
        System.out.println("Animal rescuer's sex is :" + amanda.getSex());
        System.out.println("Animal rescuer's amount of money available: " + amanda.getAmountOfMoneyAvailable());

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
        doctorA.setAge(40);
        doctorA.setSex("Male");
        doctorA.setSpeciality("Companion animals veterinarian");
        System.out.println("\nMedical staff's name: " + doctorA.getName());
        System.out.println("Medical staff's age :" + doctorA.getAge());
        System.out.println("Medical staff's sex :" + doctorA.getSex());
        System.out.println("Medical staff's speciality: " + doctorA.getSpeciality());

        MedicalStaff nurseA = new MedicalStaff();
        nurseA.setName("Alisa Carlton");
        nurseA.setAge(37);
        nurseA.setSex("Female");
        nurseA.setSpeciality("Veterinarian nurse");
        System.out.println("\nMedical staff's name: " + nurseA.getName());
        System.out.println("Medical staff's age :" + nurseA.getAge());
        System.out.println("Medical staff's sex :" + nurseA.getSex());
        System.out.println("Medical staff's speciality: " + nurseA.getSpeciality());

        RecreationalActivitiesForAnimals activityA = new RecreationalActivitiesForAnimals();

        System.out.println("\nThe general recreational activity for animals is:");
        activityA.name();



    }
}
