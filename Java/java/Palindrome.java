//program to check number is palindrome or not
import java.util.Scanner;
class Palindrome
{
	public static void main(String args[]){
		Scanner scr = new Scanner(System.in);
		int n,rv=0,t,initial;
		
		System.out.print("enter number to check palindrome or not : ");
		n = scr.nextInt();
		initial = n;
		
		while(n != 0){
			t = n%10;
			rv = (rv*10)+t;
			n = n/10;
		}
		
		if ( initial == rv){
			System.out.println("number is PALINDROME NUMBER.");
		}else{
			System.out.println("numver is NOT PALINDROME.");
		}
		
	}
}