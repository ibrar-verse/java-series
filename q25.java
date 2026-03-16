public class q25 {

    static void calculate(double r) {
        System.out.println("Area of Circle: " + (3.14 * r * r));
    }

    static void calculate(int l, int w) {
        System.out.println("Area of Rectangle: " + (l * w));
    }

    static void calculate(int s) {
        System.out.println("Area of Square: " + (s * s));
    }

    public static void main(String[] args) {
        calculate(5.5);    // Calls Circle (because of decimal)
        calculate(10, 20); // Calls Rectangle (because of 2 numbers)
        calculate(5);      // Calls Square (because of 1 whole number)
    }
}

