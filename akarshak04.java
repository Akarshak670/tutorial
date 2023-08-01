import java.util.Scanner;

public class akarshak04 {
    public static void main(String[] args) {
        int m1, m2, m3;
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER PHYSICS MARKS");
        m1 = sc.nextByte();
        System.out.println("ENTER CHEMISTRY MARKS");
        m2 = sc.nextByte();
        System.out.println("ENTER MATHES MARKS");
        m3 = sc.nextByte();
        float avg = (m1 + m2 + m3) / 3.0f;
        System.out.println("STUDENT OVER ALL PERCENT IS:" + avg);
        
        if (avg >= 40 && m1 > 33 && m2 >= 33 && m3 >= 33) {
            System.out.println("congrates you are promoted");
        } else {
            System.out.println("you are detained");
        }

    }

}