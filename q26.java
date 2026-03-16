public class q26
 {
    static void findMax(int a, int b) {
        if (a > b) {
            System.out.println("Max integer: " + a);
        } else {
            System.out.println("Max integer: " + b);
        }
    }

    
    static void findMax(double a, double b) {
        if (a > b) {
            System.out.println("Max double: " + a);
        } else {
            System.out.println("Max double: " + b);
        }
    }

    public static void main(String[] args) {
    
        findMax(15, 25);
        findMax(12.5, 8.2);
    }
}

