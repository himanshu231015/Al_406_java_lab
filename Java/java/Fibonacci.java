//Program to print fibonaaci sequence.
import java.util.Scanner;
public class Fibonacci
{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n,i,f=-1,t=1,p;
		System.out.print("Enter number uptill the series is requiered : ");
		n = sc.nextInt();
		
		for (i=0 ; i<n ; i++ )
		{
			p = f+t;                          
			System.out.print(" "+p);        
			f = t;                            
			t = p;                            
		} 
		
	}
}
