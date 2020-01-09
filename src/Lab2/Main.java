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
            return x+y;
    }

        public static float beta (float x, float y){
            return x/y;
    }
        public static int alpha (int x, int y, int z){
            return x+ y*z;
        }

        public static float gamma (float x, float y, float z){
            return (x+y) %z;
    }
       public static float delta (float x, float y, float z, float v){
           return x+((y*z)/v);
       }

       public static float omega (float a, float b, float c, float d, float e){
           return (a+(b/c *d)-e) %c;
       }

       public static void printName(String name){
           System.out.println(name);
       }
       
}