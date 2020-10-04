package com.gabrielikpaetuk;
import java.util.Scanner;

public class Main {

    public  String stringToHexadecimal(String str ) {
        //Variable declaration, for the final result
        String result;

        //Creates a stringBuilder
        StringBuilder hexValue = new StringBuilder();

        //Converting string to character array
        char[] ch = str.toCharArray();

        //Loops through each character
        //And finds the corresponding Hex value
        for (char i : ch) {
            String hexString = Integer.toHexString(i);
            hexValue.append(hexString).append(" ");
        }
        //Converts hexValue to a string and assigns it to result
        result = hexValue.toString();
        return result;
    }
    public static void main(String[] args){
        //Creates a new scanner
        Scanner input = new Scanner(System.in);

        //Prints the welcome message
        System.out.println("Welcome, this is a string to hexadecimal converter.");
        System.out.print("Would you like to proceed? Enter 1 for yes/ Enter 0 for no: ");
        //Gets the user input
        int response = input.nextInt();

        //Loops through until the user quits
        while (true) {
            if (response != 0 && response != 1){
                System.out.println("Invalid Entry.");
                System.out.print("Would you like to proceed? Enter 1 for yes/ Enter 0 for no: ");
                response = input.nextInt();
            }

            //Checks if the user wants to continue with the calculation
            if (response == 1){
                System.out.print("Enter a String: ");
                String str = input.next();

                Main obj = new Main();
                //Prints out the answer
                System.out.println(str + " hexadecimal Value is: " + obj.stringToHexadecimal(str));

                System.out.print("Would you like to proceed? Enter 1 for yes/ Enter 0 for no: ");
                response = input.nextInt();

            } else if (response == 0) { //Checks if the user wants to quit,
                //If yes, prints a good bye message
                System.out.print("Goodbye!!!");
                break;
            }
        }
    }
}