import java.util.*;
public class website 
{
 public static void main (String[] args)   
{
 Scanner scan=new Scanner(System.in);
 System.out.println("Enter a URL");
 String url=scan.nextLine();
 String protocol=url.substring(0,url.indexOf(":"));
 if(protocol.equals("http"))
 System.out.println("hyper text transfer protocol");
 else if(protocol.equals("ftp"))
 System.out.println("file transfer protocol");
 String ext=url.substring(url.lastIndexOf(".")+2);
 if(ext.equals("com"))
 {
    System.out.println("Commercial");
 }
 else if (ext.equals("org"))
 {
    System.out.println("Organization");
 }
 else if (ext.equals("net"))
 {
    System.out.println("Network");
 }
}
}
