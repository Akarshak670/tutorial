import java.util.Scanner;
public class SCCondition 
{
 public static void main(String[] args)
 {
    int n1,n2,n3;
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter the marks of 3 subjects");
    n1=sc.nextInt();
    n2=sc.nextInt();
    n3=sc.nextInt();
    float avg=(float)(n1+n2+n3)/3;
    if (avg>70){
        System.out.println("GRADE A");
    }
    else if(avg<70 && avg>50)
    {
        System.out.println("GRADE B");
    }
    else if(avg<50 && avg>40)
    {
        System.out.println("GRADE C");
    }
    else{
        System.out.println("GRADE D");
    }
}
}