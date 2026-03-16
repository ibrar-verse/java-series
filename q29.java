import java.util.Scanner;

public class q29 {

    // 1. Convert Celsius to Fahrenheit
    // Uses a 'char' as the second parameter
    static void convert(double c, char type) {
        double f = (c * 9 / 5) + 32;
        System.out.println(c + "° Celsius is " + f + "° Fahrenheit");
    }

    // 2. Convert Fahrenheit to Celsius
    // Uses an 'int' as the second parameter
    static void convert(double f, int type) {
        double c = (f - 32) * 5 / 9;
        System.out.println(f + "° Fahrenheit is " + c + "° Celsius");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Temperature Converter");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.print("Choose (1 or 2): ");
        int choice = sc.nextInt();

        System.out.print("Enter temperature value: ");
        double temp = sc.nextDouble();

        if (choice == 1) {
            // Calling method with (double, char)
            convert(temp, 'C'); 
        } else if (choice == 2) {
            // Calling method with (double, int)
            convert(temp, 1); 
        } else {
            System.out.println("Invalid choice!");
        }
    }
}

