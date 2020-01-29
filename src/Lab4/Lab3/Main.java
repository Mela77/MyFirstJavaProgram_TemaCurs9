package Lab4.Lab3;

import Lab4.Lab3.Calculator.Calculator;
import Lab4.Lab3.Calculator.LogicalOp;

public class Main {

    public static void main(String[] args) {

        // Homework Lab3.

        Calculator temaLab2 = new Calculator();

        System.out.println("\nExercitiul 1.");

        int x = temaLab2.sum(3, 4);
        System.out.println(" \n Rezultatul 3+4 este: " + x);

        float z = temaLab2.beta(3, 4);
        System.out.println(" Rezultatul 3/4 este: " + z);

        int y = temaLab2.alpha(-5, 8, 6);
        System.out.println(" Rezultatul -5+8*6 este: " + y);

        float a = temaLab2.gamma(55, 9, 9);
        System.out.println(" Rezultatul (55+9)%9 este: " + a);

        float b = temaLab2.delta(20, -3, 5, 8);
        System.out.println(" Rezultatul 20+ -3*5/8 este: " + b);

        float c = temaLab2.omega(5, 15, 3, 2, 8);
        System.out.println(" Rezultatul 5+15/3*2-8 %3 ete: " + c);

        System.out.println("\nEx 2.");

        System.out.println("\n Reultatul adunarii 3+4 este: " + x);

        int d = temaLab2.dif(3, 4);
        System.out.println(" Rezultatul scaderii 3-4 este:" + d);
        int e = temaLab2.mult(3, 4);
        System.out.println(" Rezultatul inmultirii 3*4 este:" + e);
        float f = temaLab2.div(3, 4);
        System.out.println(" Rezultatul impartirii 3/4 este:" + f);


        System.out.println("\nEx 4.");

        float g = temaLab2.mean(7, 10, 14);
        System.out.println("\n Media numerelor 7,10 si 14 este: " + g);


        System.out.println("\nEx 6.");
        int h = temaLab2.rem(30, 4);
        System.out.println(" Restul impartirii 30/4 este: " + h);

        System.out.println("\nEx 7.");
        double i = temaLab2.degree(250);
        System.out.println("\n 250 grade Fahrenheit reprezinta " + i + " grade Celsius");

        System.out.println("\nEx 8.");
        float j = temaLab2.inch(14);
        System.out.println("\n 14 inch reprezinta " + j + " metrii");

        System.out.println("\nEx 9.");
        float k = temaLab2.speedMps(1500, 4, 29, 7);
        float l = temaLab2.speedKph(1500, 4, 29, 7);
        float m = temaLab2.speedMph(1500, 4, 29, 7);
        System.out.println("\n Pentru distanta de 1500m si timpul de 4h 29min 7sec");
        System.out.println(" Viteza in metrii/secunda este de: " + k);
        System.out.println(" Viteza in kilometrii/ora este de: " + l);
        System.out.println(" Viteza in mile/ora este de: " + m);


        LogicalOp op = new LogicalOp();

        //Exercitiul 3. In clasa LogicalOp, creati o metoda de tip int, care sa se numeasca checkBiggerNumber(),
        // si sa primeasca doua int-uri ca si parametrii. Folosind if - else,
        // verificati in interiorul metode care numar este mai mare,
        // dintre cele doua valori care va vin ca si parametrii, si returnati numarul mai mare.

        int biggest = op.checkBiggerNumber(3, 8);
        System.out.println("\nThe biggest number is:" + biggest);

        // Exercitiul 4. Creati o metoda de tip String, care sa primeasca un parametru de tip String.
        // Verificati daca textul ce vine ca si parametru este egal cu “FastTrackIT”.
        // Daca da, atunci metoda sa returneze “Learning text comparison”.
        // Daca nu, atunci metoda sa returneze “Got to try some more”.

        String text = "FastTrack";
        System.out.println(op.verifyText(text));

        System.out.println("\nGiven a number, if it’s equal to or higher than 2 and equal to or lower than 8, print the\n" +
                "number:");

        int number = 5;
        op.ex3(number);

        //Exercitiul 5. Creati o metoda de tip String, care sa primeasca un parametru de tip String,
        // si un parametru de tip int. Daca textul primit ca si parametru este egal cu “FastTrackIT”,
        // si numarul primit ca si parametru este mai mic sau egal cu 3,
        // returnati textul si numarul, in ordinea asta. Daca textul nu este “FastTrackIT” si
        // numarul este mai mare sau egal cu 4, returnati numarul si textul, in ordinea asta.
        // Apelati metoda in main() pentru a verifica daca functioneaza.

        String textB = "FastTrack";
        int p = 7;
        System.out.println(op.ex5(textB, p));

        //Exercitiul 6. Creati o metoda de tip String, care sa primeasca un parametru de tip int.
        // Daca numarul primit este mai mare de 8, SAU egal cu 6, atunci sa se returneze
        // “The amount of snow this winter was(cm): “ si numarul. Daca nu, sa printeze
        // “The forecast snow is(cm):” si numarul. Apelati metoda in main() pentru a verifica daca functioneaza.

        int q = 10;
        System.out.println(op.ex6(q));

        //Exercitiul 7. Creati o metoda de tip String, care sa primeasca un parametru de tip numar.
        // Daca numarul e mai mare decat 3, SI nu egal cu 4, returnati
        // “The number is greater than 3 and not equal to 4”. Daca numarul este egal cu 4,
        // returnati “The number is equal to 4”, iar daca numarul este mai mic de 3
        // returnati “The number is lower than 3”. Apelati metoda in main() pentru a verifica daca functioneaza.

        int r = 24;
        System.out.println(op.ex7(r));

        //Exercitiul 8. Creati o metoda care primeste un numar ca si parametru si sa afiseze ce numar a primit.
        // Folosind constructia Switch-Case, verificati ce numar s-a primit si afisati textul
        // "The number is:  x !" unde x trebuie sa reprezinte numarul apasat.
        // Pentru exemplul de fata sa nu se foloseasca concatenarea stringului
        // "The number is:" cu numarul de la parametru,
        // ci sa se scrie intreg textul cu tot cu numar pentru fiecare caz din Switch-Case.
        // Apelati metoda in main() pentru a verifica daca functioneaza.

        int s = 12;
        op.numberB(s);


        // Exercitiul 9. Creati o metoda care sa se numeasca isNumberEven. Metoda trebuie sa primeasca
        // ca parametru un numar, si sa returneze adevarat sau fals. Daca numarul e par sa returneze
        // true iar daca e impar sa returnese false. Apelati metoda in main() pentru a verifica daca functioneaza.


        int u = 15;
        System.out.println(op.isNumberEven(u));

        //Exercitiul 10. Creati o metoda care sa se numeasca isEligibleToVote.
        // Metoda sa primeasca ca si parametru un numar, care sa reprezinte varsta,
        // iar metoda sa iti zica daca daca persoana are drept de vot. Daca varsta e peste 18,
        // sa se returneze true iar daca nu, sa returneze false.
        // Apelati metoda in main() pentru a verifica daca functioneaza.

        int age = 21;
        System.out.println(op.isEligibleToVote(age));

        //Exerctiul 11. Creati o metoda care sa primeasca 3 numere ca si parametrii
        // si sa returneze cel mai mare numar. Apelati metoda in main() pentru a verifica daca functioneaza.

        int num1 = 29;
        int num2 = 67;
        int num3 = 42;
        System.out.println(op.greatestNumber(num1, num2, num3));

//Lab 4.

        op.printToHundread(80);
        op.printFromHundred(30,20);
        System.out.println(op.getAverage(111,8899));

        int i2=1;
        while (i2<=100){
            System.out.println(i2);
            i2++;
        }



        op.sunAndAverage(0);
        op.evenNumbers(0);
        op.oddNumbers(-50, -98);
        op.evenNo(0, -100);

//Homework Lab4. - Java For Loops
        //Ex.1:
        op.ex1(77);
        //Ex.2:
        op.ex2(7);
        //Ex.3:
        op.ex3(7,14);
        //Ex.4:
        op.ex4(14,7);
        //Ex.5:
        op.ex5(0);
        //Ex.6:
        op.exe6(0);
        //Ex.7:
        System.out.println(op.exe7(7));
        //Ex.8:
        System.out.println(op.ex8(7));
        //Ex.9:
        op.ex9(0,0);












    }
}
