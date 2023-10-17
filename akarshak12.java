import java.util.Scanner;
public class akarshak12 {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a value");
        double a=sc.nextDouble();
        System.out.println("Enter b value");
        double b=sc.nextDouble();
        System.out.println("Enter c value");
        double c=sc.nextDouble();
        double result=b*b-4.0*a*c;
        if(result>0.0){
            double r1 = (-b+pow(result,0.5))/(2.0*a);
            double r2 =(-b-pow(result,0.5))/(2.0*a);
            System.out.println("+r1 and+r2");
        }
        else if(result==0.0){
            double r1=-b/(2.0*a);
            System.out.println("+r1");
        }
        else{
            System.out.println("the equation has no real roots");
        }
        

    }
    
}
