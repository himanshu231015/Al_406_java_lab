import java.util.Scanner;

public class Assi12 {
    public static void main(String[] args){
        Scanner scr = new Scanner(System.in);
        Name n = new Name();
        n.info();
        int num1,num2;
        System.out.print("Enter num1 : ");
        num1 = scr.nextInt();
        System.out.print("Enter num2 : ");
        num2 = scr.nextInt();

        num1 = num1+num2;
        num2 = num1-num2;
        num1 = num1-num2;
        System.out.printf("num1 = %d \num2 = %d",num1,num2);
    }
}
