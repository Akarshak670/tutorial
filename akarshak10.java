import java.util.Scanner;
public class akarshak10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  first number ");
        int a=sc.nextInt();
        System.out.println("Enter second number");
        int b=sc.nextInt();
        if(a==b){
            System.out.println("Equal");
        }
        else if(a>b){
            System.out.println("a  greater then b");
        }
        else {
            System.out.println("a  less then b");
        }
    }
}
    

