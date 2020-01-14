package Lab2;

public class Main {
    public static void main(String[] args) {

        printName("Exercitiul 1. \n\n Hello \n" + " Mela");

        int x = sum (3,4);
        System.out.println(" Rezultatul 3+4 este: " + x);

        float z = beta (3,4);
        System.out.println(" Rezultatul 3/4 este: " + z);

        int y = alpha(-5, 8, 6);
        System.out.println(" Rezultatul -5+8*6 este: " + y);

        float a = gamma(55,9,9);
        System.out.println(" Rezultatul (55+9)%9 este: " + a);

        float b = delta(20, -3,5,8);
        System.out.println(" Rezultatul 20+ -3*5/8 este: " + b);

        float c = omega(5, 15, 3, 2, 8);
        System.out.println(" Rezultatul 5+15/3*2-8 %3 ete: " + c);

        printName("\nExercitiul 2.");

        System.out.println("\n Reultatul adunarii 3+4 este: " + x);

        int d = dif(3,4);
        System.out.println(" Rezultatul scaderii 3-4 este:" + d);
        int e = mult(3,4);
        System.out.println(" Rezultatul inmultirii 3*4 este:" + e);
        float f = div(3,4);
        System.out.println(" Rezultatul impartirii 3/4 este:" + f);

        printName(" \nExercitiul 3.");
        printName(" \n    J    a    V     V   a");
        printName("    J   a a    V   V   a a");
        printName(" J  J  aaaaa    V V   aaaaa");
        printName("  JJ  a     a    V   a     a");

        printName("\nExercitiul 4.");

        float g = mean(7,10,14);
        System.out.println("\n Media numerelor 7,10 si 14 este: " + g);

        printName("\nExercitiul 5.");

        printName("\n  +\"\"\"\"\"+ ");
        printName(" [| o o |]");
        printName("  |  ^  |");
        printName("  | '-' |");
        printName("  +-----+");

        printName("\nExercitiul 6.");
        int h = rem(30,4);
        System.out.println(" Restul impartirii 30/4 este: " + h);

        printName("\nExercitiul 7.");
        double i = degree (250);
        System.out.println("\n 250 grade Fahrenheit reprezinta " + i +" grade Celsius");

        printName("\nExercitiul 8.");
        float j=inch(14);
        System.out.println("\n 14 inch reprezinta " + j +" metrii");

        printName("\nExercitiul 9.");
        float k = speedMps(1500, 4,29,7);
        float l = speedKph(1500,4,29,7);
        float m = speedMph(1500,4,29,7);
        printName("\n Pentru distanta de 1500m si timpul de 4h 29min 7sec");
        System.out.println(" Viteza in metrii/secunda este de: " + k);
        System.out.println(" Viteza in kilometrii/ora este de: " + l);
        System.out.println(" Viteza in mile/ora este de: " + m);




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

        public static int dif (int x, int y){
            return x-y;
        }
        public static int mult (int x, int y){
            return x*y;
        }
        public static float div(float x, float y){
            return x/y;
        }
        public static float mean(float x, float y, float z){
            return (x+y+z)/3;
        }
        public static int rem(int x, int y) {
        return x % y;
        }
        public static double degree (double f){
            return ((5 *(f-32.0)) /9.0);
        }
        public static float inch(float x){
            return x*0.0254f;
        }
        public static float speedMps(float dist, float hr,float min, float sec ){
            float timeSeconds = (hr*3600)+(min*60)+sec;
            return dist/timeSeconds;
        }
        public static float speedKph(float dist, float hr,float min, float sec ) {
            float timeSeconds = (hr * 3600) + (min * 60) + sec;
            return (dist / 1000.0f) / (timeSeconds / 3600.0f);
        }
        public static float speedMph(float dist, float hr,float min, float sec ) {
            float timeSeconds = (hr * 3600) + (min * 60) + sec;
            float kph = (dist / 1000.0f) / (timeSeconds / 3600.0f);
            return kph / 1.609f;
        }


       
}