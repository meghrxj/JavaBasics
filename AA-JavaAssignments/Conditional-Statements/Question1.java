//Write a Java program to get a number from the user and print whether it is positive or negative.
import java.util.Scanner;

public class Question1 {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Input Number: ");

        int input = sc.nextInt();

        if (input > 0) {
            System.out.println("Number is Positive");
        } else if (input < 0) {
            System.out.println("Number is Negative");
        } else {
            System.out.println("Number is Zero");
        }
 
        
sc.close();

    }
}
