// Write a Java program that keeps a number from the user and generates an integer between 1 and 7 and displays the name of the weekday.
import java.util.Scanner;

public class Question5 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.println("Input Value: ");

        int input = in.nextInt();

        if(input == 1) {System.out.println("Monday");}
        else if(input == 2) {System.out.println("Tuesday");}
        else if(input == 3) {System.out.println("Wednesday");}
        else if(input == 4) {System.out.println("Thursday");}
        else if(input == 5) {System.out.println("Friday");}
        else if(input == 6) {System.out.println("Saturday");}
        else System.out.println("Sunday");


        in.close();

    }
}
