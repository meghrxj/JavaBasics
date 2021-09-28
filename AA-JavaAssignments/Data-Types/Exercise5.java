import java.util.Scanner;
// Write a Java program to compute body mass index (BMI).

public class Exercise5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Input weight in kg: ");
        double weight = sc.nextDouble();

        System.out.println("Input height in meters: ");
        double height = sc.nextDouble();

        double BMI = weight / (height * height);

        System.out.println("Your Body Mass Index is: " + BMI);
        
		sc.close();
    }
}
