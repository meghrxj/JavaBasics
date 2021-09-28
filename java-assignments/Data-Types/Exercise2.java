import java.util.Scanner;

public class Exercise2 {
 //   Write a Java program that reads a number in inches, converts it to meters.
    public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

System.out.println("Input number in inches: ");

double inches = sc.nextDouble();

double meters = inches * 0.0254;

System.out.println(inches + " in meters: " + meters);

sc.close();
    }
}
