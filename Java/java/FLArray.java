import java.util.Scanner;
class FLArray
{
	public static void main(String args[])
	{
		int a[] = new int[10];
		int i, fl;
		Scanner scr = new Scanner(System.in);
		for (i=0;i<10 ;i++ )
		{
			System.out.print("Value = ");
			a[i] = scr.nextInt();
		}
		fl = a[0];
		for (i = 1;i<10 ;i++ )
		{
			if(fl<a[i])
			{
				fl = a[i];
			}
		}
		System.out.print("FL = "+fl);
	}
		
}