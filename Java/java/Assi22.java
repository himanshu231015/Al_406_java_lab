import java.util.Scanner;
import java.math.*;
public class Assi22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Name n = new Name();
        n.info();
        int num, result = 0;
        System.out.print("enter number : ");
        num = sc.nextInt();
        for(int i = 1;i<=num;i++){
        result += Math.pow(i, 2);
        }

        System.out.printf("sum of series upto %d elements is   "+result,num);
    }
}
