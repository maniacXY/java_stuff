import java.util.Scanner;

public class Calculator {
    public static void main (String  []args){
        System.out.println("This is one of my first 'Programs'");
        System.out.println("###### CALCULATOR ######");
        System.out.println("Give me something to calculate eg '20+16' (+,-,*,/): ");
        String myWorkString = input();
        String[] myCalcArray = myCalcArray(myWorkString);
        System.out.println("Result: " + calculator(myCalcArray));
    }
    public static double calculator(String[] myReturnArr) {
        double value = 0;
        if (myReturnArr[2].contains("+")) {
            value = Double.parseDouble(myReturnArr[0]) + Double.parseDouble(myReturnArr[1]);
        } else if (myReturnArr[2].contains("-")) {
            value = Double.parseDouble(myReturnArr[0]) - Double.parseDouble(myReturnArr[1]);
        } else if (myReturnArr[2].contains("*")) {
            value = Double.parseDouble(myReturnArr[0]) * Double.parseDouble(myReturnArr[1]);
        } else if (myReturnArr[2].contains("/")) {
            value = Double.parseDouble(myReturnArr[0]) / Double.parseDouble(myReturnArr[1]);
        } else {
            System.out.println("Something went Wrong");
        }
        return value;
    }
    public static String input(){
        System.out.print("Calculation: ");
        Scanner myScanner= new Scanner(System.in);
        String myString = myScanner.next();
        return myString;
    }
    public static String[] myCalcArray(String myString){
        char [] chars = {'+', '-', '*', '/'};
        String [] myStringArr = new String[4];
        String myVar = "";
        for (int i = 0; i < chars.length; i++){
            if (myString.indexOf(chars[i]) > 0){
                myVar = String.valueOf(chars[i]);
                String formatted = String.format("\\%s",myVar);
                myStringArr = myString.split(formatted);
            }
        }
        String[] myReturnArr = {myStringArr[0], myStringArr[1], myVar};
        return myReturnArr;
    }
}