import java.util.Scanner;
public class akarshak11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("please Enter a number");
        int a=sc.nextInt();
        if(a<0){
            System.out.println("negetive number");
        }
        else if(a>0){
            System.out.println("Positive number");
        }
        else{
            System.out.println("Zero");
        }
    }
    
}
