import java.util.Scanner;
//Write a Java program that accepts two integers and then prints the sum, the difference, the product, the average, the distance (the difference between integer), the maximum (the larger of the two integers), the minimum (smaller of the two integers).
public class Exercise8 {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input 1st integer: ");
        int first = sc.nextInt();
        System.out.print("Input 2nd integer: ");
        int second = sc.nextInt();

        System.out.printf("Sum of two integers: %d%n", first + second);
        System.out.printf("Difference of two integers: %d%n", first - second);
        System.out.printf("Product of two integers: %d%n", first * second);
        System.out.printf("Average of two integers: %.2f%n", (double) (first + second) / 2);
        System.out.printf("Distance of two integers: %d%n", Math.abs(first - second));
        System.out.printf("Max integer: %d%n", Math.max(first, second));
        System.out.printf("Min integer: %d%n", Math.min(first, second));

        sc.close();
    }
}
