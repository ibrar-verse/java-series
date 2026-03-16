import java.util.Scanner;

public class q27 {

    static void calculateInterest(double p, double r, double t) {
        double si = (p * r * t) / 100;
        System.out.println("---------------------------");
        System.out.println("The Simple Interest is: " + si);
        System.out.println("Total Amount (P + SI): " + (p + si));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal amount: ");
        double p = sc.nextDouble();

        System.out.print("Enter Rate of interest: ");
        double r = sc.nextDouble();

        System.out.print("Enter Time (in years): ");
        double t = sc.nextDouble();

        calculateInterest(p, r, t);
    }
}
