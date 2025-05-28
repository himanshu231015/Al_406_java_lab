import java.util.Scanner;
class FSLArray
{
	public static void main(String args[])
	{
		int i, fl, sl;
		int a[] = new int[10];
		Scanner scr = new Scanner (System.in);
		for (i = 0;i<10;i++ )
		{
			System.out.print("Value = ");
			a[i] = scr.nextInt();
		}
		fl = a[0];
		sl = a[1];
		for (i = 1;i<10 ;i++)
		{
			if(fl<a[i])
			{
				sl = fl;
				fl = a[i];
			}else
				if(sl<a[i] && a[i]!=fl)
			{
				sl = a[i];
			}
		}
		System.out.println("Fl = " +fl);
		System.out.println("SL = "+sl);
	}
}