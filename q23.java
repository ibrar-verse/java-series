import java.util.Scanner;

public class q23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int hour = 1; hour <= 4; hour++) {
            System.out.print("Enter temperature for Hour " + hour + ": ");
            int temp = sc.nextInt();

            if (temp > 80) {
                System.out.println("Status: CRITICAL");
            } else if (temp >= 51 && temp <= 80) {
                System.out.println("Status: NORMAL");
            } else {
                System.out.println("Status: IDLE");
            }
        }
    }
}

