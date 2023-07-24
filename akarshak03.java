import java.util.Scanner;

public class akarshak03 {
    public static void main(String[] args) {
        System.out.println("taking input from the user");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of eng");
        float a = sc.nextFloat();
        System.out.println("Enter the marks of phy");
        float b = sc.nextFloat();
        System.out.println("Enter the marks of chem");
        float c = sc.nextFloat();
        System.out.println("Enter the marsks of mathes");
        float d = sc.nextFloat();
        System.out.println("Enter the marks of computer");
        float e = sc.nextFloat();
        float x = (a + b + c + d + e) / 500;
        System.out.println(x);
        float percent = (x) * 100;
        System.out.println("percent = " + percent);
    }
}