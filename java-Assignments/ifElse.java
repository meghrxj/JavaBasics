public class ifElse {

    public static void main(String[] args) {

        //logical operators
        // && operator
        int a = 30;
        int b = 60;

        if(a < 50 && b < 50) 
        System.out.println("both less than 50");
        else
        System.out.println("false fuckit");

        // ||
         if(a < 50 || b < 50) 
         System.out.println("atleast one less than 50");

 // ! 
 boolean isAdult = false;
        if(isAdult) 
        System.out.println("is adult");
        else
        System.out.println("not adult");
    }
}