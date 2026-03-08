import java.util.Scanner; 
public class q16 { 
    public static void main(String args[]) { 
        for(int i=1; i<=5; i++){ 
            for(int j=1; j<=i; j++){ 
                // Use System.out.print to stay on the same line
                System.out.print(i + " "); 
            }
            // Use System.out.println to move to the next line after each row
            System.out.println(); 
        } 
    } 
}
