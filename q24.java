import java.util.Scanner;

public class q24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter marks for student " + i + ": ");
            int marks = sc.nextInt();

            if (marks >= 50) {
                System.out.println("Result: Passed");
            } else {
                System.out.println("Result: Failed");
            }
        }
    }
}
