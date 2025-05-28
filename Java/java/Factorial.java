//program to find factorial of given number
import java.util.Scanner;
public class Factorial
{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int num,fact = 1;
		System.out.print("enter number to find factorial : ");   
		num = sc.nextInt();
		
		for (int i=num ;i>=1 ;i-- )
		{
			fact *= i;
		}
		System.out.println("factorial : " +fact);
	}
}