import java.math.*;
import java.util.Scanner;
public class Assi13{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x,exp,y;
        x = sc.nextInt();
        y = Math.pow(x, 2) * 3*x -7;
        System.out.println(y);
        System.out.println(++x);
        System.out.println(x++);
        y = x++ + ++x;
        System.out.println(y);
    }
}