import java.util.Scanner;
class ArrDemo
{
	public static void main(String args[])
	{
		int a[] = new int[10];
		int i, sm = 0;
		Scanner scr = new Scanner(System.in);
		for(i=0;i<10;i++)
		{
			System.out.print("Value = ");
			a[i] = scr.nextInt();
			sm = sm + a[i];
		}
		System.out.println("Sum = " +sm);
	}
}