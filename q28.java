public class q28 {

    static void calculateSalary(double base, double bonus) {
        double total = base + bonus;
        System.out.println("Full-time Salary (Base + Bonus): " + total);
    }

    static void calculateSalary(int hours, double rate) {
        double total = hours * rate;
        System.out.println("Part-time Salary (Hours * Rate): " + total);
    }

    public static void main(String[] args) {
        
        calculateSalary(50000.0, 5000.0);

       
        calculateSalary(40, 25.5);
    }
}

