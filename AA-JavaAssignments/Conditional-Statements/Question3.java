//Take three numbers from the user and print the greatest number.
import java.util.Scanner;

public class Question3 {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Input the First Number: ");
        int number1 = input.nextInt();
        System.out.println("Input the Second Number: ");
        int number2 = input.nextInt();
        System.out.println("Input the Third Number: ");
        int number3 = input.nextInt();

        if (number1 > number2){
            System.out.println("The greatest: " + number1);

        } else if (number2 > number3){
            System.out.println("The greatest: " + number2);

        } else {
            System.out.println("The greatest: " + number3);
        }


input.close();



    }
    
}
