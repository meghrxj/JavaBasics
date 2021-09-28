public class expHandling {
    
    public static void main(String[] args) {
        // TRY - CATCH in EXCEPTION HANDLING

        int[] marks = {97, 98, 95};

        try {
            System.out.println(marks[5]);
        } catch(Exception exception) {
            //do soemthing after catching
            System.out.println("I catched the error");
        }
        System.out.println("The name is Aman");


    }
}
