 import java.util.Scanner; 
public class q17 { 
    public static void main(String args[]) { 
        for(int i=5; i>=1; i--){ 
            for(int j=i; j>0; j--){ 
                // Use System.out.print to stay on the same line
                System.out.print(i + " "); 
            }
            // Use System.out.println to move to the next line after each row
            System.out.println(); 
        } 
    } 
} 
