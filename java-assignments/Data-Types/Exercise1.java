import java.util.Scanner;

//Write a Java program to convert temperature from Fahrenheit to Celsius degree

public class Exercise1 {
   
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Input a degree in Fahrenheit: ");

        double fahrenheit = sc.nextDouble();

        double celsius = ((5 * (fahrenheit - 32.0)) / 9.0);
        System.out.println(fahrenheit + " degree Fahrenheit is equal to " + celsius + " in Celcius");
   
		sc.close();
     }
}