import java.util.Scanner;

public class ConditionalS {
    public static void main(String[] args) {

        //conditional statements 

        Scanner sc = new Scanner(System.in);
        // pen = 10; notebook  = 40 

        int cash = sc.nextInt();
        if(cash < 10) {
            System.out.println("Cannot buy anything");
            System.out.println("get more cash");
        }

        else if(cash > 10 && cash < 40) {
            System.out.println("Can get 1 thing");

        }

        else {
            System.out.println("can get both");
        }




        }
    }
    

