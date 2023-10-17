import java.util.*;
public class switch1 
{
 public static void main (String[] args)
 {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter a day number");
    int day=scan.nextInt();
    switch (day)
    {
    case 1:System.out.println("MON");
          break;
    case 2:System.out.println("Tue");   
         break;
         case 3:System.out.println("WED");   

         default:System.out.println("Invalid");
         break;
    }
 }   
}
