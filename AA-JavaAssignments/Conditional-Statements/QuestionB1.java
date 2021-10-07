//Write a program in Java to display the pattern like right angle triangle with a number
import java.util.Scanner;

public class QuestionB1 {
    public static void main(String[] args){

        
        int i,j,n;
        System.out.print("Input number of rows : ");
             Scanner in = new Scanner(System.in);
                 n = in.nextInt();
     
        for(i=1;i<=n;i++)
        {
         for(j=1;j<=i;j++)
           System.out.print(j);
     
         System.out.println("");
         }


    }
}
