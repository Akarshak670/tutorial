
import java.util.Scanner;

public class akarshak07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your annual income: ");
        double income = Scanner.nextDouble();

        double tax = calculateTax(income);

        System.out.println("Income: $" + income);
        System.out.println("Tax: $" + tax);
    }

    public static double calculateTax(double income) {
        double tax = 0;

        if (income <= 50000) {
            tax = income * 0.1; // 10% tax for income up to $50,000
        } else if (income <= 100000) {
            tax = 50000 * 0.1 + (income - 50000) * 0.2; // 10% tax up to $50,000 and 20% tax for the rest up to $100,000
        } else {
            tax = 50000 * 0.1 + 50000 * 0.2 + (income - 100000) * 0.3; // 10% tax up to $50,000, 20% tax for income between $50,000 and $100,000, and 30% tax for income above $100,000
        }

        return tax;
    }
}

