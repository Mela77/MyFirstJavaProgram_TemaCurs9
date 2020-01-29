package Lab4.Lab3.Calculator;

public class LogicalOp {

    //Homework Lab3.

    public int checkBiggerNumber(int first, int second) {
        if (first > second) {
            return first;
        } else {
            return second;
        }
    }

    public String verifyText(String text) {
        if (text.equals("FastTrackIT")) {
            return ("Learning text comparison");
        } else {
            return ("Got to try some more");
        }
    }

    public void ex3(int x) {
        if (x >= 2 && x <= 8) {
            System.out.println(x);
        }
    }

    public String ex5(String textB, int p) {
        if (textB.equals("FastTrackIT") && p <= 3) {
            return ("FastTrackIT " + p);
        } else if (!textB.equals("FastTrackIT") && p >= 4) {
            return (p + " FastTrackIT");
        } else {
            return ("Error-I don't know");
        }
    }

    public String ex6(int q) {
        if (q > 8 || q == 6) {
            return "The amount of snow this winter was " + q + " cm.";
        } else {
            return "The forecast snow is " + q + " cm.";
        }
    }

    public String ex7(int r) {
        if (r > 3 && r != 4) {
            return "The number is greater than 3 and not equal to 4.";
        } else if (r == 4) {
            return "The number is equal to 4";
        } else if (r < 3) {
            return "The number is lower than 3";
        } else {
            return "The number is greater than 3 and not equal to 4.";
        }
    }

    public void numberB(int s) {
        switch (s) {
            case 10:
                System.out.println("The number is 10");
                break;
            case 11:
                System.out.println("The number is 11");
                break;
            case 12:
                System.out.println("The number is 12");
                break;
            case 13:
                System.out.println("The number is 13");
                break;
            case 14:
                System.out.println("The number is 14");
                break;
            case 15:
                System.out.println("The number is 15");
                break;
            default:
                System.out.println("The number is not between 10 and 15");
        }
    }

    public boolean isNumberEven(int u) {
        if (u % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEligibleToVote(int age) {
        if (age == 18 || age > 18) {
            return true;
        } else {
            return false;
        }
    }

    public String greatestNumber(int num1, int num2, int num3) {
        if (num1 > num2 && num1 > num3) {
            return "The greatest number is " + num1;
        } else if (num2 > num1 && num2 > num3) {
            return "The greatest number is " + num2;
        } else
            return "The greatest number is " + num3;
    }

//Lab4.

    //1. Given a number, while the number is equal to or lower than 100, print the number;
    //2. Write a java program to count backwards from a given number to a lower given
    //number

    public void printToHundread(int number) {
        for (int i = number; i <= 100; i++) {
            System.out.println("Numarul este:" + i);
        }
    }

    public void printFromHundred(int first, int second) {
        for (int i = first; i >= second; i--) {
            System.out.println(i);
        }
    }

    //Modify the program to sum from 111 to 8899, and compute the average. Introduce
    //an int variable called count to count the numbers in the specified range.

    public float getAverage(int first, int second) {
        float sum = 0;
        float average;
        int counter = 0;
        while (first <= second) {
            sum += first;
            first++;
            counter++;
        }
        average = sum / counter;
        return average;
    }

    // using For Loops write a program called SumAndAverage to produce the sum of 1,2,3,...,to 100.
    //also compute and display the average.

    public void sunAndAverage(int number) {
        int sum = 0;
        int count = 0;
        for (int i = number; i <= 100; i++) {
            count++;
            sum = sum + i;
        }
        System.out.println("Suma este: " + sum);
        System.out.println("Media este:" + sum / count);
    }

    public void evenNumbers(int number) {
        for (int i = number; i >= -100; i--) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public void oddNumbers(int first, int last) {
        for (int i = first; i >= last; i--) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    public void evenNo(int first, int second) {
        while (first > second) {
            first--;
            if (first % 2 == 0) {
                System.out.println(first);
            }
        }
    }

    // Homework Lab4. - Java For Loops
    // 1. Creati o metoda in clasa LogicalOp, care sa primeasca un numar ca si parametru.
    // Metoda sa verifice numarul primit, si sa afiseze in consola o numaratoare pana la 100,
    // pornind de la numarul primit ca si parametru.
    public void ex1(int number) {
        for (int i = number; i <= 100; i++) {
            System.out.println(i);
        }
    }

    // 2. Creati o metoda in clasa LogicalOp, care sa primeasca un numar ca si parametru.
    // Metoda sa verifice numrul primit, si sa afiseze in consola o numaratoare pana la -100,
    // pornind de la numarul primit ca si parametru.
    public void ex2(int number) {
        for (int i = number; i >= -100; i--) {
            System.out.print(i + ", ");
        }
    }

    // 3. Creati o metoda in clasa LogicalOp, care sa primeasca doi parametrii de tip numar.
    // Metoda sa afiseze o numaratoare intre cele doua numere primite, pornind de la primul parametru primit,
    // pana la cel de-al doilea(ex: daca int x e primul parametru iar int y  este cel de-al doilea,
    // numaratoarea sa se faca de la x, la y.
    public void ex3(int x, int y) {
        for (int i = x; i <= y; i++) {
            System.out.println("\n" + i);
        }
    }
    // 4. Creati o metoda in clasa LogicalOp, care sa primeasca doi parametrii de tip numar.
    // Metoda trebuie sa verifice care dintre cele doua numere este mai mare, si sa execute o numaratoare crescatoare
    // de la cel mai mic la cel mai mare.(ex: daca int x e primul parametru iar int y  este cel de-al doilea,
    // daca x  este mai mare decat y,  atunci numaratoarea sa fie de la y la x).
    public void ex4(int x, int y){
        if(x > y){
            for(int i = y; i<= x; i++){
                System.out.println(i);
            }
        }
        else if(y > x){
            for(int i = x; i<= y; i++){
                System.out.println(i);
            }
        }
        else{
            System.out.println("The numbers are equal!");
        }
    }
    // 5.Creati o metoda in clasa LogicalOp care sa afiseze toate numerele pare de la 1 la 100.
    public void ex5(int number) {
        for (int i = number; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i+", ");
            }
        }
    }
    // 6. Creati o metoda in clasa LogicalOp care sa afiseze toate numerele impare de la 1 la 100.
    public void exe6(int number) {
        for (int i = number; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
    // 7. Creati o metoda in clasa LogicalOp care sa primeasca un parametru de tip numar.
    // Metoda sa adune toate numerele pana la 100, pornind de la numarul primit ca si parametru, iar la final
    // sa returneze rezultatul. Apelati metoda in clasa Main, metoda main() pentru a verifica daca functioneaza.
    public int exe7(int number) {
        int sum = 0;
        int count = 0;
        for (int i = number; i <= 100; i++) {
            count++;
            sum = sum + i;
        }
        return sum;
    }
    // 8. Creati o metoda in clasa LogicalOp care sa primeasca un parametru de tip numar.
    // Metoda sa adune toate numerele pana la 100, pornind de la numarul primit ca si parametru,
    // si sa calculeze media numerelor. La final, metoda sa returneze media.
    // Apelati metoda in clasa Main, metoda main() pentru a verifica daca functioneaza.
    public float ex8 (int number) {
        float sum = 0;
        float count = 0;
        float average = 0;
        for (int i = number; i <= 100; i++) {
            count++;
            sum = sum + i;
            average = sum/count;
        }
        return average;
    }
    // 9. Creat o metoda in clasa LogicalOp care sa afiseze urmatorul tipar:
    //*******
    //******
    //*****
    //****
    //***
    //**
    //*

    public void ex9(int i, int j){
        for(i=7; i>0;i--){
            for(j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    // Homework Lab4. -  Java While Loop
    







}