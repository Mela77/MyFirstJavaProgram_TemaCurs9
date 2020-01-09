package Lab2;

public class Main {
    public static void main(String[] args) {

        printName("Hello \n" + "Mela");

        int x = sum (3,4);
        System.out.println("Rezultatul 3+4 este: " + x);

        float z = beta (3,4);
        System.out.println("Rezultatul 3/4 este: " + z);

        int y = alpha(-5, 8, 6);
        System.out.println("Rezultatul -5+8*6 este: " + y);

        float a = gamma(55,9,9);
        System.out.println("Rezultatul (55+9)%9 este: " + a);

        float b = delta(20, -3,5,8);
        System.out.println("Rezultatul 20+ -3*5/8 este: " + b);

        float c = omega(5, 15, 3, 2, 8);
        System.out.println("Rezultatul 5+15/3*2-8 %3 ete: " + c);



    }


        public static int sum(int x, int y){
        int sum = x+y;
        return sum;
    }

        public static float beta (float x, float y){
        float beta = x/y;
        return beta;
    }
        public static int alpha (int x, int y, int z){
        int alpha = x+(y*z);
        return alpha;
        }

        public static float gamma (float x, float y, float z){
        float gamma = (x+y) %z;
        return gamma;
    }
       public static float delta (float x, float y, float z, float v){
        float delta = x+((y*z)/v);
        return delta;
       }

       public static float omega (float a, float b, float c, float d, float e){
        float omega = (a+((b/c)*d)-e) %c;
        return omega;
       }

       public static void printName(String name){
           System.out.println(name);
       }





}