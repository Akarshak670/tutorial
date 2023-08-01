

import java.util.Scanner;

public class akarshak06 {
    public static void main(String[] args) {
        Byte m1 , m2 ,m3;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter dsa marks");
        m1=sc.nextByte();
        System.out.println("Enter OS marks");
        m2=sc.nextByte();
        System.out.println("Enter DBMS marks");
        m3=sc.nextByte();
        float avg = (m1+m2+m3)/3.0f;
        if(avg>=40 && m1>=33 && m2>=33 && m3>=33){
            System.out.println("congrates avg is  "+avg); 
        }
        else{
            System.out.println("better luck next time avg is "+avg);
        }
    }
}