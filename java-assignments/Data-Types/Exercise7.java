import java.util.Scanner;

//Write a Java program that reads a number and display the square, cube, and fourth power.

public class Exercise7 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Input the side length value: ");

        double val = in.nextDouble();

        System.out.printf("\nSquare: %.2f\n", val * val );
		System.out.printf("Cube: %.2f\n", val * val * val);
		System.out.printf("Fourth Power: %.2f\n", Math.pow(val, 4));


in.close();
    }
}
