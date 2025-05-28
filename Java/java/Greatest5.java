//find greatest number among given 5 numbers
import java.util.Scanner;
public class Greatest5 {
    public static void main(String[] args) {
        int n1,n2,n3,n4,n5,greatest;
        Scanner scr = new Scanner(System.in);
        System.out.print("Enter number 1 : ");
        n1 = scr.nextInt();
        System.out.print("Enter number 2 : ");
        n2 = scr.nextInt();
        System.out.print("Enter number 3 : ");
        n3 = scr.nextInt();
        System.out.print("Enter number 4 : ");
        n4 = scr.nextInt();
        System.out.print("Enter number 5 : ");
        n5 = scr.nextInt();
        greatest = (n1>n2 && n1>n3 && n1>n4 && n1>n5)?n1:(n2>n3 && n2>n4 && n2>n5)?n2:(n3>n4 && n3>n5)?n3:(n4>n5)?n4:n5;
        System.out.println("greatest number is: "+greatest);
    }
}