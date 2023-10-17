import java .util.*;
public class xyzz{
    public static void main(String[] args) {
        Scanner scan=new Scanner (System.in);
        System.out.println("Enter  number");
        int n =scan.nextInt();
        int m=n;
        int r;
        int rev=0;
        while(n>0)
        {
         r=n%10;
         rev=rev*10+r;
         n=n/10;
        }
       
       if(rev==m)
       {
       System.out.println("yes");
       }
       else
       {
        System.out.println("not");
       }
    }  

}
 