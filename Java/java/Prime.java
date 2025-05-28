//program to CHECK prime numer
import java.util.Scanner;
class Prime
{
	public static void main(String args[]){
		Scanner scr = new Scanner(System.in);
		int n,half;
		System.out.print("Enter number: ");
		n = scr.nextInt();
		half = n/2;
		for (int i = 1;i<=half ;i++ )
		{
			if(n%i == 0){
				return false;
			}else{
				System.out.println("number is NOT PRIME");
			}
		}
		
	}
}