import java.util.*;
public class StringPractice {
    public static void main(String[] args)
    {
       Scanner scan =new Scanner(System.in);
       String num;
       System.out.println("Enter a number");
       num=scan.nextLine();
       if(num.matches("[01]+"))
       {
        System.out.println("redix 2");
       }
       else if(num.matches("[0-7]+"))
       {
        System.out.println("redix 8");
       }
       else if (num.matches("[0-9]+"))
       {
        System.out.println("redix 10");
       }
       else if (num.matches("[0-9A-F]+"))
       {
        System.out.println("redix 8");
    }
    else
    {
        System.out.println("not a number");
    }
    }
   
    }
    
}
