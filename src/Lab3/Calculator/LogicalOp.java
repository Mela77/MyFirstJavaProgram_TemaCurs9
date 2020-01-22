package Lab3.Calculator;

public class LogicalOp {

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
    public String ex7(int r){
        if(r>3 && r!=4){
            return "The number is greater than 3 and not equal to 4.";
        }
        else if(r==4){
            return "The number is equal to 4";
        }
        else if(r<3){
            return "The number is lower than 3";
        }
        else{return "The number is greater than 3 and not equal to 4.";}
    }
    public void numberB(int s){
        switch (s){
            case 10:
                System.out.println("The number is 10"); break;
            case 11:
                System.out.println("The number is 11"); break;
            case 12:
                System.out.println("The number is 12"); break;
            case 13:
                System.out.println("The number is 13"); break;
            case 14:
                System.out.println("The number is 14"); break;
            case 15:
                System.out.println("The number is 15"); break;
            default:
                System.out.println("The number is not between 10 and 15");
        }
    }

    public boolean isNumberEven(int u){
        if(u % 2 ==0){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean isEligibleToVote(int age){
        if(age ==18 || age>18){
            return true;
        }
        else{
            return false;
        }
    }

    public String greatestNumber(int num1, int num2, int num3){
        if(num1>num2 && num1>num3){
            return "The greatest number is " + num1;
        }else if(num2>num1 && num2>num3){
            return "The greatest number is " + num2;
        }else
            return "The greatest number is " + num3;
        }









}