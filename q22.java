import java.util.Scanner; 

public class q22 { 
    public static void main(String args[]) { 
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 5; i++) {
            int price = 1000;
            System.out.println("Enter the age of person: " + (i + 1));
            int age = sc.nextInt();

            if(age < 12) {
                System.out.println("Child");
                price -= 500;
            } else if(age >= 70) {
                System.out.println("Senior");
                price -= 600;
            } 

            System.out.println("The price of ticket for person " + (i + 1) + " is: " + price);
            System.out.println("---------------------------");
        }
    } 
}

