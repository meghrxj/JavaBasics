//Write a program in Java to make such a pattern like right angle triangle with a number which will repeat a number in a row.

import java.util.Scanner;

public class QuestionB2 {

    public static void main(String[] args) {

    int i,j,n;

        System.out.println("Input the Number of n : ");
        Scanner in  = new Scanner(System.in);

        n = in.nextInt();

        for(i=1;i<=n;i++) {

            for(j=1;j<=i;j++)
            System.out.print(i);

        System.out.println("");
        }



    }
    
}
