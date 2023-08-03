import java.util.Scanner;
public class akarshak08 {
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter your income");
        float tax = 0;
        float income = sc.nextFloat();
        if(income<250000f){
            tax=tax+0;
        }
        else if(income>250000f && income<=500000f){
            tax=tax+0.05f*(income-250000f);
        }
        else if(income>500000f && income<=1000000f){
            tax=tax+0.05f*(500000f-250000f);
            tax=tax+0.2f*(income-500000f);
        }
        else if(income>1000000f ){
            tax=tax+0.05f*(500000f-250000f);
            tax=tax+0.2f*(1000000f-500000f);
            tax=tax+0.3f*(income-1000000f);
        }
        System.out.println("Total tax paid "+tax);
    }
}

