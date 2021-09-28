public class BreakNCon {

    public static void main(String[] args){

        // BREAK & CONTINUE statements

        int e = 0;
        while(true) {

            if(e == 3) {       // continue case
                e = e + 1;          // pause the loop and continue 
                    continue;
            }

            if(e == 4) { 
                e = e + 1; 
                continue;
            }
            
            System.out.println(e);
            e = e + 1;

            if(e > 5) {
                break;   //break == stop the loop
            }
    
        }

    }
}
